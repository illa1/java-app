package com.example.clor_click;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FastColor extends AppCompatActivity {
    private TextView scoreText, timerText, targetColorText;
    private Button startButton, resetButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fast_color);
    }
    public void onColorClick(View view){

    }

    private void startGame(){

    }

    private void resetGame(){

    }

}
