package com.example.clase1.clase1;



        import android.content.Intent;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.ImageView;
        import android.widget.RadioButton;

        import com.example.clase1.clase1.Model.Person;


public class ActividadP extends AppCompatActivity {

    int sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_p);
    }

    public void btnImprimir(View v) {

        ImageView vv ;
        android.widget.EditText nombre   = (EditText) findViewById(R.id.nombre);
        EditText apellido   = (EditText) findViewById(R.id.apellido);
        Intent intent = new Intent(this, Actividadsec.class);
        Person p = new Person(nombre.getText().toString(),apellido.getText().toString(),sexo);
        Person p2 = new Person("Juana","Perez",2);
        intent.putExtra("pers1",p);
        intent.putExtra("pers2",p2);
        startActivity(intent);
    }


    public void eligeSexo(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.masculino:
                if (checked)
                    //Toast.makeText(this,"Masculino", Toast.LENGTH_SHORT).show();
                    sexo = Person.MASCULINO;
                break;
            case R.id.femenino:
                if (checked)
                    //Toast.makeText(this,"Femenino", Toast.LENGTH_SHORT).show();
                    sexo = Person.FEMENINO;
                break;
        }
    }


    public void btnInvisible(View v) {
        EditText apellido   = (EditText) findViewById(R.id.apellido);
        apellido.setVisibility(View.INVISIBLE);
        EditText nombre   = (EditText) findViewById(R.id.nombre);
        nombre.setTextColor(Color.BLUE);
    }
    public void btnGone(View v) {
        EditText apellido   = (EditText) findViewById(R.id.apellido);
        apellido.setVisibility(View.GONE);
    }

}