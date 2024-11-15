package sg.edu.nus.iss.vttp5a_day11w;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Vttp5aDay11wApplication {

	public static void main(String[] args) {
		// SpringApplication.run(Vttp5aDay11wApplication.class, args);
		SpringApplication app = new SpringApplication(Vttp5aDay11wApplication.class);
		ApplicationArguments appArgs = new DefaultApplicationArguments(args);
		String port = "3000";

		if (appArgs.containsOption("port")){
			port = appArgs.getOptionValues("port").get(0);
		}
		

		app.setDefaultProperties(Collections.singletonMap("server.port", port));

		app.run(args);
	}

}
