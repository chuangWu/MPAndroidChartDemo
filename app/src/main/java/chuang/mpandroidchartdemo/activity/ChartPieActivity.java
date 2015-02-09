package chuang.mpandroidchartdemo.activity;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

import chuang.mpandroidchartdemo.R;
import chuang.mpandroidchartdemo.fragment.ChartPieFragment;

/**
 * Created by N-251 on 2015/2/9.
 */
public class ChartPieActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piechart);

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        ChartPieFragment pieChartFragment = new ChartPieFragment();
        fragmentTransaction.add(R.id.content, pieChartFragment);
        fragmentTransaction.commit();
    }
}
