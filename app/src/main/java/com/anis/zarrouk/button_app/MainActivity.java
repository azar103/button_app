package com.anis.zarrouk.button_app;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnTouchListener{


    private Button b = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button)findViewById(R.id.btn);
        b.setOnTouchListener(this);


    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Button bouton = (Button)v;
        int largeur =  v.getWidth();
        int hauteur = v.getHeight();
        float x = event.getX();
        float y = event.getY();
        bouton.setTextSize(Math.abs(x - largeur /2) + Math.abs(y - hauteur/2));
        return true;
    }
}
