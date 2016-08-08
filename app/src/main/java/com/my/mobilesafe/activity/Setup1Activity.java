package com.my.mobilesafe.activity;

import android.content.Intent;
import android.os.Bundle;

import com.my.mobilesafe.R;

public class Setup1Activity extends BaseSetupActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup1);
    }

    @Override
    protected void showNextPage() {
        Intent intent = new Intent(this, Setup2Activity.class);
        startActivity(intent);

        finish();
        overridePendingTransition(R.anim.next_in_anim, R.anim.next_out_anim);
    }

    @Override
    protected void showPrePage() {

    }
}
