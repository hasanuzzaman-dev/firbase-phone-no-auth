package com.hasan.firebasephoneauth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class VerifyPhoneNoActivity extends AppCompatActivity {

    private Button verifyBtn;
    private EditText otpET;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_phone_no);

        verifyBtn = findViewById(R.id.verifyBtn);
        otpET = findViewById(R.id.otpET);
        progressBar = findViewById(R.id.progressBarID);

        String phoneNo = getIntent().getStringExtra("phoneNon");
        sendVerificationCodeToUser(phoneNo);


    }

    private void sendVerificationCodeToUser(String phone) {

    }
}