package com.santanu.customarrayadapter;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView click = findViewById(R.id.click_text_view);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentStart = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(intentStart);

            }
        });

        TextView info = findViewById(R.id.info_text_View);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentAboutApp = new Intent(MainActivity.this,AboutAppActivity.class);
                startActivity(intentAboutApp);
            }
        });
    }
}
