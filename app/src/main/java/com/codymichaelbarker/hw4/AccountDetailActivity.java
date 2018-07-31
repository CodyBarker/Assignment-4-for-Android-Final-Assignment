package com.codymichaelbarker.hw4;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by CodyO on 5/15/2018.
 */

public class AccountDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_detail_activity);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        AccountDetailFragment f = new AccountDetailFragment();
        ft.add(R.id.DetailFrag, f, "");
        ft.commit();
    }
}
