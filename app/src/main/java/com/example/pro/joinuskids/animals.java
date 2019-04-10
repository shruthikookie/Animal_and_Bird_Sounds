package com.example.pro.joinuskids;

import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.provider.Settings;

import java.io.File;

public class animals extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);


        ImageView imageView1 = findViewById(R.id.imageView1);
        registerForContextMenu(imageView1);

        ImageView imageView2 = findViewById(R.id.imageView2);
        registerForContextMenu(imageView2);

        ImageView imageView3 = findViewById(R.id.imageView3);
        registerForContextMenu(imageView3);

        ImageView imageView4 = findViewById(R.id.imageView4);
        registerForContextMenu(imageView4);

        ImageView imageView5 = findViewById(R.id.imageView5);
        registerForContextMenu(imageView5);

        ImageView imageView6 = findViewById(R.id.imageView6);
        registerForContextMenu(imageView6);

        ImageView imageView7 = findViewById(R.id.imageView7);
        registerForContextMenu(imageView7);

        ImageView imageView8 = findViewById(R.id.imageView8);
        registerForContextMenu(imageView8);

        ImageView imageView9 = findViewById(R.id.imageView9);
        registerForContextMenu(imageView9);

        ImageView imageView10 = findViewById(R.id.imageView10);
        registerForContextMenu(imageView10);

        ImageView imageView21 = findViewById(R.id.imageView21);
        registerForContextMenu(imageView21);

        ImageView imageView22 = findViewById(R.id.imageView22);
        registerForContextMenu(imageView22);

        ImageView imageView23 = findViewById(R.id.imageView23);
        registerForContextMenu(imageView23);

        ImageView imageView24 = findViewById(R.id.imageView24);
        registerForContextMenu(imageView24);

        ImageView imageView25 = findViewById(R.id.imageView25);
        registerForContextMenu(imageView25);



        Button btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(this);

        Button btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(this);

        Button btn3 = (Button)findViewById(R.id.button3);
        btn3.setOnClickListener(this);

        Button btn4 = (Button)findViewById(R.id.button4);
        btn4.setOnClickListener(this);

        Button btn5 = (Button)findViewById(R.id.button5);
        btn5.setOnClickListener(this);

        Button btn6 = (Button)findViewById(R.id.button6);
        btn6.setOnClickListener(this);

        Button btn7 = (Button)findViewById(R.id.button7);
        btn7.setOnClickListener(this);

        Button btn8 = (Button)findViewById(R.id.button8);
        btn8.setOnClickListener(this);

        Button btn9 = (Button)findViewById(R.id.button9);
        btn9.setOnClickListener(this);

        Button btn10 = (Button)findViewById(R.id.button10);
        btn10.setOnClickListener(this);

        Button btn21 = (Button)findViewById(R.id.button21);
        btn21.setOnClickListener(this);

        Button btn22 = (Button)findViewById(R.id.button22);
        btn22.setOnClickListener(this);

        Button btn23 = (Button)findViewById(R.id.button23);
        btn23.setOnClickListener(this);

        Button btn24 = (Button)findViewById(R.id.button24);
        btn24.setOnClickListener(this);

        Button btn25 = (Button)findViewById(R.id.button25);
        btn25.setOnClickListener(this);
        Button btn26 = (Button)findViewById(R.id.button26);
        btn26.setOnClickListener(this);

    }
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.button1:
                mp = MediaPlayer.create(this, R.raw.dog);
                break;
            case R.id.button2:
                mp = MediaPlayer.create(this, R.raw.cat);
                break;
            case R.id.button3:
                mp = MediaPlayer.create(this, R.raw.cow);
                break;
            case R.id.button4:
                mp = MediaPlayer.create(this, R.raw.pig);
                break;
            case R.id.button5:
                mp = MediaPlayer.create(this, R.raw.bear);
                break;
            case R.id.button6:
                mp = MediaPlayer.create(this, R.raw.lion);
                break;
            case R.id.button7:
                mp = MediaPlayer.create(this, R.raw.elephant);
                break;
            case R.id.button8:
                mp = MediaPlayer.create(this, R.raw.puppy);
                break;
            case R.id.button9:
                mp = MediaPlayer.create(this, R.raw.lamb);
                break;
            case R.id.button10:
                mp = MediaPlayer.create(this, R.raw.monkey);
                break;
            case R.id.button21:
                mp = MediaPlayer.create(this, R.raw.snakehiss2);
                break;
            case R.id.button22:
                mp = MediaPlayer.create(this, R.raw.delfina);
                break;
            case R.id.button23:
                mp = MediaPlayer.create(this, R.raw.frog);
                break;
            case R.id.button24:
                mp = MediaPlayer.create(this, R.raw.fox);
                break;
            case R.id.button25:
                mp = MediaPlayer.create(this, R.raw.squirrel);
                break;
            case R.id.button26:
                mp = MediaPlayer.create(this, R.raw.mosquito);
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
