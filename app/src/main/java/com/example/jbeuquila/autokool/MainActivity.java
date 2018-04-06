package com.example.jbeuquila.autokool;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonAnnuler = (Button) findViewById(R.id.btnAnnuler);
        buttonAnnuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView txtUser;
                txtUser = (TextView) findViewById(R.id.utilisateur);
                TextView txtMdp;
                txtMdp = (TextView) findViewById(R.id.mdp);

                txtUser.setText("");
                txtMdp.setText("");

            }
        });

        final Button btnValider = (Button) findViewById(R.id.btnValider);
        btnValider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Selection.class);
                startActivity(intent);

            }
        });

        final Button btnConnection = (Button) findViewById(R.id.btnSeConnecter);
        btnConnection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final EditText ETxtNom = (EditText) findViewById(R.id.utilisateur);
                final TextView Txtnom = (TextView) findViewById(R.id.userTitle);
                final EditText ETxtMdp = (EditText) findViewById(R.id.mdp);
                final TextView Txtmdp = (TextView) findViewById(R.id.mdpTitle);
                final ImageView ImgAcc = (ImageView) findViewById(R.id.imInvisible);

                btnConnection.setVisibility(View.GONE);
                ImgAcc.setVisibility(View.GONE);
                Txtnom.setVisibility(View.VISIBLE);
                ETxtNom.setVisibility(View.VISIBLE);
                Txtmdp.setVisibility(View.VISIBLE);
                ETxtMdp.setVisibility(View.VISIBLE);
                btnValider.setVisibility(View.VISIBLE);
                buttonAnnuler.setVisibility(View.VISIBLE);

            }
        });
    }
}
