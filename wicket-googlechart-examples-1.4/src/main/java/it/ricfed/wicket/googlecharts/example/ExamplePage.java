package it.ricfed.wicket.googlecharts.example;

import it.ricfed.wicket.googlecharts.chart.AreaChart;
import it.ricfed.wicket.googlecharts.chart.BarChart;
import it.ricfed.wicket.googlecharts.chart.ColumnChart;
import it.ricfed.wicket.googlecharts.chart.Dashboard;
import it.ricfed.wicket.googlecharts.chart.PieChart;
import it.ricfed.wicket.googlecharts.chart.Table;
import it.ricfed.wicket.googlecharts.control.CategoryFilter;
import it.ricfed.wicket.googlecharts.data.ChartData;
import it.ricfed.wicket.googlecharts.data.sets.DataSet;
import it.ricfed.wicket.googlecharts.options.Legend;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import org.apache.wicket.markup.html.WebPage;

public class ExamplePage extends WebPage {

	@Override
	protected void onInitialize() {
		super.onInitialize();
		Calendar c = Calendar.getInstance();
		Random R = new Random();
		ChartData data = new ChartData();
		List<String> labels = new ArrayList<String>();
		labels.add("Anno");
		for (int i = 0; i < 12; i++) {
			c.set(Calendar.MONTH, i);
			labels.add(new SimpleDateFormat("MMM").format(c.getTime()));
		}
		data.getLabels().addAll(labels);
		List<Serializable> v = null;
		for (Integer a = 2011; a < 2015; a++) {
			v = new ArrayList<Serializable>();
			v.add(a.toString());
			for (int i = 0; i < 12; i++) {
				v.add(Math.abs(R.nextInt()) / 100000);
			}
			data.getDatasets().add(new DataSet(v));
		}

		Dashboard dash = new Dashboard("dashboard");
		dash.setDataTable(data);
		add(dash);
		CategoryFilter controlPanel = new CategoryFilter("control");
		controlPanel.getWrapper().getOptions().setFilterColumnLabel("Anno");
		dash.add(controlPanel);

		BarChart barChartPanel = new BarChart("barChart");
		{
			Legend legend = new Legend();
			legend.setPosition(Legend.POSITION_TOP);
			barChartPanel.getWrapper().getOptions().setLegend(legend);
		}
		dash.add(barChartPanel);

		ColumnChart columnChartPanel = new ColumnChart("columnChart");
		{
			Legend legend = new Legend();
			legend.setPosition(Legend.POSITION_TOP);
			columnChartPanel.getWrapper().getOptions().setLegend(legend);
		}
		dash.add(columnChartPanel);

		Table tablePanel = new Table("tableChart");
		dash.add(tablePanel);

		AreaChart areaPanel = new AreaChart("areaChart");
		{
			Legend legend = new Legend();
			legend.setPosition(Legend.POSITION_TOP);
			areaPanel.getWrapper().getOptions().setLegend(legend);
		}
		dash.add(areaPanel);

		ChartData data1 = new ChartData();
		List<String> labels1 = new ArrayList<String>();
		labels1.add("Mese");
		labels1.add("Numero");
		for (int i = 0; i < 12; i++) {
			v = new ArrayList<Serializable>();
			c.set(Calendar.MONTH, i);
			v.add(new SimpleDateFormat("MMM").format(c.getTime()));
			v.add(Math.abs(R.nextInt()) / 100000);
			data1.getDatasets().add(new DataSet(v));
		}

		data1.getLabels().addAll(labels1);
		PieChart pieChart = new PieChart("pieChart");
		pieChart.setDataTable(data1);
		{
			Legend legend = new Legend();
			legend.setPosition(Legend.POSITION_TOP);
			pieChart.getWrapper().getOptions().setLegend(legend);
		}
		add(pieChart);

	}

}
