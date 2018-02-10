package com.example.techtron.simplelistview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
    //create a simple reference, remember the method findViewById always helps you bring a view from xml to java
    ListView l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //youll probably get an error blah blah blah incopatable types, so you simply alt enter change to android widget listview and that does the automatic typecast for you
        l = (ListView) findViewById(R.id.listView);
    }
}
