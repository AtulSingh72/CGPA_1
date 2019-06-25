package com.example.cgpa;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class IntroActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addSlide(AppIntroFragment.newInstance("1st step", "Enter your branch", R.drawable.bran, Color.rgb(8,148,208)));
        addSlide(AppIntroFragment.newInstance("2nd step", "Enter your semester", R.drawable.sem, Color.rgb(8,148,208)));
        addSlide(AppIntroFragment.newInstance("3rd step", "Enter your marks", R.drawable.num, Color.rgb(8,148,208)));
        addSlide(AppIntroFragment.newInstance("4th step", "Get your CGPA", R.drawable.mar, Color.rgb(8,148,208)));
        showSkipButton(true);
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent = new Intent(IntroActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent = new Intent(IntroActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
