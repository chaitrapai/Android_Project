package com.example.chaitradinesh.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    TextView t,t1,t2;
    String num="4086661229";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView)findViewById(R.id.address);
        t.setOnClickListener(this);

        t2 = (TextView)findViewById(R.id.website);
        t2.setOnClickListener(this);

        t1 = (TextView)findViewById(R.id.contact);
        t1.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.address:
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=3275 Stevens Creek Blvd, San Jose, CA 95117");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
                break;

            case  R.id.contact:
                String url_1 = "http://eat24hrs.com/restaurants/order2/menu.php?id=53469";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url_1));
                startActivity(i);
                break;
            case R.id.website:
                String url = "http://www.yeganehbakery.com/";
                Intent i_1 = new Intent(Intent.ACTION_VIEW);
                i_1.setData(Uri.parse(url));
                startActivity(i_1);
                break;
            }
    }
}