package it.ricfed.wicket.googlecharts.data;

import it.ricfed.wicket.googlecharts.data.sets.DataSet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ChartData implements Serializable {

	private static final long serialVersionUID = -5230056951310645070L;

	private List<String> labels;

	private List<DataSet> datasets;

	public List<String> getLabels() {
		if (labels == null) {
			labels = new ArrayList<String>();
		}
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public List<DataSet> getDatasets() {
		if (datasets == null) {
			datasets = new ArrayList<DataSet>();
		}
		return datasets;
	}

	public void setDatasets(List<DataSet> datasets) {
		this.datasets = datasets;
	}

	public static Object[] toDatatable(List<String> labels,
			List<DataSet> datasets) {
		int m = datasets.size();
		Object[] output = new Object[m + 1];
		output[0] = labels.toArray();
		for (int i = 0; i < m; i++) {
			output[i + 1] = datasets.get(i).getData().toArray();
		}
		return output;
	}

}
