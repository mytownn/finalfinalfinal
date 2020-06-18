package com.example.village;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class win extends AppCompatActivity {
//파일이름 win 말고 failed
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.win);
    }
    public void onBackPressed() {
//뒤로가기 금지
    }
    public void storage(View view) {
        startActivity(new Intent(getApplication(), itembox.class));
        finish();
    }
}

