package day24;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFileContent4 {
	public static void main(String[] args) throws IOException {
		// 請計算 employee.txt 每種職位的平均薪資
		// 需要建立 Employee 物件(name, salary, jobTitle)
		List<String> lines = Util.getLines("src/day24/employee.txt");
		System.out.println(lines);
		// 將 List<String> 轉 List<Employee>
		List<Employee> employees = lines.stream()
				.map(Employee::new)
				//.map(line -> new Employee(line))
				.collect(Collectors.toList());
		System.out.println(employees);
				
	}
}
