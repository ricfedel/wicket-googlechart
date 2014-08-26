package it.ricfed.wicket.googlecharts.core;

import org.apache.wicket.Component;
import org.apache.wicket.Session;
import org.apache.wicket.ajax.AbstractDefaultAjaxBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;
import org.apache.wicket.protocol.http.ClientProperties;
import org.apache.wicket.protocol.http.WebSession;
import org.apache.wicket.protocol.http.request.WebClientInfo;

import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class BaseBehavior extends AbstractDefaultAjaxBehavior {

	private static final long serialVersionUID = 5935294904099227859L;
	private ObjectMapper mapper;
	private WrapperContainer container;

	public BaseBehavior(WrapperContainer container) {
		this.container = container;
	}

	public ObjectMapper getMapper() {
		if (mapper == null) {
			mapper = new ObjectMapper();
		}
		return mapper;
	}

	@Override
	protected void respond(AjaxRequestTarget target) {

	}

	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);

		response.renderJavascriptReference(new JavascriptResourceReference(
				Chart.class, "jquery-1.10.2.min.js"),"jquery");

		ClientProperties clientProperties = ((WebClientInfo) ((WebSession) Session
				.get()).getClientInfo()).getProperties();
		boolean isIE = clientProperties.isBrowserInternetExplorer();
		boolean isLowerThan9 = clientProperties.getBrowserVersionMajor() < 9;
		boolean domreadySupport = !(isIE && isLowerThan9);
		response.renderJavascriptReference("https://www.google.com/jsapi");
		String jsg = "	google.load('visualization', '1.2', {\n"
				+ "packages : [ 'corechart', 'controls', 'table' ]\n" + "});";
		response.renderJavascript(jsg, "jsg");
		response.renderJavascriptReference(new JavascriptResourceReference(
				Chart.class, "bridge.js"));

		generate(container, response, domreadySupport);

	}

	protected void generate(Component component, IHeaderResponse response,
			boolean domreadySupport) {
		if (component instanceof IWrapperContainer) {
			IWrapperContainer g = (IWrapperContainer) component;
			if (!g.isInDashboard()) {
				if (domreadySupport) {
					response.renderOnDomReadyJavascript(toScript(g));
				} else {
					response.renderOnLoadJavascript(toScript(g));
				}
				
			}
		}
	}

	protected abstract String toScript(IWrapperContainer component);

	public WrapperContainer getContainer() {
		return container;
	}

}
