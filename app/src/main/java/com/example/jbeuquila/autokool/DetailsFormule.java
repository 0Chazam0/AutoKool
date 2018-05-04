package com.example.jbeuquila.autokool;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.jbeuquila.autokool.DAO.Facturer1DAO;
import com.example.jbeuquila.autokool.DTO.Formules;

public class DetailsFormule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_formule);

        final Facturer1DAO facturer1Acces = new Facturer1DAO(this);
        final Formules lesFormules = new Formules();

        Cursor curseur = formuleAcces.getToutesLesFormules();
        lesFormules.setFormules(curseur);

        // données du tableau
        final String [][] lignes = {{"S", "2€", "24.5€", "135€" }, {"M", "2€", "24.5€", "135€" }};

        TableLayout table = (TableLayout) findViewById(R.id.idTable); // on prend le tableau défini dans le layout
        TableRow row; // création d'un élément : ligne
        TextView tv1,tv2,tv3,tv4; // création des cellules


        for(int i=0; i < lignes.length ; i++) {
            row = new TableRow(this); // création d'une nouvelle ligne

            tv1 = new TextView(this); // création cellule
            tv1.setText(lignes[i][0]); // ajout du texte
            tv1.setGravity(Gravity.CENTER); // centrage dans la cellule
            // adaptation de la largeur de colonne à l'écran :
            tv1.setLayoutParams( new TableRow.LayoutParams( 0, android.view.ViewGroup.LayoutParams.WRAP_CONTENT, 1 ) );

            // idem 2ème cellule
            tv2 = new TextView(this);
            tv2.setText(lignes[i][1]);
            tv2.setGravity(Gravity.CENTER);
            tv2.setLayoutParams( new TableRow.LayoutParams( 0, android.view.ViewGroup.LayoutParams.WRAP_CONTENT, 1 ) );

            // idem 3ème cellule
            tv3 = new TextView(this);
            tv3.setText(lignes[i][2]);
            tv3.setGravity(Gravity.CENTER);
            tv3.setLayoutParams( new TableRow.LayoutParams( 0, android.view.ViewGroup.LayoutParams.WRAP_CONTENT, 1 ) );

            // idem 4ème cellule
            tv4 = new TextView(this);
            tv4.setText(lignes[i][1]);
            tv4.setGravity(Gravity.CENTER);
            tv4.setLayoutParams( new TableRow.LayoutParams( 0, android.view.ViewGroup.LayoutParams.WRAP_CONTENT, 1 ) );

            // ajout des cellules à la ligne
            row.addView(tv1);
            row.addView(tv2);
            row.addView(tv3);
            row.addView(tv4);

            // ajout de la ligne au tableau
            table.addView(row);
        }
    }
}
