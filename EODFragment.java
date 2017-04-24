package com.proto.aaronlee.farmerpayout;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;

/**
 * Created by Connor Haas on 2/27/2017.
 */

public class EODFragment extends ListFragment implements View.OnClickListener {

    private String[] items;
    public EODFragment() {
        // Required empty public constructor
    }


    public static EODFragment newInstance(String param1, String param2) {
        EODFragment fragment = new EODFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_listvieweod, container, false);

        MyAdapter myAdapter = new
                MyAdapter(getContext(),
                R.layout.fragment_eod,
                items);
        setListAdapter(myAdapter);


        return rootView;
    }

    @Override
    public void onClick(View v) {

    }

    private class MyAdapter extends ArrayAdapter<String> implements AdapterView.OnItemClickListener{
        private Context context;
        private int resource;
        private String[] menuItems = new String[]{"Input Farmer", "Input Product"};

        public MyAdapter(Context context,
                         int resource,
                         String[] menuItems) {
            super(context, resource);
            this.context = context;
            this.resource = resource;
            this.menuItems = menuItems;

        }
        @Override
        public View getView(int position,
                            View convertView,
                            ViewGroup parent) {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if(convertView == null)
            {
                convertView = inflater.inflate(R.layout.fragment_eod,null);
            }

            Button menuItemButtons = (Button) convertView.findViewById(R.id.button_menu);

            menuItemButtons.setText(menuItems[position]);


            return convertView;
        }

        public void onItemClick()
        {

        }

    }

}
