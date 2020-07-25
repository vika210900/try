package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TwoActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private EditText editText1;
    private EditText editText2;
    private TextView textView;

    private DialogFragment1 dialogFragment1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        dialogFragment1 = DialogFragment1.newInstance();

        button1 = findViewById(R.id.Enter);
        button2 = findViewById(R.id.Exit);

        editText1 = findViewById(R.id.Login);
        editText2 = findViewById(R.id.Password);

        textView = findViewById(R.id.textView18);


        button1.setOnClickListener(v ->{
            Intent intent = new Intent(TwoActivity.this,MainActivity.class);
            intent.putExtra("email", editText1.getText().toString());
            intent.putExtra("password", editText2.getText().toString());
            startActivity(intent);
        });

        textView.setOnClickListener(v -> {
            dialogFragment1.show(getSupportFragmentManager(), "dialog");
        });
    }
}
