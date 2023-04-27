package day03;

public class StringDemo3 {

	public static void main(String[] args) {
		String s = "Java";
		//s = s + "SCJP";
		s = s.concat("SCJP");
		//s.concat("SCJP"); // 陷阱
		System.out.println(s);
		

	}

}
