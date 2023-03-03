package com.example.pynt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    EditText editusername, editpassword;
    MaterialButton signinbtn, signupbtn;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        editusername = findViewById(R.id.regusername);
        editpassword = findViewById(R.id.regpassword);
        signinbtn = findViewById(R.id.signinbtn);
        signupbtn = findViewById(R.id.signupbtn);
        TextView forgotpassword = findViewById(R.id.forgotpassword);


        signinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String regusername, regpassword;
                regusername = String.valueOf(editusername.getText());
                regpassword = String.valueOf(editpassword.getText());

                mAuth.signInWithEmailAndPassword(regusername, regpassword)
                        .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {
                                Toast.makeText(MainActivity.this, "log in successfully.", Toast.LENGTH_SHORT).show();
                                signIn();
                                finish();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(MainActivity.this, "Error" + e, Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });
        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signupReg();
            }
        });
        forgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forgotPass();
            }
        });
    }




    public void signIn(){
        Intent intent = new Intent(this,DashboardActivity.class);
        startActivity(intent);
    }
    public void signupReg(){
        Intent intent = new Intent(this,Registration.class);
        startActivity(intent);
    }
    public void forgotPass(){
        Intent intent = new Intent(this, forgotpassword.class);
        startActivity(intent);
    }

}