package net.javaguides.springboot;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * mvn spring-boot:run
 */
//@EnableScheduling
@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception{
		Employee employee = new Employee();
		employee.setFirstName("Nikko");
		employee.setLastName("Ferwelo");
		employee.setEmailId("ferwelo.n.bscs@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Nikkos");
		employee1.setLastName("Ferwelos");
		employee1.setEmailId("ferwelo.n.bscs@gmail.coms");
		employeeRepository.save(employee1);
	}

}
