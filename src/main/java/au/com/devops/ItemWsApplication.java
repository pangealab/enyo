package au.com.devops;

import au.com.devops.rest.itemsEndpoint;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ItemWsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ItemWsApplication.class, args);
	}

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }
  
    private static Class<ItemWsApplication> applicationClass = ItemWsApplication.class;

	@Component
	public class JerseyConfig extends ResourceConfig {

		public JerseyConfig() {
			registerEndpoints();
		}

		private void registerEndpoints() {
            register(itemsEndpoint.class);
		}
	}

}
