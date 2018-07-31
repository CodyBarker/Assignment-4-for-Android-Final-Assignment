package com.codymichaelbarker.hw4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * Created by CodyO on 3/26/2018.
 */

public class MainFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View fragmentRootView = inflater.inflate(R.layout.main_fragment, container, false);


        ImageButton buttonAccount = fragmentRootView.findViewById(R.id.AccountimageButton);
        buttonAccount.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent dataIntent = new Intent(getActivity(), AccountListActivity.class);
                startActivity(dataIntent);
            }
        });


        ImageButton buttonInfo = fragmentRootView.findViewById(R.id.InfoimageButton);
        buttonInfo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent dataIntent = new Intent(getActivity(), AppInfoActivity.class);
                startActivity(dataIntent);
            }
        });

        return fragmentRootView;
    }
}

