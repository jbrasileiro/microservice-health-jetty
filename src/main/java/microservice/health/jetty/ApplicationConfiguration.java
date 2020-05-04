package microservice.health.jetty;

import org.glassfish.jersey.server.ResourceConfig;

import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class ApplicationConfiguration
	extends
	ResourceConfig {

	public ApplicationConfiguration() {
		packages(true, getClass().getPackage().getName());
	}

}
