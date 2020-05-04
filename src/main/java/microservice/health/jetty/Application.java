package microservice.health.jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;

public class Application {

	public static void main(
		final String[] args)
		throws Exception {
		ServletHolder servletHolder = new ServletHolder(new ServletContainer(new ApplicationConfiguration()));
		Server server = new Server(8081);
		ServletContextHandler context = new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS);
		server.setHandler(context);
		context.addServlet(servletHolder, "/*");
		context.setContextPath("/");
		server.start();
		server.join();
	}

}
