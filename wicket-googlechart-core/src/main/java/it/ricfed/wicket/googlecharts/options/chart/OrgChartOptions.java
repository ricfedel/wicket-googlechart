package it.ricfed.wicket.googlecharts.options.chart;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class OrgChartOptions extends AbstractChartOptions {

	@JsonIgnore
	private static final long serialVersionUID = 2818311859872166282L;

	private Boolean allowCollapse;// boolean false Determines if double click
									// will collapse a node.
	private Boolean allowHtml;// boolean false If set to true, names that
								// includes HTML tags will be rendered as HTML.
	@Deprecated
	private String color;// string '#edf7ff' Deprecated. Use nodeClass instead.
							// The background color of the orgchart elements.
	private String nodeClass;// string default class name A class name to assign
								// to node elements. Apply CSS to this class
								// name to specify colors or styles for the
								// chart elements.
	private String selectedNodeClass;// string default class name A class name
										// to assign to selected node elements.
										// Apply CSS to this class name to
										// specify colors or styles for selected
										// chart elements.
	@Deprecated
	private String selectionColor; // string '#d6e9f8' Deprecated. Use
									// selectedNodeClass instead. The background
									// color of selected orgchart elements.
	private String size; // 'default medium'	'small', 'medium' or 'large'

	public Boolean getAllowCollapse() {
		return allowCollapse;
	}

	public void setAllowCollapse(Boolean allowCollapse) {
		this.allowCollapse = allowCollapse;
	}

	public Boolean getAllowHtml() {
		return allowHtml;
	}

	public void setAllowHtml(Boolean allowHtml) {
		this.allowHtml = allowHtml;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNodeClass() {
		return nodeClass;
	}

	public void setNodeClass(String nodeClass) {
		this.nodeClass = nodeClass;
	}

	public String getSelectedNodeClass() {
		return selectedNodeClass;
	}

	public void setSelectedNodeClass(String selectedNodeClass) {
		this.selectedNodeClass = selectedNodeClass;
	}

	public String getSelectionColor() {
		return selectionColor;
	}

	public void setSelectionColor(String selectionColor) {
		this.selectionColor = selectionColor;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	};

}
