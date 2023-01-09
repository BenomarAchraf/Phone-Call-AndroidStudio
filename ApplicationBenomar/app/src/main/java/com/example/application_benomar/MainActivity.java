package com.example.application_benomar;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState) ;
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "the activity is created", Toast.LENGTH_SHORT).show();
        Log.i("onCreate():" ,"activity is created");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this,"activity is started" ,Toast.LENGTH_SHORT).show();
        Log.i("onStart():" ,"activity is started ");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this,"activity is Restarted" ,Toast.LENGTH_SHORT).show();
        Log.i("onRestart():" ,"activity is Restarted ");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this,"activity is paused" ,Toast.LENGTH_SHORT).show();
        Log.i("onPause():" ,"activity is paused ");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this,"activity is stopped" ,Toast.LENGTH_SHORT).show();
        Log.i("onStop():" ,"activity is stopped ");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this,"activity is destroyed" ,Toast.LENGTH_SHORT).show();
        Log.i("onStop():" ,"activity is destroyed ");
    }
}