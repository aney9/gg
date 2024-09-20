package com.example.pract2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private AppCompatButton frame, tween;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frame = findViewById(R.id.frame);
        tween = findViewById(R.id.tween);

        Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.animka1);
        frame.startAnimation(anim1);

        Animation anim2 = AnimationUtils.loadAnimation(this, R.anim.btntween);
        tween.startAnimation(anim2);

        frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Second_activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.levo, R.anim.pravo);
            }
        });

        tween.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Third_activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.perehod1, R.anim.perehod2);
            }
        });
    }
}