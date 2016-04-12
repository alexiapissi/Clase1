package com.example.clase1.clase1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.example.clase1.clase1.Model.Person;

public class Actividadsec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividadsec);

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

        Person p = (Person)extras.getSerializable("pers1");
        Person pppp = (Person)extras.getSerializable("pers2");

        TextView nombreyapVw = (TextView)findViewById(R.id.nombreyapellido);
        TextView sexoVw = (TextView)findViewById(R.id.sexo);

        try{
            nombreyapVw.setText(p.imprimir());
        } catch (Exception e) {
            Toast.makeText(this,e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        //String sexoStr = String.valueOf(p.getSexo());
        String sexoStr;
        if (p.getSexo() == Person.FEMENINO)
            sexoStr = "Femenino";
        else
            sexoStr = "Masculino";
        sexoVw.setText(sexoStr);

    }
}

