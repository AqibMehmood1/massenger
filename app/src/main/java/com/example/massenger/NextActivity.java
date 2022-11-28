package com.example.massenger;

import androidx.appcompat.app.AppCompatActivity;

import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class NextActivity extends AppCompatActivity {
    LocationManager locationManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SMS();
            }
        });
    }

    public void SMS(){

                EditText editTextView1=findViewById(R.id.phone_number);
                EditText editTextView2=findViewById(R.id.message);
                String ph=editTextView1.getText().toString();
                String sms=editTextView2.getText().toString();

                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(ph, null,sms, null,null);
                Toast.makeText(getApplicationContext(), "SMS sent Successfully", Toast.LENGTH_SHORT).show();
            }





    }
