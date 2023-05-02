package day04;

public class ArrayDemo4 {
	public static void main(String[] args) {
		// 如何計算標準差 ?
		double[] scores = {100, 90, 80};
		double avg = Util.getAvg(scores);
		
		double sum = 0; // 平方和的總和
		for(double score : scores) {
			sum += Math.pow(score-avg, 2);
		}
		System.out.println(sum);
		
		double sd = Math.sqrt(sum/scores.length); // ath.sqrt() 開根號
		
		System.out.println(sd);
		// 透過 Util.getSD() 得到標準差
		double sd2 = Util.getSD(scores);
		System.out.println(sd2);
		
	}
}
