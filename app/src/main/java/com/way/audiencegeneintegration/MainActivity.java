package com.way.audiencegeneintegration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.gene.GeneApp;
import com.gene.GeneListeners.GeneCallbacks;

public class MainActivity extends AppCompatActivity implements GeneCallbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Replace with your keys
        GeneApp.initialize(MainActivity.this, "YOUR_API_KEY",  "USER_GOOGLE_ADVERTISER_ID");
        GeneApp.start("testing transaction");
        GeneApp.age(26, "number");
        GeneApp.gender("male", "string");
        GeneApp.locationCity("hyderabad", "string");
        GeneApp.locationState("telengana", "string");
        GeneApp.locationCountry("India", "string");
        GeneApp.zipcode(500090, "number");
        GeneApp.add("from", "hyderabad", "string");
        GeneApp.add("to", "vijayawada", "string");
        GeneApp.add("b_date", "30-05-2019", "date");
        GeneApp.add("b_time", "123123123", "number");
        GeneApp.send();
    }

    @Override
    public void onDataSuccess(String message, String data) {
        Log.i("onDataSuccess",""+data);
        Toast.makeText(this,message.toString(),2000).show();

    }

    @Override
    public void onDataFailure(String message) {
        Log.i("onDataFailure",""+message);
        Toast.makeText(this,message.toString(),2000).show();
    }
}
