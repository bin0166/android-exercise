package com.rainsong.toutiao.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rainsong.toutiao.R;

/**
 * Created by maxliaops on 17-1-6.
 */

public class UserCentralFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab_usercentral, container, false);
        return rootView;
    }
}
