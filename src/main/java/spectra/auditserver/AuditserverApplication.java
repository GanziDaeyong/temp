package spectra.auditserver;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.core.DockerClientBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuditserverApplication {

	public static void main(String[] args) {
		DockerClient dockerClient = DockerClientBuilder.getInstance().build();
		dockerClient.listImagesCmd().exec();


		SpringApplication.run(AuditserverApplication.class, args);
	}

}
