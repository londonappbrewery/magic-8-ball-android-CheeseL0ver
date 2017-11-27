package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    final int[] ballArray = {
            R.drawable.hdpi_ball1,
            R.drawable.hdpi_ball2,
            R.drawable.hdpi_ball3,
            R.drawable.hdpi_ball4,
            R.drawable.hdpi_ball5
    };

    ArrayList<Integer> wordArray = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView eightBall = (ImageView) findViewById(R.id.image_eightBall);

        final Button askButton = (Button) findViewById(R.id.askButton);

        final TextView message = findViewById(R.id.bannerMessage);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random rand = new Random();

                int number = rand.nextInt(5);

                Log.d("Eightball",String.format("The number is: %d",number));

                eightBall.setImageResource(ballArray[number]);

                //Toggle the visibility of an object
//                if (message.getVisibility() == View.INVISIBLE)
//                {
//                    message.setVisibility(View.VISIBLE);
//                }
//                else
//                {
//                    message.setVisibility(View.INVISIBLE);
//                }
            }
        });



    }
}
