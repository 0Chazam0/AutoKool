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

    private static String requeteTrancheHoraire = "CREATE TABLE TRANCHE_HORAIRE (CODETRANCHEH CHAR(1) NOT NULL, DUREE DOUBLE NULL, PRIMARY KEY (CODETRANCHEH));";

    private static String requeteTrancheHoraireDrop = "DROP TABLE IF EXISTS TRANCHE_HORAIRE;";

    private static String requeteTrancheKM = "CREATE TABLE TRANCHE_KM (CODETRANCHEKM INTEGER NOT NULL, MINKM INTEGER NULL, MAXKM INTEGER NULL, PRIMARY KEY (CODETRANCHEKM));";

    private static String requeteTrancheKMDrop = "DROP TABLE IF EXISTS TRANCHE_KM;";

    private static String requeteCategorieVehicule = "CREATE TABLE CATEGORIE_VEHICULE (CODECATEG CHAR(1) NOT NULL, LIBELLECATEG VARCHAR(255) NULL, PRIMARY KEY (CODECATEG));";

    private static String requeteCategorieVehiculeDrop = "DROP TABLE IF EXISTS CATEGORIE_VEHICULE;";

    private static String requeteFacturer1 = "CREATE TABLE FACTURER1 (CODETRANCHEH CHAR(1) NOT NULL, CODECATEG CHAR(1) NOT NULL, CODEFORMULE INTEGER NOT NULL, TARIFH DOUBLE NULL, PRIMARY KEY (CODETRANCHEH, CODECATEG, CODEFORMULE), FOREIGN KEY (CODETRANCHEH) REFERENCES TRANCHE_HORAIRE (CODETRANCHEH), FOREIGN KEY (CODECATEG) REFERENCES CATEGORIE_VEHICULE (CODECATEG), FOREIGN KEY (CODEFORMULE) REFERENCES FORMULE (CODEFORMULE));";

    private static String requeteFacturer1Drop = "DROP TABLE IF EXISTS FACTURER1;";

    private static String requeteFacturer2 = "CREATE TABLE FACTURER2 (CODETRANCHEKM INTEGER NOT NULL, CODECATEG CHAR(1) NOT NULL, CODEFORMULE INTEGER NOT NULL, TARIFKM DOUBLE NULL, PRIMARY KEY (CODETRANCHEKM, CODECATEG, CODEFORMULE), FOREIGN KEY (CODETRANCHEKM) REFERENCES TRANCHE_KM (CODETRANCHEKM), FOREIGN KEY (CODECATEG) REFERENCES CATEGORIE_VEHICULE (CODECATEG), FOREIGN KEY (CODEFORMULE) REFERENCES FORMULE (CODEFORMULE));";

    private static String requeteFacturer2Drop = "DROP TABLE IF EXISTS FACTURER2;";

    private static String requeteAbonne = "CREATE TABLE ABONNE (NUMABONNE INTEGER NOT NULL, NOM VARCHAR , PRENOM VARCHAR , DATENAISSANCE DATE , RUE VARCHAR , CODEPOSTAL VARCHAR(5) , TEL VARCHAR(10) , TELMOBILE VARCHAR(10) , EMAIL VARCHAR , NUMPERMIS VARCHAR(12) , LIEUPERMIS VARCHAR , DATEPERMIS DATE , PAIEMENTADHESION BOOLEAN , PAIEMENTCAUTION BOOLEAN , RIBFOURNI BOOLEAN, PRIMARY KEY NUMABONNE, FOREIGN KEY (CODEFORMULE) REFERENCES FORMULE (CODEFORMULE));";

    private static String requeteAbonneDrop = "DROP TABLE IF EXISTS ABONNE;";

    private static String requeteTypeVehicule = "CREATE TABLE TYPE_VEHICULE (CODETYPEV INTEGER NOT NULL , LIBELLETYPEV VARCHAR , NBPLACES INTEGER(2), AUTOMATIQUE BOOLEAN , CODECATEG CHAR(1) , FOREIGN KEY (CODECATEG) REFERENCIES CATEGORIE_VEHICULE(CODECATEG));";

    private static String requeteTypeVehiculeDrop = "DROP TABLE IF EXISTS TYPE_VEHICULE;";

    private static String requeteVehicule = "CREATE TABLE VEHICULE (NUMVEHICULE INTEGER NOT NULL , KILOMETRAGE INTEGER , NIVEAUESSENCE INTEGER(2), CODETYPEV INTEGER, NUMSTATION INTEGER, FOREIGN KEY (CODETYPEV) REFERENCIES TYPE_VEHICULE(CODETYPEV), FOREIGN KEY (NUMSTATION) REFERENCIES STATION(NUMSTATION));";

    private static String requeteVehiculeDrop = "DROP TABLE IF EXISTS VEHICULE;";

    private static String requeteStation = "CREATE TABLE STATION (NUMSTATION INTEGER NOT NULL , LIEUSTATION VARCHAR , VILLESTATION VARCHAR, CPSTATION VARCHAR);";

    private static String requeteStationDrop = "DROP TABLE IF EXISTS STATION;";



    public MySQLiteHelper(Context context) {
        super(context, nomBD, null, versionBD);
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
