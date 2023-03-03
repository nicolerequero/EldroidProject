package com.example.pynt;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Registration extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        final EditText fullname = findViewById(R.id.inputfullname);
        final EditText regemailaddress = findViewById(R.id.inputregemailaddress);
        final EditText regpassword = findViewById(R.id.inputregpassword);
        final EditText regcontactnumber = findViewById(R.id.inputregcontactnumber);
        final EditText regaddress = findViewById(R.id.inputregaddress);
        final TextView textviewtologin = findViewById(R.id.tologin);
        final MaterialButton registerbtn = findViewById(R.id.registerbtn);

//        textviewtologin.setOnClickListener(v -> {
//            backtosignIn();
//            finish();
//        });

        registerbtn.setOnClickListener(v -> {

            //get value of edit txt
            final String edittxtfullname = fullname.getText().toString();
            final String edittxtregemailaddress = regemailaddress.getText().toString();
            final String edittxtregpassword = regpassword.getText().toString();
            final String edittxtregcontactnumber = regcontactnumber.getText().toString();
            final String edittxtregaddress = regaddress.getText().toString();


            mAuth.createUserWithEmailAndPassword(edittxtregemailaddress, edittxtregpassword)
                    .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                        @Override
                        public void onSuccess(AuthResult authResult) {

                            startActivity(new Intent(Registration.this, MainActivity.class));
                            db.collection("Register Users").document(FirebaseAuth.getInstance().getUid())
                                    .set(new UserModel(edittxtfullname, edittxtregemailaddress, edittxtregpassword, edittxtregcontactnumber, edittxtregaddress));

                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(Registration.this, "Error." + e, Toast.LENGTH_SHORT).show();
                        }
                    });

        });
    }
}
//    }
//            check if users put credentials.
//            if (edittxtfullname.isEmpty() || edittxtregusername.isEmpty() || edittxtregpassword.isEmpty() || edittxtregcontactnumber.isEmpty() || edittxtregaddress.isEmpty() || edittxtregemailaddress.isEmpty()) {
//                Toast.makeText(Registration.this, "Please fill in all fields.", Toast.LENGTH_SHORT).show();
//
//            } else {
//                regUser(edittxtfullname, edittxtregusername, edittxtregpassword, edittxtregcontactnumber, edittxtregemailaddress, edittxtregaddress);
//            }
//

//    public void backtosignIn(){
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
//    }


