package com.example.biblioteca_digital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Github_act extends AppCompatActivity {
    private Spinner sp;
    private TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);
        sp=findViewById(R.id.spinner2);
        txt1=findViewById(R.id.textView);


        String rellenar=getIntent().getStringExtra("rellenar");
        Bundle lista=getIntent().getExtras();

        String[] arraylist = lista.getStringArray("rellenar");

        ArrayAdapter adpt = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,arraylist);
        sp.setAdapter(adpt);
    }
    public  void buscar(View view)
    {
        int Revival=22000;
        int Farenheith=7000;
        int alquimista=45000;
        String poder="El poder";
        String despertar="Despertar";
        int poderPrecio=88000;
        int despertarPrecio=156000;
        if(sp.getSelectedItem().equals("Revival"))
        {
            txt1.setText("El valor de Revival es de: "+ Revival);
        }
        else if(sp.getSelectedItem().equals("Farenheith"))
        {
            txt1.setText("El valor de Farenheith es de: "+ Farenheith);
        }
        else if (sp.getSelectedItem().equals("El alquimista"))
        {
            txt1.setText("El valro de El alquimista es de: "+ alquimista);
        }
    }

}
