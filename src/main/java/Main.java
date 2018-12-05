
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.servlets.DoSFilter;
import org.glassfish.jersey.servlet.ServletContainer;
import javax.servlet.DispatcherType;
import java.util.EnumSet;
/**
 *
 * @author duylinh
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        final EnumSet<DispatcherType> REQUEST_SCOPE = EnumSet.of(DispatcherType.REQUEST);

        context.addFilter( RequestLoggingFilter.class, "/*", REQUEST_SCOPE );

        FilterHolder filterHolder = new FilterHolder( DoSFilter.class );
               filterHolder.setInitParameter("maxRequestsPerSec", "1");  // max requests per second per client
             filterHolder.setInitParameter("delayMs", "-1");           // millisec to delay excess requests. -1 means reject (for testing)
              filterHolder.setInitParameter("remotePort", "false");     // true = track connections by remote ip+port
             filterHolder.setInitParameter("enabled", "true");
              filterHolder.setInitParameter("trackSessions", "true");
              context.addFilter( filterHolder, "/*", REQUEST_SCOPE );

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