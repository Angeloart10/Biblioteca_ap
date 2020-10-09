package com.example.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Github_act extends AppCompatActivity {

    private Spinner spinner2;
    private TextView textView11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        String[] libros = {"Seleccione Libros", "Farenheith", "Revival", "El Alquimista"};
        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, libros);
        spinner2.setAdapter(adapt);



        textView11=(TextView)findViewById(R.id.textView11);




    }

    public void mostrar(View v){

        if(spinner2.getSelectedItem().toString().equals("Farenheith"))
        {
            textView11.setText("El valor de "+spinner2.getSelectedItem().toString()+" es de : 5000 ");
        }

        if(spinner2.getSelectedItem().toString().equals("Revival"))
        {
            textView11.setText("El valor de "+spinner2.getSelectedItem().toString()+" es de : 12000 ");
        }

        if(spinner2.getSelectedItem().toString().equals("El Alquimista"))
        {
            textView11.setText("El valor de "+spinner2.getSelectedItem().toString()+" es de : 45000 ");
        }


    }

}