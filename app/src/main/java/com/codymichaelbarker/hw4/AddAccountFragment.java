package com.codymichaelbarker.hw4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by CodyO on 4/16/2018.
 */

public class AddAccountFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View fragmentRootView = inflater.inflate(R.layout.add_account_fragment, container, false);
        final EditText name= fragmentRootView.findViewById(R.id.AccountEditText);
        final EditText bal = fragmentRootView.findViewById(R.id.BalanceEditText);



        Button buttonAddNewAccount = fragmentRootView.findViewById(R.id.Savebutton);
        buttonAddNewAccount.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                BankAccountList.getInstance().addAccount(new BankAccount(
                        name.getText().toString(),
                        Double.parseDouble(bal.getText().toString())));
                getActivity().finish();
            }
        });

        return fragmentRootView;
    }

}
