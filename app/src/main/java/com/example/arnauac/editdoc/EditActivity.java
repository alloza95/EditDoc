package com.example.arnauac.editdoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity {

    private EditText edit_box;
    private Button btn_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        Intent intent = getIntent();
        String text = intent.getStringExtra("text");

        edit_box = findViewById(R.id.editBox);
        btn_save = findViewById(R.id.btn_Save);

        edit_box.setText(text);
    }
}
