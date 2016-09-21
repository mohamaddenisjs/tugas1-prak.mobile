package com.nbs.app.tugas1;

/**
 * Created by DENIS on 21/09/2016.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
public class KelasHalaman1 extends Activity {
    Button btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman1);
        btnBack = (Button) findViewById(R.id.btnKembali);
        btnBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //memanggil activity_main
                Intent in = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(in); //memulai intent
            }
        });
    }
}

