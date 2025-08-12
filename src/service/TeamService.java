package service;

import entity.Team;
import repository.TeamRepository;
//import repository.TeamRepository;

public class TeamService {

	public void printTeamDetails() {
		
		 TeamRepository t =new  TeamRepository();
	 Team my= t.getMITeamDetails();
	 System.out.println(my);
//		Team team=TeamRepository.getMITeamDetails();
//		team.getId();
//		team.getTeamName();
//		
	}
	
	
}
