package day24;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.mapping;
import static java.util.Comparator.comparingInt;

public class ReadFileContent4 {
	public static void main(String[] args) throws IOException {
		// Lab 1: 請計算 employee.txt 每種職位的平均薪資
		
		// 1.需要建立 Employee 物件(name, salary, jobTitle)
		List<String> lines = Util.getLines("src/day24/employee.txt");
		System.out.println(lines);
		
		// 2.將 List<String> 轉 List<Employee>
		List<Employee> employees = lines.stream()
				.map(Employee::new)
				//.map(line -> new Employee(line))
				.collect(toList());
		System.out.println(employees);
		
		// 3.計算 employee.txt 每種職位的平均薪資
		Map<String, Double> avgSalaryByJobTitle = employees.stream()
				.collect(groupingBy(Employee::getJobTitle, averagingInt(Employee::getSalary)));
		System.out.println(avgSalaryByJobTitle);
		
		// Lab 2: 請計算 employee.txt 每種職位的人數
		Map<String, Long> countByJobTitle = employees.stream()
				.collect(groupingBy(Employee::getJobTitle, counting()));
		System.out.println(countByJobTitle);
		
		// Lab 3: 請計算 employee.txt 每種職位的中薪資最高的員工
		Map<String, Optional<Employee>> maxSalaryByJobTitle = employees.stream()
				.collect(groupingBy(Employee::getJobTitle, maxBy(comparingInt(Employee::getSalary))));
		System.out.println(maxSalaryByJobTitle);
		
		// Lab4: 請計算 employee.txt 每種職位的員工名字有哪些
		Map<String, List<String>> namesByJobTitle = employees.stream()
				.collect(groupingBy(Employee::getJobTitle, mapping(Employee::getName, toList())));
		System.out.println(namesByJobTitle);
		
		
	}
}
