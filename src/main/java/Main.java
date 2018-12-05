import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;

/**
 *
 * @author dangg
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");

        String port = System.getenv("PORT") != null ? System.getenv("PORT") : "8080";

        Server jettyServer = new Server(Integer.parseInt(port));
        jettyServer.setHandler(context);

        ServletHolder jerseyServlet = context.addServlet(ServletContainer.class, "/*");
        jerseyServlet.setInitOrder(0);

        jerseyServlet.setInitParameter("jersey.config.server.provider.classnames", ServerTest.class.getCanonicalName());

        try {
            jettyServer.start();
            jettyServer.join();
        } finally{
            jettyServer.stop();
        }
    }
}