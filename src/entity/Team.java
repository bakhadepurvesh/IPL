package entity;

public class Team {
  
	private int id;
	private String teamName;
	private String captainName;
	private String coachName;
	private float nRR;
	private boolean isQualified;
	
	// setter- getter
	// id setter and getter
	public void setId(int id){   // setter 
		this.id=id;
	}
	public int getId() {		//getter
		return id;
	}
	// teamName setter and getter
	public void setTeamName(String teamName) {
		this.teamName=teamName;
	}
	public String getTeamName() {
		return teamName;
	}
	//  captainName setter and getter
	public void setCaptainName(String captainName) {
		this.captainName=captainName;
	}
	public String getCaptainName() {
		return captainName;
	}
	// coachName setter and getter
	public void setCoachName(String coachName) {
		this.coachName=coachName;
	}
	public String getCoachName(){
		return coachName;
	}
	// nRR setter and getter
	public void setNrr(float nrr) {
		this.nRR=nrr;
	}
	public float getNrr(){
		return nRR;
	}
	//  isQualified setter and getter
	public void setIsQualified(boolean isQualified){
		this.isQualified=isQualified;
	}
	public boolean getIsQualified() {
		return isQualified;
	}
	
	}
	

