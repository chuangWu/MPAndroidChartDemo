package chuang.mpandroidchartdemo.activity;

import android.support.v7.app.ActionBarActivity;

import chuang.mpandroidchartdemo.R;

/**
 * Created by N-251 on 2015/2/9.
 */
public class BaseActivity extends ActionBarActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.move_left_in_activity, R.anim.move_right_out_activity);
    }
}
