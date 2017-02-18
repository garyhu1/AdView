package com.garyhu.adview.actyivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.garyhu.adview.R;
import com.garyhu.adview.widget.AdCountView;

public class MainActivity extends AppCompatActivity {

    private AdCountView adCountView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adCountView = (AdCountView) findViewById(R.id.ad_view);
        adCountView.setTextSize(12);
        adCountView.start();
    }
}
