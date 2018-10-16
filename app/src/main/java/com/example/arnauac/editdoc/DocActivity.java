package com.example.arnauac.editdoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DocActivity extends AppCompatActivity {

    private String title = "Lorem Ipsu", text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris et purus sed nisl semper tristique a non dolor. Pellentesque tincidunt est leo, sit amet tempus nisi cursus facilisis. Nulla ornare lacinia orci, id pulvinar nunc lobortis ut. Mauris sapien nulla, tincidunt in purus fringilla, posuere hendrerit dui. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Cras non metus et quam dapibus sagittis non tincidunt ante. Aenean lorem risus, euismod et mauris eu, eleifend volutpat ante. Nam non nisl risus. Praesent blandit ligula vitae tellus semper imperdiet. Sed ultrices dolor mauris, at sodales elit mollis nec. Fusce a mi mi. Nullam eget fringilla libero.";
    private TextView title_view;
    private TextView text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc);

        title_view = findViewById(R.id.titleView);
        text_view = findViewById(R.id.textView);

        title_view.setText(title);
        text_view.setText(text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.option_edit_title:
                //TODO: Cridar EditActivity
                break;
        }
        return true;
    }
}
