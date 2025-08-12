package repository;

import entity.Team;

public class TeamRepository{
	
	public Team getMITeamDetails(){  
	Team team = new Team();  // create object Team class
	team.setId(101);
	team.setTeamName("Mumbai Indians");
	team.setCaptainName("hardik");
	team.setCoachName("jaywardhan");
	team.setNrr(1.3f);
	team.setIsQualified(false);
	return team;
	}
	
	// add similar method for remaining 9 teams 
	
}
