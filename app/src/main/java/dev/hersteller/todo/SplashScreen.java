package dev.hersteller.todo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // This method will be executed once timer is over
                Intent i  =  new Intent(SplashScreen.this, HomeScreen.class);
                startActivity(i);
                finish();
            }
        }, 3000);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
