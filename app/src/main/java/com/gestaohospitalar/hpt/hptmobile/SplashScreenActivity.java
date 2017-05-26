package com.gestaohospitalar.hpt.hptmobile;


import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class SplashScreenActivity extends AppCompatActivity {

    private GifImageView loadingGif;

    Button loginButton;
    EditText usernameEdittext;
    EditText passwordEdittext;
    TextView senhaIncorretaTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        loginButton = (Button) findViewById(R.id.loginButton);
        usernameEdittext = (EditText) findViewById(R.id.loginEditText);
        passwordEdittext = (EditText) findViewById(R.id.passEditText);
        loadingGif = (GifImageView) (findViewById(R.id.loadingGif));
        senhaIncorretaTextView = (TextView) findViewById(R.id.senhaIncorretaTextView);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginButtonClicked();

            }
        });
        loginButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        loginButton.getBackground().setColorFilter(0xe0454545, PorterDuff.Mode.SRC_ATOP);
                        loginButton.invalidate();
                        break;
                    case MotionEvent.ACTION_UP:
                        loginButton.getBackground().clearColorFilter();
                        loginButton.invalidate();
                        break;
                }
                return false;
            }
        });

    }

    public void loginButtonClicked() {

    }
}