package com.example.pynt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class forgotpassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);

        EditText username =  (EditText) findViewById(R.id.username);
        EditText newpassword = (EditText) findViewById(R.id.newpassword);
        EditText retypepassword = (EditText) findViewById(R.id.retypepassword);

        MaterialButton passchangedone = (MaterialButton) findViewById(R.id.passchangedonebtn);

        passchangedone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backtoSignIn();
            }
        });
    }
    public void backtoSignIn(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}