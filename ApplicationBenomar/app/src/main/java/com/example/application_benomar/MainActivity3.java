package com.example.application_benomar;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;
public class MainActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deuxieme_activite);
        Bundle extras=getIntent().getExtras();
        Toast.makeText(getApplicationContext(), "nom et prenom : " + extras.get("lastname")+
                " " +extras.get("firstName"),Toast.LENGTH_LONG).show();
    }
}