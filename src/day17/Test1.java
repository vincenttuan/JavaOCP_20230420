package day17;

import java.util.List;
import java.util.Set;
import static day17.DataCenter.getInstance;

public class Test1 {

	public static void main(String[] args) {
		// 取得所有職稱
		DataCenter dataCenter = getInstance();
		Set<Title> titles = dataCenter.getTitles();
		System.out.println(titles);
		// 取得所有員工
		List<Employee> employees = dataCenter.getEmployees();
		System.out.println(employees);
	}

}
