package com.proto.aaronlee.farmerpayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by Connor Haas on 2/23/2017.
 */

public class FarmerFragment extends Fragment implements View.OnClickListener{


    public EditText farmerName;

    public String farmerNameString;


    public FarmerFragment()
    {
        //empty ctr
    }

    public static FarmerFragment newInstance(String param1, String param2) {
        FarmerFragment fragment = new FarmerFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //initializes the view and the objects inside the view
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        Log.d("fragFarm", "Here1");
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_farmer, container, false);


        farmerName = (EditText) rootView.findViewById(R.id.editText_FarmerName);

        Button commitName = (Button) rootView.findViewById(R.id.button_Name);
        commitName.setOnClickListener(this);

        Log.d("fragFarm", "Here2");

        return rootView;

    }

    public void onClick(View view)
    {
        //System.out.println("Will it work?!?");
        Log.d("fragFarm", "Here");
        farmerNameString = farmerName.getText().toString();
        Log.d("FragFarm", farmerName.getText().toString());
    }


}
