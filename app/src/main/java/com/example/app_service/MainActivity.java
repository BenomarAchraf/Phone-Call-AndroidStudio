package com.example.app_service;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class MainActivity extends AppCompatActivity {

    // define objects for edit text and button
    EditText edittext;
    Button button;
    private static final int REQUEST_CALL_PHONE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        edittext = findViewById(R.id.editText);

        button.setOnClickListener(arg -> {
              String phone_number = edittext.getText().toString();

                Intent phone_intent = new Intent(Intent.ACTION_CALL);
                phone_intent.setData(Uri.parse("tel:" + phone_number));
            button.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    String phoneNumber = edittext.getText().toString();
                    if (!TextUtils.isEmpty(phoneNumber)) {
                        if (TextUtils.isDigitsOnly(phoneNumber)) {
                            if (phoneNumber.matches("^(06)[0-9]{8}$")) {
                                Intent dialIntent = new Intent(Intent.ACTION_CALL);
                                dialIntent.setData(Uri.parse("tel:" + phoneNumber));
                                if (ActivityCompat.checkSelfPermission(MainActivity.this,
                                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                                        requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL_PHONE);
                                    }
                                }
                                startActivity(dialIntent);
                            } else { Toast.makeText(MainActivity.this, "Votre Numéro est invalide", Toast.LENGTH_SHORT).show(); }
                        }
                    } else { Toast.makeText(MainActivity.this, "Entrer un Numéro de téléphone", Toast.LENGTH_SHORT).show(); } }}); });}}


