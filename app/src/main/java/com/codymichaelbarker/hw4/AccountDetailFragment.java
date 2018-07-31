package com.codymichaelbarker.hw4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by CodyO on 4/15/2018.
 */

public class AccountDetailFragment extends Fragment {
    private EditText accName;
    private EditText accBal;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmentRootView = inflater.inflate(R.layout.account_detail_fragment, container, false);

        accName = fragmentRootView.findViewById(R.id.AccountEditText);
        accBal = fragmentRootView.findViewById(R.id.BalanceEditText);


        Intent i = getActivity().getIntent();
        String acc = i.getStringExtra("acc");
        String bal = i.getStringExtra("bal");

        if(acc!=null)
        {
            accName.setText(acc);
            accBal.setText(bal);
        }

        return fragmentRootView;
    }

    public void onSelectedAccountSetValues(BankAccount ba) {
        accName.getText().clear();
        accBal.getText().clear();
        accName.setText(ba.getName());
        String showBalance = String.format("%.2f", ba.getBalance());
        accBal.setText(showBalance);
    }

}