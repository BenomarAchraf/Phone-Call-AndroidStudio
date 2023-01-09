package com.example.application_benomar;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    Button explicite_btn ,implicite_btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        // set the view to show
        setContentView(R.layout.activity_main2);
        // instentate buttons

        explicite_btn = (Button) findViewById(R.id.button1) ;
        implicite_btn =(Button) findViewById(R.id.button2) ;

        explicite_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 =new Intent(getBaseContext(),MainActivity3.class);
                intent1.putExtra("lastname" ,"Benomar") ;
                intent1.putExtra("firstName" ,"Achraf") ;
                startActivity(intent1);
            }
        });

        implicite_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Intent.ACTION_VIEW) ;
                intent.setData(Uri.parse("http://inpt.ac.ma")) ;
                startActivity(intent);
            }
        });

    }
}