var WicketCharts = {};
// Get context with jQuery - using jQuery's .get() method.
function buildChart(chartWrapperOptions) {
	
	var chart = new google.visualization.ChartWrapper(chartWrapperOptions);
      
    return chart;
}
function buildControl(controlWrapperOptions) {
	
	var control = new google.visualization.ControlWrapper(controlWrapperOptions);
      
    return control;
}