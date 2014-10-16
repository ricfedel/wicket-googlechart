var WicketCharts = {};

function buildChart(chartWrapperOptions) {
	
	var chart = new google.visualization.ChartWrapper(chartWrapperOptions);
      
    return chart;
}
function buildControl(controlWrapperOptions) {
	
	var control = new google.visualization.ControlWrapper(controlWrapperOptions);
      
    return control;
}
function showImage(chart,div){
	jQuery('#'+div).html("<img src='" + WicketCharts[chart].getChart().getImageURI() + "' />");
}
function addChart(id,chart){
	WicketCharts[id]=chart;
}
function getChart(id){
	return WicketCharts[id];
}