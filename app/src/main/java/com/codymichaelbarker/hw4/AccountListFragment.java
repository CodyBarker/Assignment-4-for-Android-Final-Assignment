package com.codymichaelbarker.hw4;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CodyO on 4/15/2018.
 */

public class AccountListFragment extends Fragment {
    private static ArrayList<String> AccNameList = new ArrayList<String>();
    private ArrayAdapter<String> AccListAdapter;
    private ListView bankAccountsView;
    private selectAccountCallBack callBack;



    public interface selectAccountCallBack {
        void onClickedAccount(BankAccount b);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            callBack = (selectAccountCallBack) context;
        }
        catch (Exception e) {}
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View fragmentRootView = inflater.inflate(R.layout.account_list_fragment, container, false);


        Button buttonAddNewAccount = fragmentRootView.findViewById(R.id.Addbutton);
        buttonAddNewAccount.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent dataIntent = new Intent(getActivity(), AddAccountActivity.class);
                startActivity(dataIntent);
            }
        });

        bankAccountsView = fragmentRootView.findViewById(R.id.AccountListView);
        AccListAdapter  = new ArrayAdapter<String>(getContext(), R.layout.list_view_accounts, AccNameList);

        bankAccountsView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                BankAccount ba;
                ba = (BankAccount) adapterView.getItemAtPosition(i);

                if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                    Intent intent = new Intent(getActivity(), AccountDetailActivity.class);
                    intent.putExtra("acc", ba.getName());
                    intent.putExtra("bal", Double.toString(ba.getBalance()));
                    startActivity(intent);
                }
                else
                {
                    callBack.onClickedAccount(ba);
                }


            }
        });

        AccListAdapter.notifyDataSetChanged();
        bankAccountsView.setAdapter(AccListAdapter);
        return fragmentRootView;
    }

@Override
    public void onResume() {
        super.onResume();
        bankAccountsView.findViewById(R.id.AccountListView);
        final List<BankAccount> BankAccArrayList = BankAccountList.getInstance().getInternalList();
        final ArrayAdapter<BankAccount> accountArrayAdapter = new ArrayAdapter<BankAccount>(getActivity(), R.layout.list_view_accounts, BankAccArrayList);
        bankAccountsView.setAdapter(accountArrayAdapter);
        accountArrayAdapter.notifyDataSetChanged();
    }

}



