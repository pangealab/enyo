package au.com.devops;

import au.com.devops.rest.itemsEndpoint;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class ItemWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemWsApplication.class, args);
	}

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
