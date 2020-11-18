package com.kiprotich.kangogo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    private Button gitBtn, InstaBtn, LinBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_activity);

        gitBtn = (Button) findViewById(R.id.git_btn);
        InstaBtn = (Button) findViewById(R.id.insta_btn);
        LinBtn = (Button) findViewById(R.id.lin_btn);

        // 3 buttons
        // git button
        gitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://github.com/jkangogo");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // instagram button
        InstaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://instagram.com/Joel Kiprotich");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Linkedin button
        LinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.linkedin.com/in/joel-kangogo-9668a6180/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


    }

}
