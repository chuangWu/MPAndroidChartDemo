package chuang.mpandroidchartdemo.activity;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

import chuang.mpandroidchartdemo.fragment.ChartBarFragment;
import chuang.mpandroidchartdemo.R;

/**
 * Created by N-251 on 2015/2/9.
 */
public class ChartBarActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chartbar);

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        ChartBarFragment chartBarFragment = new ChartBarFragment();
        fragmentTransaction.add(R.id.content, chartBarFragment);
        fragmentTransaction.commit();
    }
}
