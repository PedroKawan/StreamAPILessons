package program;

public class Students {
	private String name;
	private Integer age;
	private Double grade;
	
	public Students(String name, Integer age, Double grade) {
		this.setName(name);
		this.setAge(age);
		this.setGrade(grade);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getGrade() {
		return grade;
	}
	public void setGrade(Double grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
}
