package day07;

public class StudentMain2 {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name="John";s1.score=80;
		
		Student s2 = new Student();
		s2.name="Mary";s2.score=45;
		
		Student s3 = new Student();
		s3.name="Helen";s3.score=75;
		
		// 進行陣列組裝
		Student[] students = {s1, s2, s3};
		// 計算總分 (part 1)?
		System.out.println(students[0].score);
		System.out.println(students[1].score);
		System.out.println(students[2].score);
		System.out.println(students[0].score + students[1].score + students[2].score);
		
		// 計算總分 (part 2)?
		int sum = 0;
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].score);
			sum += students[i].score;
		}
		System.out.println(sum);
		
	}
	
}
