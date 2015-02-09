package chuang.mpandroidchartdemo.activity;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

import chuang.mpandroidchartdemo.R;
import chuang.mpandroidchartdemo.fragment.MultipleChartsFragment;

/**
 * Created by N-251 on 2015/2/9.
 */
public class MultipleChartsActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_multiple_charts);
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        MultipleChartsFragment multipleChartsFragment = new MultipleChartsFragment();
        fragmentTransaction.add(R.id.content, multipleChartsFragment);
        fragmentTransaction.commit();
    }
}
