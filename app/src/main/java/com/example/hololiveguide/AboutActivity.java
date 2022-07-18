package com.example.hololiveguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {
    private TextView textView;
    private ImageButton mcopyEmail, mshareEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        textView = (TextView) findViewById(R.id.email);
        mcopyEmail = (ImageButton)findViewById(R.id.copy_email);
        mshareEmail = (ImageButton) findViewById(R.id.share_email);

        mcopyEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Email", textView.getText());
                clipboardManager.setPrimaryClip(clipData);

                Toast.makeText(AboutActivity.this, "Email Copied", Toast.LENGTH_SHORT).show();
            }
        });

        mshareEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, textView.getText());
                startActivity(intent);
            }
        });
    }
}