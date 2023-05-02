package day04;

/*
 * 調查五位學生之身高及體重如下
 * 身高：172、168、164、170、176(公分)
 * 體重：62、57、58、64、64(公斤)
 * 試問：平均與標準差
 * */
public class ArrayDemo2 {
	public static void main(String[] args) {
		double[] heights = {172, 168, 164, 170, 176};
		double[] weights = {62, 57, 58, 64, 64};
		// 計算身高的平均
		// 先計算身高的總和
		double sumOfHeight = 0;
		for(double height : heights) {
			sumOfHeight += height;
		}
		double avgOfHeight = sumOfHeight / heights.length;
		System.out.printf("身高總和: %.1f 身高平均: %.1f\n", sumOfHeight, avgOfHeight);
	}
}
