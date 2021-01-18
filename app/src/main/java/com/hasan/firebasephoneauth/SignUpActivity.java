package com.hasan.firebasephoneauth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    private EditText nameET;
    private EditText phoneET;
    private Button signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        nameET = findViewById(R.id.editTextTextPersonName);
        phoneET = findViewById(R.id.editTextPhone);
        signUpBtn = findViewById(R.id.signUpBtn);

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNo = phoneET.getText().toString();

                Intent intent = new Intent(getApplicationContext(),VerifyPhoneNoActivity.class);
                intent.putExtra("phoneNo",phoneNo);
                startActivity(intent);
            }
        });
    }
}