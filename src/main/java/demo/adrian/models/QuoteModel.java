package demo.adrian.models;

import javax.jcr.Node;
import javax.jcr.PathNotFoundException;
import javax.jcr.RepositoryException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import demo.adrian.pojo.Quote;
import info.magnolia.jcr.util.PropertyUtil;
import info.magnolia.rendering.model.RenderingModel;
import info.magnolia.rendering.model.RenderingModelImpl;
import info.magnolia.rendering.template.configured.ConfiguredTemplateDefinition;

public class QuoteModel<RD extends ConfiguredTemplateDefinition> extends RenderingModelImpl<ConfiguredTemplateDefinition> {

	private Client client;
	private WebTarget target;
	private String apiUrl = "https://my-json-server.typicode.com/fadiwissa/quotes/quotes/";
   
	public QuoteModel(Node content, ConfiguredTemplateDefinition definition, RenderingModel<?> parent)
			throws PathNotFoundException, RepositoryException {
		super(content, definition, parent);
	}

	// This public method will be available in the FreeMarker (ftl) template of the
	// component as ${ model.getMyName() } or ${ model.myName }
	public String getMyName() {
		return "gateB Consulting, inc. 2018";
	}
	
	public Quote getQuote() {
		String myCategory = PropertyUtil.getString(content, "category");
		
		client = ClientBuilder.newClient();

		target = client.target(apiUrl + myCategory);
		Quote apiQuote = target.request(MediaType.APPLICATION_JSON).get(Quote.class);
		
		return apiQuote;
		
	}
	
}
