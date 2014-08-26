package it.ricfed.wicket.googlecharts.data.sets;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DataSet implements Serializable {

	private static final long serialVersionUID = 1581171902504828797L;

	private List<Serializable> data;

	public DataSet(List<Serializable> values) {
		data = values;
	}

	public DataSet() {

	}

	public List<Serializable> getData() {
		if (data == null) {
			data = new ArrayList<Serializable>();
		}
		return data;
	}

	public DataSet setData(List<Serializable> data) {
		this.data = data;
		return this;
	}

}
