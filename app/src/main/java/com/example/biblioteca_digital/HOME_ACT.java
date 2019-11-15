package com.example.biblioteca_digital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class HOME_ACT extends AppCompatActivity {
    private ViewFlipper vf;
    private int[] images = {R.drawable.a, R.drawable.b, R.drawable.c};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__act);
        vf =(ViewFlipper)findViewById(R.id.slider);

        //Se iteran las instrucciones del slider
        for(int i =0; i<images.length; i++)
        {
            Instrucciones(images[i]);
        }
    }
    public void Instrucciones(int i)
    {
        ImageView view = new ImageView(this);
        view.setBackgroundResource(i);

        vf.addView(view);
        vf.setFlipInterval(3000);
        vf.setAutoStart(true);

        //Sentido del slider
        vf.setInAnimation(this,android.R.anim.slide_in_left);
        vf.setOutAnimation(this,android.R.anim.slide_out_right);
    }

    public void info(View v)
    {
        Intent i = new Intent(this, INFO_ACT.class);
        startActivity(i);
    }
    public void libros(View view)
    {
        Intent i = new Intent(this,libros_act.class);
        //revival fahrenheit tesla
        String libors[] = {"Fahrenheit","Revival","Tesla"};
        i.putExtra("libros",libors);
        startActivity(i);

    }
}
