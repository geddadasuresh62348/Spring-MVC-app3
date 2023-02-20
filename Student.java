package com.surya.spring.mvc.RequestParam;

import java.util.LinkedHashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String,String> countryOptions;
	
	public Student() {
		countryOptions=new LinkedHashMap<>();
		countryOptions.put("IR", "Irland");
		countryOptions.put("SKY", "Surya");
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@RequestMapping("/studentForm")
	public String studentData(Model theModel) {
		theModel.addAttribute("student",new Student());
		return "studentForm";
	}
	
	@RequestMapping("/processForm")
	public String processData(@ModelAttribute("student") Student theStudent) {
			System.out.println(" Student Full Name "+ theStudent.getFirstName()+" "+theStudent.getLastName());
			System.out.println("Student Country : "+theStudent.country);
			return "processForm";
	}
}
