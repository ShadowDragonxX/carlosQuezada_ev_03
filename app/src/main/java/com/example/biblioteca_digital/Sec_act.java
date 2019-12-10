package com.example.biblioteca_digital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Sec_act extends AppCompatActivity {
    private TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_act);
        txt1=findViewById(R.id.textView);
    }
    public void incidencia(View view)
    {
        Toast.makeText(getBaseContext(), "Tarjeta SD", Toast.LENGTH_SHORT).show();
        txt1.setText("Vulnerabilidad de almacenamiento\n externo");

    }
    public void incidenciaDos(View view)
    {
        Toast.makeText(getBaseContext(), "Descargar datos de HTTP", Toast.LENGTH_SHORT).show();
        txt1.setText("Vulnerabilidad de validacion de\n entrada WEBVIEW");
    }
}
