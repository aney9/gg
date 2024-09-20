package com.example.pract2;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Second_activity extends AppCompatActivity {

    private AppCompatButton nazad;
    private ImageView anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        anim = findViewById(R.id.anim);
        nazad = findViewById(R.id.nazad);

        AnimationDrawable frameAnim = (AnimationDrawable) anim.getDrawable();

        frameAnim.start();

        Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.nazadbtn1);
        nazad.startAnimation(anim1);

        nazad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}