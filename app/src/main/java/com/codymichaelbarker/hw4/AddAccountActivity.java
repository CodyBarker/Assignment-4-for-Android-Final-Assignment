package com.codymichaelbarker.hw4;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by CodyO on 4/15/2018.
 */

public class AddAccountActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_account_activity);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        AddAccountFragment f = new AddAccountFragment();
        ft.add(R.id.AddFrag, f, "");
        ft.commit();
    }
}
