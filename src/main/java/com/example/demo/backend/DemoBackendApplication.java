package com.example.demo.backend;

import com.example.demo.backend.entity.Employee;
import com.example.demo.backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository; //inject

	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = Employee.builder()
				.firstName("Chase")
				.lastName("Gonzaga")
				.email("rcgonzaga2@up.edu.ph")
				.build();

		Employee employee2 = Employee.builder()
				.firstName("Camie")
				.lastName("Gonzaga")
				.email("testing@up.edu.ph")
				.build();

		Employee employee3 = Employee.builder()
				.firstName("Neo")
				.lastName("Gonzaga")
				.email("cool@up.edu.ph")
				.build();

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}
}