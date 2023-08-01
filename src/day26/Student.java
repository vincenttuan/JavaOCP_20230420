package day26;

public class Student {
	private Integer myrank;
	private Integer id;
	private Integer score1;
	private Integer score2;
	private Integer score3;
	private Integer score4;
	private Integer totalScore;
	public Integer getMyrank() {
		return myrank;
	}
	public void setMyrank(Integer myrank) {
		this.myrank = myrank;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getScore1() {
		return score1;
	}
	public void setScore1(Integer score1) {
		this.score1 = score1;
	}
	public Integer getScore2() {
		return score2;
	}
	public void setScore2(Integer score2) {
		this.score2 = score2;
	}
	public Integer getScore3() {
		return score3;
	}
	public void setScore3(Integer score3) {
		this.score3 = score3;
	}
	public Integer getScore4() {
		return score4;
	}
	public void setScore4(Integer score4) {
		this.score4 = score4;
	}
	public Integer getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(Integer totalScore) {
		this.totalScore = totalScore;
	}
	@Override
	public String toString() {
		return "Student [myrank=" + myrank + ", id=" + id + ", score1=" + score1 + ", score2=" + score2 + ", score3="
				+ score3 + ", score4=" + score4 + ", totalScore=" + totalScore + "]";
	}
	
	
	
	
	
}

