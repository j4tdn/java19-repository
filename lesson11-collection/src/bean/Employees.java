package bean;

import java.util.List;
import java.util.Objects;

public class Employees {
	private Integer id;
	private String name;
	private List<String> skills;
	private Double salary;
	
	public Employees() {
		
	}

	public Employees(Integer id, String name, List<String> skills, Double salary) {
		this.id = id;
		this.name = name;
		this.skills = skills;
		this.salary = salary;
	}

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

	@Override
	public String toString() {
		return "\nEmployees [id=" + id + ", name=" + name + ", skills=" + skills + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(!(o instanceof Employees)) {
			return false;
		}
		return getId() == ((Employees)o).getId();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(getId());
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
