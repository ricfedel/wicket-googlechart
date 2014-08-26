package it.ricfed.wicket.googlecharts.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Binding implements Serializable {

	private static final long serialVersionUID = -2792708000205187228L;

	private List<String> left;
	private List<String> rigth;

	public Binding() {
		this(new ArrayList<String>(), new ArrayList<String>());
	}

	public Binding(String[] left, String[] rigth) {
		this(Arrays.asList(left), Arrays.asList(rigth));
	}

	public Binding(List<String> left, List<String> rigth) {
		super();
		this.left = left;
		this.rigth = rigth;
	}

	public List<String> getLeft() {
		return left;
	}

	public void setLeft(List<String> left) {
		this.left = left;
	}

	public List<String> getRigth() {
		return rigth;
	}

	public void setRigth(List<String> rigth) {
		this.rigth = rigth;
	}

	public void setRigth(String id) {
		rigth = new ArrayList<String>();
		rigth.add(id);
	}

}
