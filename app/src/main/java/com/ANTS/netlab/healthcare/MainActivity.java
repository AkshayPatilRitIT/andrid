package com.ANTS.netlab.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t;


    private void RunAnimation()
    {

    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Thread thread=new Thread()
        {
            @Override
            public void run() {
                Animation a = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scal);
                a.reset();
                TextView tv = (TextView) findViewById(R.id.textView);
                tv.clearAnimation();
                tv.startAnimation(a);
                try {

                    sleep(4000);
                    Intent i=new Intent(getApplicationContext(),Home_Page.class);
                    startActivity(i);

                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();

    }

}
