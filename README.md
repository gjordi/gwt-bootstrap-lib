gwt-bootstrap-lib
=================

[Bootstrap](http://getbootstrap.com) library for GWT projects.

# Usage

Add the dependencies to your Maven POM:

```xml
<dependency>
	<groupId>com.bytebybyte.gwt</groupId>
	<artifactId>jquery-lib</artifactId>
	<version>2.1.1</version>
	<scope>provided</scope>
</dependency>
<dependency>
	<groupId>com.bytebybyte.gwt</groupId>
	<artifactId>bootstrap-lib</artifactId>
	<version>3.3.1</version>
	<scope>provided</scope>
</dependency>
```

And to your .gwt.xml file:

```xml
<module>
	...
	<inherits name="com.bytebybyte.gwt.bootstrap.BootstrapLib" />
	...
</module>
```
