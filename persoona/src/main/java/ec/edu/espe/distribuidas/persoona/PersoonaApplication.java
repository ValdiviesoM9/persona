package ec.edu.espe.distribuidas.persoona;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersoonaApplication {

    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    @Qualifier("generarPersonas")
    Job job1;
    
	public static void main(String[] args) {
		SpringApplication.run(PersoonaApplication.class, args);
	}

}
