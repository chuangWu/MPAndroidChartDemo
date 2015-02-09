package chuang.mpandroidchartdemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.utils.Legend;

import chuang.mpandroidchartdemo.R;
import chuang.mpandroidchartdemo.Remote;

/**
 * Created by N-251 on 2015/2/9.
 */
public class ChartPieFragment extends Fragment {
    private PieChart mPieChart;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_piechart, container, false);
        mPieChart = (PieChart) contentView.findViewById(R.id.pieChartView);
        initView();
        return contentView;
    }

    private void initView() {
        mPieChart.setDescription("");

        mPieChart.setHoleRadius(45f);
        mPieChart.setTransparentCircleRadius(50f);

        //设置数据
        Remote remote = new Remote();
        mPieChart.setData(remote.generatePieData());
        Legend l = mPieChart.getLegend();
        l.setPosition(Legend.LegendPosition.RIGHT_OF_CHART);
        //设置动画
        mPieChart.animateXY(1500, 1500);
    }
}
