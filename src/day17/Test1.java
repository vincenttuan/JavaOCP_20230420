package day17;

import java.util.Set;
import static day17.DataCenter.getInstance;

public class Test1 {

	public static void main(String[] args) {
		// 取得所有職稱
		DataCenter dataCenter = getInstance();
		Set<Title> titles = dataCenter.getTitles();
		System.out.println(titles);
		
	}

}
