package day12;

import java.util.Objects;

public class Student {
	private String name;
	private int age;
	private int score;
	private String grade; // 年級
	
	public Student(String name, int age, int score, String grade) {
		this.name = name;
		this.age = age;
		this.score = score;
		this.grade = grade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, grade, name, score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(grade, other.grade) && Objects.equals(name, other.name)
				&& score == other.score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + ", grade=" + grade + "]";
	}
	
}
