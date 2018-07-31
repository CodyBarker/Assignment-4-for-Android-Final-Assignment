package com.codymichaelbarker.hw4;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by CodyO on 3/27/2018.
 */

public class AccountListActivity extends AppCompatActivity implements AccountListFragment.selectAccountCallBack{
    AccountDetailFragment adf = new AccountDetailFragment();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int value = getResources().getConfiguration().orientation;



        //PORTRAIT
        if (value == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.account_list_activity);

            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            AccountListFragment f = new AccountListFragment();
            ft.add(R.id.AccountListFragment, f, "");
            ft.commit();


        }

        //LANDSCAPE
        else if (value == Configuration.ORIENTATION_LANDSCAPE)
        {
            setContentView(R.layout.account_list_activity);

            FragmentManager alfm = getSupportFragmentManager();
            FragmentTransaction alft = alfm.beginTransaction();
            AccountListFragment alf = new AccountListFragment();
            alft.add(R.id.AccountListFragment, alf, "");
            alft.commit();

            FragmentManager adfm = getSupportFragmentManager();
            FragmentTransaction adft = adfm.beginTransaction();

            adft.add(R.id.AccountDetailFragment, adf, "");


            adft.commit();

        }
    }


    public void onClickedAccount(BankAccount b) {
        adf.onSelectedAccountSetValues(b);
    }
}
