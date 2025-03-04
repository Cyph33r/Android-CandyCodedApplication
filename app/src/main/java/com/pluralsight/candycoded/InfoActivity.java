package com.pluralsight.candycoded;

import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Uri uri = Uri.parse("android.resource://com.codeschool.candycoded/" + R.drawable.store_front);
        ImageView candyStoreImageView = (ImageView)findViewById(R.id.image_view_candy_store);
        Picasso.with(this).
                load(uri).
                into(candyStoreImageView);


    }
public void createMapIntent(@NonNull View view){
   Uri uri = Uri.parse("geo:0,0?q=618 E South St Orlando, FL 32801");
   Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
   mapIntent.setPackage("com.google.android.apps.maps");
   ComponentName result = mapIntent.resolveActivity(getPackageManager());
   if(result != null)
       startActivity(mapIntent);
}
public void createPhoneIntent(View view){
        Intent dial = new Intent(Intent.ACTION_DIAL);
        dial.setData(Uri.parse("tel:0123456789"));
        startActivity(dial);
}

    // ***
    // TODO - Task 2 - Launch the Google Maps Activity
    // ***

    // ***
    // TODO - Task 3 - Launch the Phone Activity
    // ***

}
