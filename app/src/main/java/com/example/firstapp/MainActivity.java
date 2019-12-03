package com.example.firstapp;


import android.support.v7.app.ActionBar;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;

import com.example.firstapp.ChatsFragment;
import com.example.firstapp.ContactsFragment;
import com.example.firstapp.MineFragment;



public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;
    private ChatsFragment fg1;
    private ContactsFragment fg2;
    private MineFragment fg3;
    private FragmentManager fragmentManager;

    private Button btnOne;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            FragmentTransaction fTransaction = getFragmentManager().beginTransaction();
            hideAllFragment(fTransaction);
            switch (item.getItemId()) {
                case R.id.navigation_chats:
                    if(fg1 == null){
                        fg1 = new ChatsFragment();
                        fTransaction.add(R.id.ly_content,fg1);
                    }else{
                        fTransaction.show(fg1);
                    }
                    fTransaction.commit();
                    return true;
                case R.id.navigation_contacts:
                    if (fg2 == null) {
                        fg2 = new ContactsFragment();
                        fTransaction.add(R.id.ly_content, fg2);
                    } else {
                        fTransaction.show(fg2);
                    }
                    fTransaction.commit();
                    return true;
                case R.id.navigation_mine:
                  if (fg3 == null) {
                      fg3 = new MineFragment();
                        fTransaction.add(R.id.ly_content, fg3);
                    } else {
                        fTransaction.show(fg3);
                    }
                    fTransaction.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);

        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        FragmentTransaction fTransaction = getFragmentManager().beginTransaction();
        fg1 = new ChatsFragment();
        fTransaction.add(R.id.ly_content, fg1);
        fTransaction.commit();

        ActionBar actionBar = getSupportActionBar();
        actionBar.show();

//        this.requestWindowFeature(getWindow().FEATURE_NO_TITLE);
//        btnOne = (Button) findViewById(R.id.button);
//
//        btnOne.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, ChatActivity.class);
//                startActivity(intent);
//            }
//        });
    }

    private void hideAllFragment(FragmentTransaction fragmentTransaction) {
        if (fg1 != null) fragmentTransaction.hide(fg1);
        if (fg2 != null) fragmentTransaction.hide(fg2);
        if (fg3 != null) fragmentTransaction.hide(fg3);
    }

}
