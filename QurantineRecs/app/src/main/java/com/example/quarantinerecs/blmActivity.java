package com.example.quarantinerecs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class blmActivity extends AppCompatActivity {
    Button btn;
    Button click;
    Button butt;
    Button me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blm);
        btn = findViewById(R.id.clickMe);
        click = findViewById(R.id.JustFloyd);
        butt = findViewById(R.id.justTaylor);
        me = findViewById(R.id.bob);
    }

    public void goToSo(View view) {
        goToUrl("https://blacklivesmatters.carrd.co/\u2029");
    }

    public void goToSu(View view) {
        goToUrl("https://www.justiceforbigfloyd.com/");
    }

    public void goToSuv(View view) {
        goToUrl("https://justiceforbreonna.org/");
    }

    public void goToYtk(View view) {
        goToUrl("https://www.blackownedbrooklyn.com/");
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent("android.intent.action.VIEW",uriUrl);
        startActivity(launchBrowser);
    }
}


