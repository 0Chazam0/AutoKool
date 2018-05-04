package com.example.jbeuquila.autokool;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by PJ on 06/04/2018.
 */

public class MySQLiteHelper extends SQLiteOpenHelper{
    private static final int versionBD = 1 ;
    private static final String nomBD = "autokool.db" ;

    private static String requeteFormule = "CREATE TABLE FORMULE(CODEFORMULE INTEGER NOT NULL, LIBELLEFORMULE VARCHAR(255) NULL, FRAISADHESION DOUBLE NULL, TARIFMENSUEL DOUBLE NULL, PARTSOCIALE DOUBLE NULL, DEPOTGARANTIE DOUBLE NULL, CAUTION DOUBLE NULL, PRIMARY KEY (CODEFORMULE));";

    private static String requeteFormuleDrop = "DROP TABLE IF EXISTS FORMULE;";

    private static String requeteTrancheHoraire = "CREATE TABLE TRANCHE_HORAIRE (CODETRANCHEH INTEGER NOT NULL, DUREE DOUBLE NULL, PRIMARY KEY (CODETRANCHEH));";

    private static String requeteTrancheHoraireDrop = "DROP TABLE IF EXISTS TRANCHE_HORAIRE;";

    private static String requeteTrancheKM = "CREATE TABLE TRANCHE_KM (CODETRANCHEKM INTEGER NOT NULL, MINKM INTEGER NULL, MAXKM INTEGER NULL, PRIMARY KEY (CODETRANCHEKM));";

    private static String requeteTrancheKMDrop = "DROP TABLE IF EXISTS TRANCHE_KM;";

    private static String requeteCategorieVehicule = "CREATE TABLE CATEGORIE_VEHICULE (CODECATEG CHAR(1) NOT NULL, LIBELLECATEG VARCHAR(255) NULL, PRIMARY KEY (CODECATEG));";

    private static String requeteCategorieVehiculeDrop = "DROP TABLE IF EXISTS CATEGORIE_VEHICULE;";

    private static String requeteFacturer1 = "CREATE TABLE FACTURER1 (CODETRANCHEH INTEGER NOT NULL, CODECATEG CHAR(1) NOT NULL, CODEFORMULE INTEGER NOT NULL, TARIFH DOUBLE NULL, PRIMARY KEY (CODETRANCHEH, CODECATEG, CODEFORMULE), FOREIGN KEY (CODETRANCHEH) REFERENCES TRANCHE_HORAIRE (CODETRANCHEH), FOREIGN KEY (CODECATEG) REFERENCES CATEGORIE_VEHICULE (CODECATEG), FOREIGN KEY (CODEFORMULE) REFERENCES FORMULE (CODEFORMULE));";

    private static String requeteFacturer1Drop = "DROP TABLE IF EXISTS FACTURER1;";

    private static String requeteFacturer2 = "CREATE TABLE FACTURER2 (CODETRANCHEKM INTEGER NOT NULL, CODECATEG CHAR(1) NOT NULL, CODEFORMULE INTEGER NOT NULL, TARIFKM DOUBLE NULL, PRIMARY KEY (CODETRANCHEKM, CODECATEG, CODEFORMULE), FOREIGN KEY (CODETRANCHEKM) REFERENCES TRANCHE_KM (CODETRANCHEKM), FOREIGN KEY (CODECATEG) REFERENCES CATEGORIE_VEHICULE (CODECATEG), FOREIGN KEY (CODEFORMULE) REFERENCES FORMULE (CODEFORMULE));";

    private static String requeteFacturer2Drop = "DROP TABLE IF EXISTS FACTURER2;";

    private static String requeteAbonne = "CREATE TABLE ABONNE (NUMABONNE INTEGER NOT NULL, NOM VARCHAR , PRENOM VARCHAR , DATENAISSANCE DATE , RUE VARCHAR , CODEPOSTAL VARCHAR(5) , TEL VARCHAR(10) , TELMOBILE VARCHAR(10) , EMAIL VARCHAR , NUMPERMIS VARCHAR(12) , LIEUPERMIS VARCHAR , DATEPERMIS DATE , PAIEMENTADHESION BOOLEAN , PAIEMENTCAUTION BOOLEAN , RIBFOURNI BOOLEAN, CODEFORMULE INTEGER NOT NULL, PRIMARY KEY (NUMABONNE), FOREIGN KEY (CODEFORMULE) REFERENCES FORMULE (CODEFORMULE));";

    private static String requeteAbonneDrop = "DROP TABLE IF EXISTS ABONNE;";

    private static String requeteTypeVehicule = "CREATE TABLE TYPE_VEHICULE (CODETYPEV INTEGER NOT NULL , LIBELLETYPEV VARCHAR , NBPLACES INTEGER(2), AUTOMATIQUE BOOLEAN , CODECATEG CHAR(1) , FOREIGN KEY (CODECATEG) REFERENCES CATEGORIE_VEHICULE(CODECATEG));";

    private static String requeteTypeVehiculeDrop = "DROP TABLE IF EXISTS TYPE_VEHICULE;";

    private static String requeteVehicule = "CREATE TABLE VEHICULE (NUMVEHICULE INTEGER NOT NULL , KILOMETRAGE INTEGER , NIVEAUESSENCE INTEGER(2), CODETYPEV INTEGER, NUMSTATION INTEGER, PRIMARY KEY (NUMVEHICULE), FOREIGN KEY (CODETYPEV) REFERENCES TYPE_VEHICULE(CODETYPEV), FOREIGN KEY (NUMSTATION) REFERENCES STATION(NUMSTATION));";

    private static String requeteVehiculeDrop = "DROP TABLE IF EXISTS VEHICULE;";

    private static String requeteStation = "CREATE TABLE STATION (NUMSTATION INTEGER NOT NULL , LIEUSTATION VARCHAR , VILLESTATION VARCHAR, CPSTATION VARCHAR);";

    private static String requeteStationDrop = "DROP TABLE IF EXISTS STATION;";

    private static String requeteCategorieVehiculeInsert = "INSERT INTO CATEGORIE_VEHICULE VALUES " +
            "('S', 'Citadines')," +
            "('M', 'Polyvalentes'), " +
            "('L', 'Ludospaces, Utilitaires, Familiales');";

    private static String requeteFormuleInsert = "INSERT INTO FORMULE VALUES " +
            "(1, 'Coopérative', 0, 8.5, 500, 0, 600)," +
            "(2, 'Classique', 0, 10, 0, 150, 600)," +
            "(3, 'Liberté', 0, 0, 0, 150, 600);";

    private static String requeteTrancheHoraireInsert = "INSERT INTO TRANCHE_HORAIRE VALUES " +
            "(1, 1)," +
            "(2, 24)," +
            "(3, 168);";

    private static String requeteTrancheKMInsert = "INSERT INTO TRANCHE_KM VALUES " +
            "(1, 0, 50)," +
            "(2, 50, 200)," +
            "(3, 200, 0);";

    private static String requeteFacturer1Insert = "INSERT INTO FACTURER1 VALUES " +
            "(1, 'S', 1, 2.04)," +
            "(2, 'S', 1, 24.50)," +
            "(3, 'S', 1, 135)," +
            "(1, 'M', 1, 2.30)," +
            "(2, 'M', 1, 27.60)," +
            "(3, 'M', 1, 152)," +
            "(1, 'L', 1, 2.56)," +
            "(2, 'L', 1, 30.80)," +
            "(3, 'L', 1, 170)," +
            "(1, 'S', 2, 2.40)," +
            "(2, 'S', 2, 28.80)," +
            "(3, 'S', 2, 159)," +
            "(1, 'M', 2, 2.70)," +
            "(2, 'M', 2, 32.40)," +
            "(3, 'M', 2, 179)," +
            "(1, 'L', 2, 3)," +
            "(2, 'L', 2, 36)," +
            "(3, 'L', 2, 198)," +
            "(1, 'S', 3, 3)," +
            "(2, 'S', 3, 36)," +
            "(3, 'S', 3, 198)," +
            "(1, 'M', 3, 3.38)," +
            "(2, 'M', 3, 40.60)," +
            "(3, 'M', 3, 224)," +
            "(1, 'L', 3, 3.70)," +
            "(2, 'L', 3, 45)," +
            "(3, 'L', 3, 248);";

    private static String requeteFacturer2Insert = "INSERT INTO FACTURER2 VALUES " +
            "(1, 'S', 1, 0.30)," +
            "(2, 'S', 1, 0.21)," +
            "(3, 'S', 1, 0.16)," +
            "(1, 'M', 1, 0.30)," +
            "(2, 'M', 1, 0.18)," +
            "(3, 'M', 1, 0.13)," +
            "(1, 'L', 1, 0.34)," +
            "(2, 'L', 1, 0.21)," +
            "(3, 'L', 1, 0.16)," +
            "(1, 'S', 2, 0.35)," +
            "(2, 'S', 2, 0.24)," +
            "(3, 'S', 2, 0.18)," +
            "(1, 'M', 2, 0.35)," +
            "(2, 'M', 2, 0.21)," +
            "(3, 'M', 2, 0.15)," +
            "(1, 'L', 2, 0.40)," +
            "(2, 'L', 2, 0.24)," +
            "(3, 'L', 2, 0.18)," +
            "(1, 'S', 3, 0.44)," +
            "(2, 'S', 3, 0.30)," +
            "(3, 'S', 3, 0.23)," +
            "(1, 'M', 3, 0.44)," +
            "(2, 'M', 3, 0.27)," +
            "(3, 'M', 3, 0.19)," +
            "(1, 'L', 3, 0.50)," +
            "(2, 'L', 3, 0.30)," +
            "(3, 'L', 3, 0.23);";

    public MySQLiteHelper(Context context) {
        super(context, nomBD, null, versionBD);
    }

    public void remplirBDD(SQLiteDatabase db){
        db.execSQL(requeteFormuleInsert);
        db.execSQL(requeteCategorieVehiculeInsert);
        db.execSQL(requeteTrancheHoraireInsert);
        db.execSQL(requeteTrancheKMInsert);
        db.execSQL(requeteFacturer1Insert);
        db.execSQL(requeteFacturer2Insert);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(requeteFormule);
        db.execSQL(requeteAbonne);
        db.execSQL(requeteStation);
        db.execSQL(requeteCategorieVehicule);
        db.execSQL(requeteTypeVehicule);
        db.execSQL(requeteVehicule);
        db.execSQL(requeteTrancheHoraire);
        db.execSQL(requeteTrancheKM);
        db.execSQL(requeteFacturer1);
        db.execSQL(requeteFacturer2);
        remplirBDD(db);
        Log.d("created", "Base de données créée");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.d("Test", "Passage dans onUpgrade");


    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.d("Test", "Passage dans onDowngrade");
        db.execSQL(requeteFacturer2Drop);
        db.execSQL(requeteFacturer1Drop);
        db.execSQL(requeteTrancheKMDrop);
        db.execSQL(requeteTrancheHoraireDrop);
        db.execSQL(requeteVehiculeDrop);
        db.execSQL(requeteTypeVehiculeDrop);
        db.execSQL(requeteCategorieVehiculeDrop);
        db.execSQL(requeteStationDrop);
        db.execSQL(requeteAbonneDrop);
        db.execSQL(requeteFormuleDrop);
        onCreate(db);
    }
}
