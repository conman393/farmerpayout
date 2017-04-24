package com.proto.aaronlee.farmerpayout;

import android.support.v4.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Connor Haas on 2/27/2017.
 */

public class ConsignmentFragment extends ListFragment implements View.OnClickListener{

    private FragmentChangeListener fragmentChangeListener;
    private String[] info;
    private String unitString;
    private String pppString;
    private String soldByString;

    TextView totPrice = null;
    Button commitButton = null;

    EditText units = null;
    EditText ppp = null;
    EditText soldBy = null;
    EditText name= null;

    public ConsignmentFragment() {
        // Required empty public constructor
    }


    public static ConsignmentFragment newInstance(String param1, String param2) {
        ConsignmentFragment fragment = new ConsignmentFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void onClick(View view)
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_listviewconsignment, container, false);

        MyAdapter myAdapter = new
                MyAdapter(getContext(),
                R.layout.fragment_consignment,
                info);
        setListAdapter(myAdapter);


        return rootView;
    }

    private class MyAdapter extends ArrayAdapter<String> implements View.OnClickListener {
        private Context context;
        private int resource;
        private String[] information;

        public MyAdapter(Context context,
                         int resource,
                         String[] objects) {
            super(context, resource, objects);
            this.context = context;
            this.resource = resource;
            this.information = objects;
        }
        @Override
        public View getView(int position,
                            View convertView,
                            ViewGroup parent) {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            if(convertView == null)
            {
                convertView = inflater.inflate(R.layout.fragment_consignment,null);
            }
            //TODO
            name= (EditText)
                    convertView.findViewById(R.id.editText_name);
            TextView date=(TextView)
                    convertView.findViewById(R.id.textView_date);

            totPrice = (TextView)
                    convertView.findViewById(R.id.textView_totPrice);

            units = (EditText) convertView.findViewById(R.id.editText_units);
            ppp = (EditText) convertView.findViewById(R.id.editText_ppp);
            soldBy = (EditText) convertView.findViewById(R.id.editText_soldby);

            Spinner crop = (Spinner) convertView.findViewById(R.id.spinner_crops);
            String[] crops = new String[]{"Daikon radish", "Potato" ,"Sweet Potato", "Tomatillo Eggplant (Kermit)","Tomato (slicing)","Snake Gourd",
                    "Eggplant (African)", "Summer Squash (tatume)", "Peppers (demo)", "Bitter Melon", "Eggplant (bea or small)", "Louka",
                    "Okra", "Loofa Gourd", "Long Bean", "Oregano", "Thyme", "Carrots (bulk)", "Cherry Tomatoes", "Cucumber", "Eggplant (long purple)",
                    "green beans/ dragon tongue", "Molokhia", "bean leaves", "carrots (bunched)", "Thai chili", "Solanum Greens", "Pumpkin Shoots",
                    "Beets", "Salad Turnips", "Amaranth", "Spring Mix", "Cilantro", "Shelling Peas", "Parsley", "Daikon", "Collards", "Indian Mustard"};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_dropdown_item, crops);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            crop.setAdapter(adapter);

            commitButton = (Button) convertView.findViewById(R.id.button_commit);
            commitButton.setOnClickListener(this);
            //Picasso.with(context).load(activities[position].getImageURL()).into(image);


            return convertView;
        }

        @Override
        public void onClick(View v) {

            unitString = units.getText().toString();
            pppString = ppp.getText().toString();
            soldByString = soldBy.getText().toString();

        }
    }

}
