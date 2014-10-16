package it.ricfed.wicket.googlecharts.core;

import org.apache.wicket.Component;
import org.apache.wicket.Session;
import org.apache.wicket.ajax.AbstractDefaultAjaxBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.markup.head.OnLoadHeaderItem;
import org.apache.wicket.protocol.http.ClientProperties;
import org.apache.wicket.protocol.http.WebSession;
import org.apache.wicket.request.resource.JavaScriptResourceReference;
import org.apache.wicket.resource.JQueryResourceReference;

public abstract class BaseBehavior extends AbstractDefaultAjaxBehavior implements IBaseBehavior{

	private static final long serialVersionUID = 5935294904099227859L;
	private WrapperContainer container;

	Resolver resolver = new Resolver();

	public BaseBehavior(WrapperContainer container) {
		this.container = container;
	}

	@Override
	protected void respond(AjaxRequestTarget target) {
	}

	@Override
	public void renderHead(Component component, IHeaderResponse response) {
		super.renderHead(component, response);

		response.render(JavaScriptHeaderItem
				.forReference(JQueryResourceReference.get()));

		ClientProperties clientProperties = ((WebSession) Session.get())
				.getClientInfo().getProperties();
		boolean isIE = clientProperties.isBrowserInternetExplorer();
		boolean isLowerThan9 = clientProperties.getBrowserVersionMajor() < 9;
		boolean domreadySupport = !(isIE && isLowerThan9);
		response.render(JavaScriptHeaderItem
				.forUrl("https://www.google.com/jsapi"));
		String jsg = "	google.load('visualization', '1.2', {\n"
				+ "packages : [ 'corechart', 'controls', 'table' , 'orgchart' ]\n" + "});";
		response.render(JavaScriptHeaderItem.forScript(jsg, "jsg"));
		response.render(JavaScriptHeaderItem
				.forReference(new JavaScriptResourceReference(
						Resolver.class, "bridge.js")));


		generate(component, response, domreadySupport);

	}
	protected void generate(Component component, IHeaderResponse response, boolean domreadySupport) {
		if (component instanceof IWrapperContainer) {
			IWrapperContainer g = (IWrapperContainer) component;
			if (domreadySupport) {
				response.render(OnDomReadyHeaderItem.forScript(toScript(g)));
			} else {
				response.render(OnLoadHeaderItem.forScript(toScript(g)));
			}

		}
	}


	public abstract String toScript(IWrapperContainer component);

	public WrapperContainer getContainer() {
		return container;
	}

	public Resolver getResolver() {
		return resolver;
	}


}
