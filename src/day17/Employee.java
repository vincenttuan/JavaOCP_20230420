package day17;

// 員工
public class Employee {
	private Integer id; // 員工編號
	private String name; // 員工姓名
	private Long salary; // 員工薪資
	private Title title; // 職稱
	
	public Employee() {
		
	}
	
	public Employee(Integer id, String name, Long salary, Title title) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.title = title;
	}
	
	
	
}
