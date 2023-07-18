package day22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class LottoMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask<Set<Integer>> futureTask = new FutureTask<>(new Lotto());
		new Thread(futureTask).start();
		Set<Integer> nums = futureTask.get();
		System.out.println(nums);
		// 使用 TreeSet 排序
		Set<Integer> sortedNums = new TreeSet<>(nums);
		System.out.println(sortedNums);
		// 使用 Collections.sort() 排序
		List<Integer> sortedNums2 = new ArrayList<>(nums);
		Collections.sort(sortedNums2, Collections.reverseOrder());
		System.out.println(sortedNums2);
	}

}
