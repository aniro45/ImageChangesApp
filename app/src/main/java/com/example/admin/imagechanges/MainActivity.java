package com.example.admin.imagechanges;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {

    public void ButtonPressed(View view) {


        ImageView image = (ImageView) findViewById(R.id.CatImageView);
             image.setImageResource(R.drawable.sleepycat);

    }

    void PreviousImage(View view){

        ImageView image2 = (ImageView) findViewById(R.id.CatImageView);
        image2.setImageResource(R.drawable.sittingcat);
    }



             //image.setImageResource(R.drawable.sittingcat)}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
