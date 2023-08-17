package bean;

import java.util.List;
import java.util.Objects;

public class Employee {
	private Integer id;
	private String name;
	private List<String> skills;
	private Double salary;

	public Employee() {
	}

	public Employee(Integer id, String name, List<String> skills, Double salary) {
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
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof Employee)) {
			return false;
		}

		Employee that = (Employee)o;
		return getId() == that.getId();
	}

	@Override
	public int hashCode() {
		// mặc định: hashcode --> là địa chỉ của đối tượng
		// override: hashing giá trị của thuộc tính hash(tt) --> int value
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", skills=" + skills + ", salary=" + salary + "]";
	}
}
