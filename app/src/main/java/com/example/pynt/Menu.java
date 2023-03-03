package com.example.pynt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

public class Menu extends AppCompatActivity {
     public TextView textview = findViewById(R.id.textviewsmile);
    //handler to send message if runable is done
     Handler objhandler = new Handler(){

        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            textview.setText("Have a Great Day!");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void ImageButtonClicked(View v){


        Runnable objrun = new Runnable() { //to make a background thread
            @Override
            public void run() {
                try{
                    Thread.sleep(5000); //stop app for 5seconds
                }catch(Exception e){
                    e.printStackTrace();
                }
                objhandler.sendEmptyMessage(0);
            }
        };
        Thread startthread = new Thread(objrun);
        startthread.start();

        //when image button is clicked the message will show after running the thread.
        textview.setText("Just Smile and the Rest Will Follow.");
    }
}