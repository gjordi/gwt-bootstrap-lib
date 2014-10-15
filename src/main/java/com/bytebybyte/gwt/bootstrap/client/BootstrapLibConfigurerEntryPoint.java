package com.bytebybyte.gwt.bootstrap.client;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.bytebybyte.gwt.bootstrap.client.resources.BootstrapLibClientBundle;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;

public class BootstrapLibConfigurerEntryPoint implements EntryPoint {

	protected Logger logger = Logger.getLogger(BootstrapLibConfigurerEntryPoint.class.getName());

	@Override
	public void onModuleLoad() {

		BootstrapLibClientBundle bundle = BootstrapLibClientBundle.INSTANCE;

		logger.log(Level.INFO, "Injecting bootstrap javascript script element.");

		ScriptInjector.fromString(bundle.bootstrap().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}

}
