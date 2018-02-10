package com.example.techtron.simplelistview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
    //create a simple reference, remember the method findViewById always helps you bring a view from xml to java
    ListView l;
    //data source
    String[] days={"Sunday", "Monday", "Tuesday", "Wenesday", "Thursday", "Friday", "Saturday", "Sunday"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //youll probably get an error blah blah blah incopatable types, so you simply alt enter change to android widget listview and that does the automatic typecast for you
        l = (ListView) findViewById(R.id.listView);
        //the list view is made up of two parts one part takes data one part displays the data, the adapter is responsible for taking the data and put it in a single view
        //array adapter that reads a type string, three parameters that you have to give to your adapter
        //context, defines how a single row should appear in your list view, data
        //android has many premade layouts defined and they are in android.R.layout.<define>
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 , days);
        //set the adapter, hey listview heres the guy who is actually responsible for setting the listview its called the adapter
        l.setAdapter(adapter);
    }
}
