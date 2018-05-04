package com.example.jbeuquila.autokool;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.jbeuquila.autokool.DAO.FormuleDAO;
import com.example.jbeuquila.autokool.DTO.Formules;

import java.util.ArrayList;
import java.util.List;

public class Mission2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission2);

        final Button btnGO = (Button) findViewById(R.id.btnChoixFormule);
        btnGO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mission2.this, DetailsFormule.class);
                startActivity(intent);

            }
        });

        final Button btnQuitter = (Button) findViewById(R.id.btnRetourFormule);
        btnQuitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mission2.this, Selection.class);
                startActivity(intent);

            }
        });

        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.lesFormulesAbonnements);


        final FormuleDAO formuleAcces = new FormuleDAO(this);
        final Formules lesFormules = new Formules();

        Cursor curseur = formuleAcces.getToutesLesFormules();
        lesFormules.setFormules(curseur);

        // Spinner Drop down elements
        List<String> formules = new ArrayList<String>();

         for (int i=0; i < lesFormules.size(); i++){
             formules.add(lesFormules.getFormule(i).getLibelle());
         }
         formules.add("it worked");

        /*
        formules.add("Classique");
        formules.add("Coopérative");
        formules.add("Liberté");
        */
        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, formules);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);


    }


    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

}