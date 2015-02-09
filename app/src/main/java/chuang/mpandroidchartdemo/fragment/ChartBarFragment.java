package chuang.mpandroidchartdemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.github.mikephil.charting.charts.BarChart;

import chuang.mpandroidchartdemo.Remote;
import chuang.mpandroidchartdemo.widget.ChartBarMarker;
import chuang.mpandroidchartdemo.R;

/**
 * Created by N-251 on 2015/2/9.
 */
public class ChartBarFragment extends Fragment {

    private BarChart mBarChart;
    private LinearLayout mContentLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_chartbar, container, false);
        mBarChart = (BarChart) contentView.findViewById(R.id.barChartView);
        initView();
        return contentView;
    }

    private void initView() {
        mBarChart.setDescription("");

        // 设置Marker
        ChartBarMarker chartBarMarker = new ChartBarMarker(getActivity(), R.layout.custom_marker_view);
        mBarChart.setMarkerView(chartBarMarker);

        mBarChart.setHighlightIndicatorEnabled(false);
        mBarChart.setDrawBorder(false);
        mBarChart.setDrawGridBackground(false);
        mBarChart.setDrawVerticalGrid(false);
        mBarChart.setDrawXLabels(false);
        mBarChart.setDrawYValues(false);
        mBarChart.setUnit(" 元");
        mBarChart.setDrawBarShadow(false);

        //添加动画
        mBarChart.animateY(2500);

        //设置数据
        Remote remoteChartBar = new Remote();
        mBarChart.setData(remoteChartBar.generateBarData(5, 20000, 4));
    }
}
