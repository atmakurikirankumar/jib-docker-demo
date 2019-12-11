package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@SpringBootApplication
@RestController
public class DemoApplication {

	private List<Student> students = Arrays.asList(new Student(1, "Kiran", "Charlotte"),
			new Student(2, "Bagi", "Hyderabad"));

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public ResponseEntity<List<Student>> fetchStudents() {
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}

}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Student {

	private int id;
	private String name;
	private String address;
}
