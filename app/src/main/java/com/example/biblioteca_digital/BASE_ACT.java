package com.example.biblioteca_digital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class BASE_ACT extends AppCompatActivity {
    private EditText et1,et2,et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base__act);
        et1 = (EditText)findViewById(R.id.cod);
        et2= (EditText)findViewById(R.id.nombre);
        et3= (EditText)findViewById(R.id.precio);

    }
    public void añadirOrdenador(View view)
    {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"Gestion", null, 1);
        SQLiteDatabase BIBLIOTECA = admin.getWritableDatabase();

        if(!et1.getText().toString().isEmpty()&& !et2.getText().toString().isEmpty()&&!et3.getText().toString().isEmpty())
        {
            ContentValues registro = new ContentValues();
            registro.put("codigo",et1.getText().toString());
            registro.put("nombre", et2.getText().toString());
            registro.put("precio", et3.getText().toString());

            BIBLIOTECA.insert("odernadores", null, registro);
            BIBLIOTECA.close();

            Toast.makeText(this,"Se ha ingresado correctamente",Toast.LENGTH_LONG).show();
        }
    }
    public void eliminarOrdenador(View view)
    {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"Gestion", null, 1);
        SQLiteDatabase BIBLIOTECA = admin.getWritableDatabase();
            String codigo = et1.getText().toString();

            BIBLIOTECA.delete("ordenadores", "codigo= "+codigo, null);
            BIBLIOTECA.close();

            Toast.makeText(this,"Producto eliminado: "+ codigo ,Toast.LENGTH_SHORT).show();


    }
}
