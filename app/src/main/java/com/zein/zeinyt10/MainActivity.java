package com.zein.zeinyt10;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.prefs.PreferenceChangeEvent;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                SharedPreferences getPreferences = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
                boolean isFirstStart = getPreferences.getBoolean("firstStart",true);
                if(isFirstStart){

                    startActivity(new Intent(MainActivity.this,MyIntro.class));
                    SharedPreferences.Editor e = getPreferences.edit();

                    //Active line 31 to make looping gone

                    //e.putBoolean("firstStart",false);
                    e.apply();
                }
            }
        });

        thread.start();


    }
}
