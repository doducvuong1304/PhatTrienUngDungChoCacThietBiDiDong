package com.kingbean.baitap1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnGoTo2; // anh xa button 2
    Button btnGoTo1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manhinhchinh);

        btnGoTo2 = (Button)findViewById(R.id.mh2); // bat su kien theo id cua button 2
        btnGoTo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh2= new Intent(MainActivity.this, ManHinh2.class);
                startActivity(mh2); // start su kien
            }
        });

        btnGoTo1 = (Button)findViewById(R.id.mh1); // bat su kien theo id cua button 1
        btnGoTo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh1= new Intent(MainActivity.this, ManHinh1.class);
                startActivity(mh1); // start su kien
            }
        });

    }
}
