package day19;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		String data = "一二三";
		try {
			int number = Integer.parseInt(data);
			System.out.println(number);
		} catch (NumberFormatException e) {
			//System.out.println("錯誤資訊:" + e);
			//System.out.println("錯誤原因:" + e.getMessage());
			//e.printStackTrace(System.err); // 印出詳細錯誤
			System.out.println("資料轉換錯誤, 請重新輸入正確資料!");
		}
		System.out.println("程式正常結束 !");
		
	}

}
