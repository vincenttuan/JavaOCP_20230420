package day21;

import java.util.HashSet;
import java.util.Set;

public class JobMain3 {
	public static void main(String[] args) {
		Set<Runnable> jobs = new HashSet<>();
		jobs.add(() -> System.out.println("JobA"));
		jobs.add(() -> System.out.println("JobB"));
		jobs.add(() -> System.out.println("JobC"));
		jobs.add(() -> System.out.println("JobD"));
		jobs.add(() -> System.out.println("JobE"));
		
		// 將每一個 job 配置到各自的執行緒物件中
		Set<Thread> threads = new HashSet<>();
		jobs.forEach(job -> threads.add(new Thread(job)));
		
		threads.forEach(Thread::start);
		
	}
}
