package day17;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<String, String> telBook = new LinkedHashMap<>();
		telBook.put("John", "02-12345678");
		telBook.put("Mary", "03-87654321");
		telBook.put("Jack", "03-11223344");
		System.out.println(telBook);
		// 我要打電話給 John
		System.out.println(telBook.get("John"));

	}

}
