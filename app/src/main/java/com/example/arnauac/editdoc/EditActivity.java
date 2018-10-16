package com.example.arnauac.editdoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditActivity extends AppCompatActivity {

    private EditText edit_box;
    private Button btn_save;
    private TextView edit_text_box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        final Intent intent = getIntent();
        String text = intent.getStringExtra("text");
        String LargeText = intent.getStringExtra("largeText");

        edit_box = findViewById(R.id.editBox);
        edit_text_box = findViewById(R.id.edit_text_box);
        btn_save = findViewById(R.id.btn_Save);

        edit_box.setText(text);
        edit_text_box.setText(LargeText);

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent data = new Intent();
                data.putExtra("text", edit_box.getText().toString());
                data.putExtra("largeText", edit_text_box.getText().toString());
                setResult(RESULT_OK, data);
                finish();
            }
        });
    }
}
