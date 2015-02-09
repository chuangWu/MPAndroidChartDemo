package chuang.mpandroidchartdemo.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import chuang.mpandroidchartdemo.R;
import chuang.mpandroidchartdemo.Remote;
import chuang.mpandroidchartdemo.adapter.ChartDataAdapter;
import chuang.mpandroidchartdemo.bean.BarChartItem;
import chuang.mpandroidchartdemo.bean.ChartItem;
import chuang.mpandroidchartdemo.bean.LineChartItem;
import chuang.mpandroidchartdemo.bean.PieChartItem;

/**
 * Created by N-251 on 2015/2/9.
 */
public class MultipleChartsFragment extends Fragment {

    private ListView mListView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_multiple_charts, container, false);
        initView(contentView);
        return contentView;
    }

    private void initView(View contentView) {
        mListView = (ListView) contentView.findViewById(R.id.listview);
        ArrayList<ChartItem> list = new ArrayList<ChartItem>();

        // 30 items
        Remote remote = new Remote();
        for (int i = 0; i < 30; i++) {

            if (i % 3 == 0) {
                list.add(new LineChartItem(remote.generateDataLine(i + 1), getActivity()));
            } else if (i % 3 == 1) {
                list.add(new BarChartItem(remote.generateDataBar(i + 1), getActivity()));
            } else if (i % 3 == 2) {
                list.add(new PieChartItem(remote.generateDataPie(i + 1), getActivity()));
            }
        }

        ChartDataAdapter chartDataAdapter = new ChartDataAdapter(getActivity(), list);
        mListView.setAdapter(chartDataAdapter);
    }
}
