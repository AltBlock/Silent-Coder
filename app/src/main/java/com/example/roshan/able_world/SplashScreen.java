package com.example.roshan.able_world;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.roshan.able_world.Account.AccountActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

//        final User user=new User(Splash.this);

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashScreen.this, AccountActivity.class);
                startActivity(intent);

//                if (user.getUsername()!=""){
//                    Intent mainIntent = new Intent(Splash.this, loggedinActivity.class);
//                    Splash.this.startActivity(mainIntent);
//                    overridePendingTransition(R.anim.fadein, R.anim.fadeout);
//                    Splash.this.finish();
//                }else{
//                    //lot loggedin
//
//                    Intent mainIntent = new Intent(Splash.this, NonLoginActivity.class);
//                    Splash.this.startActivity(mainIntent);
//                    overridePendingTransition(R.anim.fadein, R.anim.fadeout);
//                    Splash.this.finish();
//                }


                /* Create an Intent that will start the Menu-Activity. */


            }
        }, 1000);

    }
}
