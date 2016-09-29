package com.example.aking.mobilecmddemocontentfull;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.contentful.java.cda.CDAClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CDAClient client = CDAClient.builder()
                .setSpace("0sp0e3hwz99j")
                .setToken("0da6e54bf34a46bfd74e59e1d945e0b34fad38e9403d983bdb8c826c27872183")
                .build();
    }


}
