package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button askButton;

    ImageView eightBall;

    int[] ballArray = {
            R.drawable.hdpi_ball1,
            R.drawable.hdpi_ball2,
            R.drawable.hdpi_ball3,
            R.drawable.hdpi_ball4,
            R.drawable.hdpi_ball5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eightBall = (ImageView) findViewById(R.id.image_eightBall);

        askButton = askButton = (Button) findViewById(R.id.askButton);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random rand = new Random();

                int number = rand.nextInt(5);

                Log.d("Eightball",String.format("The number is: %d",number));

                eightBall.setImageResource(ballArray[number]);
            }
        });



    }
}
