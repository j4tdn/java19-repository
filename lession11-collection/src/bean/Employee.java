package bean;

import java.util.List;

public class Employee {
	private Integer id;
	private String name;
	private List<String> skills;
	private Double salary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Employee(Integer id, String name, List<String> skills, Double salary) {
		this.id = id;
		this.name = name;
		this.skills = skills;
		this.salary = salary;
	}
	public Employee() {
	}
}
