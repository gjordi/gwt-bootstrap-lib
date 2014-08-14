package com.bytebybyte.gwt.bootstrap.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface BootstrapLibClientBundle extends ClientBundle {

	public final static BootstrapLibClientBundle INSTANCE = GWT.create(BootstrapLibClientBundle.class);

	@Source("bootstrap/js/bootstrap.min.js")
	TextResource bootstrap();

}
