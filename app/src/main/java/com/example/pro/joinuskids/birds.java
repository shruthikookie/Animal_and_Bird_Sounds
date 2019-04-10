package com.example.pro.joinuskids;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class birds extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birds);

        Button btn11 = (Button)findViewById(R.id.button11);
        btn11.setOnClickListener(this);

        Button btn12 = (Button)findViewById(R.id.button12);
        btn12.setOnClickListener(this);

        Button btn13 = (Button)findViewById(R.id.button13);
        btn13.setOnClickListener(this);

        Button btn14 = (Button)findViewById(R.id.button14);
        btn14.setOnClickListener(this);

        Button btn15 = (Button)findViewById(R.id.button15);
        btn15.setOnClickListener(this);

        Button btn16 = (Button)findViewById(R.id.button16);
        btn16.setOnClickListener(this);


        Button btn17 = (Button)findViewById(R.id.button17);
        btn17.setOnClickListener(this);

        Button btn18 = (Button)findViewById(R.id.button18);
        btn18.setOnClickListener(this);

        Button btn19 = (Button)findViewById(R.id.button19);
        btn19.setOnClickListener(this);

        Button btn20 = (Button)findViewById(R.id.button20);
        btn20.setOnClickListener(this);


        Button btn26 = (Button)findViewById(R.id.button26);
        btn26.setOnClickListener(this);

        Button btn27 = (Button)findViewById(R.id.button27);
        btn27.setOnClickListener(this);

        Button btn28 = (Button)findViewById(R.id.button28);
        btn28.setOnClickListener(this);

        Button btn29 = (Button)findViewById(R.id.button29);
        btn29.setOnClickListener(this);

        Button btn30 = (Button)findViewById(R.id.button30);
        btn30.setOnClickListener(this);


    }
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.button11:
                mp = MediaPlayer.create(this, R.raw.crow);
                break;
            case R.id.button12:
                mp = MediaPlayer.create(this, R.raw.parrot);
                break;
            case R.id.button13:
                mp = MediaPlayer.create(this, R.raw.vulture);
                break;
            case R.id.button14:
                mp = MediaPlayer.create(this, R.raw.duck);
                break;
            case R.id.button15:
                mp = MediaPlayer.create(this, R.raw.geese);
                break;
            case R.id.button16:
                mp = MediaPlayer.create(this, R.raw.rooster);
                break;
            case R.id.button17:
                mp = MediaPlayer.create(this, R.raw.woodpecker);
                break;
            case R.id.button18:
                mp = MediaPlayer.create(this, R.raw.seagull);
                break;
            case R.id.button19:
                mp = MediaPlayer.create(this, R.raw.chicken);
                break;
            case R.id.button20:
                mp = MediaPlayer.create(this, R.raw.owl);
                break;
            case R.id.button26:
                mp = MediaPlayer.create(this, R.raw.kookaburra);
                break;
            case R.id.button27:
                mp = MediaPlayer.create(this, R.raw.dove);
                break;
            case R.id.button28:
                mp = MediaPlayer.create(this, R.raw.indjuk);
                break;
            case R.id.button29:
                mp = MediaPlayer.create(this, R.raw.bird_blue_jay);
                break;
            case R.id.button30:
                mp = MediaPlayer.create(this, R.raw.hawk);
                break;


            default:
                return;
        }

        mp.start();
        while (mp.isPlaying()) {
            // do nothing
        }
        mp.release();
    }
}
