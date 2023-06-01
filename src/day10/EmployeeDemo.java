package day10;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Manager manager = new Manager();
		Supervisor supervisor = new Supervisor();
		
		Employee emp = manager;
		System.out.println(emp.salary);
		
		if(emp instanceof Manager) { // emp 所指向的是否是 Manager 的實例
			System.out.println(((Manager)emp).budget);
		}
		
		if(emp instanceof Supervisor) { // emp 所指向的是否是 Supervisor 的實例
			System.out.println(((Supervisor)emp).stockOptions);
		}

	}

}
