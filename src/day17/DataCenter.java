package day17;

import java.util.LinkedHashSet;
import java.util.Set;

// 資料中心(SingleTon 單例模式)
// 定義預設的職稱與員工
public class DataCenter {
	private static DataCenter _instance = new DataCenter();
	
	private Set<Title> titles = new LinkedHashSet<>();
	
	private DataCenter() {
		titles.add(new Title(1, "專員"));
		titles.add(new Title(2, "專員"));
		titles.add(new Title(2, "襄理"));
		titles.add(new Title(3, "副理"));
		titles.add(new Title(4, "經理"));
		titles.add(new Title(5, "協理"));
		titles.add(new Title(6, "副總"));
	}
	
	public static DataCenter getInstance() {
		return _instance;
	}
	
	public Set<Title> getTitles() {
		return titles;
	}
	
}
