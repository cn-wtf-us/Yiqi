package com.example.administrator.myapplication;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.pic);
        AnimatorSet animator = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.animator_alpha);
        animator.setTarget(imageView);
        animator.start();

    }
}
