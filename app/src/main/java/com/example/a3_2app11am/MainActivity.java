package com.example.a3_2app11am;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void rotateLeft(View view){
        ImageView buff1 = findViewById(R.id.imageViewBuff1);
        buff1.animate().rotation(-180f).setDuration(1000);

    }
    private boolean isVisible = true;
    public void changeVisibility(View view){
        ImageView buff1 = findViewById(R.id.imageViewBuff1);
        Button buttonImage = findViewById(R.id.buttonImage);

                if(isVisible){
                    buff1.animate().alpha(0f).setDuration(2000);
                    isVisible = false;
                    buttonImage.setText("SHOW");
                }
                else{
                    buff1.animate().alpha(1f).setDuration(2000);
                    isVisible = true;
                    buttonImage.setText("HIDE");
                }
    }
}