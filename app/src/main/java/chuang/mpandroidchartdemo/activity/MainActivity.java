package chuang.mpandroidchartdemo.activity;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import chuang.mpandroidchartdemo.R;


public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent i = null;
        switch (v.getId()) {
            case R.id.btn_1:
                i = new Intent(this, ChartBarActivity.class);
                break;
            case R.id.btn_2:
                i = new Intent(this, ChartPieActivity.class);
                break;
            case R.id.btn_3:
                i = new Intent(this, MultipleChartsActivity.class);
                break;
        }
        startActivity(i);
        overridePendingTransition(R.anim.move_right_in_activity,R.anim.move_left_out_activity);
    }
}
