package com.zein.zeinyt10;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class MyIntro extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance(
                "GZeinNumer",
                "Bir",
                R.drawable.ic_local_bar,
                Color.parseColor("#51e2b7")));
        addSlide(AppIntroFragment.newInstance(
                "GZeinNumer",
                "Cafe",
                R.drawable.ic_local_cafe,
                Color.parseColor("#8c50e3")));
        addSlide(AppIntroFragment.newInstance(
                "GZeinNumer",
                "Dining",
                R.drawable.ic_local_dining,
                Color.parseColor("#4fd7ff")));
        addSlide(AppIntroFragment.newInstance(
                "GZeinNumer",
                "Grocery",
                R.drawable.ic_local_grocery,
                Color.parseColor("#00bcd4")));

        showStatusBar(false);
        setBarColor(Color.parseColor("#333639"));
        setSeparatorColor(Color.parseColor("#2196f3"));

    }

    @Override
    public void onDonePressed() {
        Toast.makeText(this, "Buka project ZeinYT10",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        Toast.makeText(this, "On Skip CLicked",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSlideChanged() {
        Toast.makeText(this, "On Slide Changed ",Toast.LENGTH_SHORT).show();
    }
}
