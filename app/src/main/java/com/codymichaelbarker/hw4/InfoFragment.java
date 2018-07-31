package com.codymichaelbarker.hw4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by CodyO on 3/27/2018.
 */

public class InfoFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View fragmentRootView = inflater.inflate(R.layout.info_fragment, container, false);
        return fragmentRootView;
    }
}