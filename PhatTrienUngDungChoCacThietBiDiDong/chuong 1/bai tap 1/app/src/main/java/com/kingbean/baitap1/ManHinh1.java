package com.kingbean.baitap1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManHinh1 extends AppCompatActivity {
    Button btnGoToMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manhinh1);

        btnGoToMain = (Button)findViewById(R.id.mhc); // bat su kien theo id cua button back
        btnGoToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mhc= new Intent(ManHinh1.this, MainActivity.class);
                startActivity(mhc); // start su kien
            }
        });
    }
}
