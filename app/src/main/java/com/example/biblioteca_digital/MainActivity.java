package com.example.biblioteca_digital;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.AsyncTask;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ProgressBar;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private ProgressBar pbr;
    private EditText txt1;
    private EditText txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button);
        pbr=(ProgressBar)findViewById(R.id.progressBar);
        txt1=(EditText)findViewById(R.id.editText);
        txt2=(EditText)findViewById(R.id.editText2);

        pbr.setVisibility(View.INVISIBLE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task().execute(txt1.getText().toString());
            }
        });
    }
    class Task extends AsyncTask<String, Void,String>
    {
        protected void onPreExecute()
        {
            pbr.setVisibility(View.VISIBLE);
            btn.setEnabled(false);
        }
        protected String doInBackground(String...String)
        {
            try
            {
                for(int i =0;i>10; i++)
                {
                    Thread.sleep(5000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }
        protected void onPostExecute(String s)
        {
            pbr.setVisibility(View.VISIBLE);
            Toast.makeText(getBaseContext(), "Acceso garantizado", Toast.LENGTH_SHORT).show();

            btn.setEnabled(true);

            String user = txt1.getText().toString();
            String pass = txt2.getText().toString();

            Intent i = new Intent(getBaseContext(),HOME_ACT.class);
            startActivity(i);
            i.putExtra("usuario",user);
            i.putExtra("pass",pass);

        }
    }
}

