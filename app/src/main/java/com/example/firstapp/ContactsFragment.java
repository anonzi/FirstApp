package com.example.firstapp;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.text.TextWatcher;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;




import android.util.Log;

public class ContactsFragment extends android.app.Fragment   {


    protected static final String ACTIVITY_TAG="MyAndroid";

    private Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.contacts_fragment, container, false);

//        btn = (Button) view.findViewById(R.id.push_button);
//
//        //监听button事件
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(ContactsFragment.ACTIVITY_TAG, "=============================");
//                Intent intent = new Intent(getActivity(), ChatActivity.class);
//                startActivity(intent);
//            }
//        });

        return view;
    }


}