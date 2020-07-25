package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.Touch;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private String login;
    private String password;
    private TextView textView1;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textView2);
        textView2 = findViewById(R.id.textView10);

        button = findViewById(R.id.button2);

        Bundle bundle = getIntent().getExtras();
        Intent intent = getIntent();

        if(intent.getStringExtra("email") != null && intent.getStringExtra("password") != null){
            textView1.setText(bundle.getString("email"));
            textView2.setText(bundle.getString("password"));
        }
        button.setOnClickListener(v ->{
            Intent intent1 = new Intent(MainActivity.this,Editor.class);
            intent1.putExtra("email", textView1.);
            intent1.putExtra("password", bundle.getString("password"));
            startActivity(intent1);
        });

    }
}
