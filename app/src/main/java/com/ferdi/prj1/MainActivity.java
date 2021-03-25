package com.ferdi.prj1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTampil;
    EditText edtNpm, edtNama, edtProdi, edtFakultas, edtGender, edtTelpon;
    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil = (TextView) findViewById(R.id.txtTampil);
        edtNpm = (EditText) findViewById(R.id.edtNpm);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtProdi = (EditText) findViewById(R.id.edtProdi);
        edtFakultas = (EditText) findViewById(R.id.edtFakultas);
        edtGender = (EditText) findViewById(R.id.edtGender);
        edtTelpon = (EditText) findViewById(R.id.edtTelpon);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strProdi = edtProdi.getText().toString();
                String strFakultas = edtFakultas.getText().toString();
                String strGender = edtGender.getText().toString();
                String strTelpon = edtTelpon.getText().toString();

                txtTampil.setText(strNpm + "\n" +strNama + "\n" + strProdi + "\n" + strFakultas + "\n" + strGender + "\n" + strTelpon);
            }
        });
    }
}