package com.panda.androidq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void onStorage(View v) {
        startActivity(new Intent(this, SelfSandboxStorageActivity.class));
    }

    public void onFile(View v) {
        startActivity(new Intent(this, FileActivity.class));
    }
}
