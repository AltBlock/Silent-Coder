package com.example.roshan.able_world.Account;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.roshan.able_world.Account.Fragments.LoginFragment;
import com.example.roshan.able_world.Account.Fragments.ResetPasswordFragment;
import com.example.roshan.able_world.Account.Fragments.SignupFragment;
import com.example.roshan.able_world.R;

public class AccountActivity extends AppCompatActivity implements LoginFragment.OnFragmentInteractionListener,SignupFragment.OnFragmentInteractionListener{

    Fragment fragment;
    FragmentManager fragmentManager;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fragmentManager = getSupportFragmentManager();
        fragment = new LoginFragment();
        fragmentManager.beginTransaction().replace(R.id.mainContainer, fragment).commit();



    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
