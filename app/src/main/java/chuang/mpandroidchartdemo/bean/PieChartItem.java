
package chuang.mpandroidchartdemo.bean;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.utils.Legend;
import com.github.mikephil.charting.utils.Legend.LegendPosition;

import chuang.mpandroidchartdemo.R;

public class PieChartItem extends ChartItem {

    public PieChartItem(ChartData cd, Context c) {
        super(cd);

    }

    @Override
    public int getItemType() {
        return TYPE_PIECHART;
    }

    @Override
    public View getView(int position, View convertView, Context c) {

        ViewHolder holder = null;

        if (convertView == null) {

            holder = new ViewHolder();

            convertView = LayoutInflater.from(c).inflate(
                    R.layout.list_item_piechart, null);
            holder.chart = (PieChart) convertView.findViewById(R.id.chart);

            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        // apply styling
        holder.chart.setDescription("");
        holder.chart.setHoleRadius(60f);
        holder.chart.setTransparentCircleRadius(65f);
        holder.chart.setCenterText("MPChart\nAndroid");
        holder.chart.setCenterTextSize(18f);
        holder.chart.setDrawXValues(false);
        holder.chart.setUsePercentValues(true);

        // set data
        holder.chart.setData((PieData) mChartData);

        Legend l = holder.chart.getLegend();
        l.setPosition(LegendPosition.RIGHT_OF_CHART);

        // do not forget to refresh the chart
        // holder.chart.invalidate();
        holder.chart.animateXY(900, 900);

        return convertView;
    }

    private static class ViewHolder {
        PieChart chart;
    }
}
