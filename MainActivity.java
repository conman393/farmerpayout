package com.proto.aaronlee.farmerpayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements FragmentChangeListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fr = new FarmerFragment();
        Bundle args = new Bundle();
        fr.setArguments(args);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.activity_main, fr);
        fragmentTransaction.commit();

    }

    @Override
    public void changeFragment(int id) {
//        switch(id) {
//            case (R.id.imageButton_checkYes):
//                loadQuestFragment();
//                break;
//        }

    }

}
