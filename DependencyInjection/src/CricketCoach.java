
public class CricketCoach implements TheCoach {

	private FortuneService fortuneService; 
	private String emailAddress;
	private String teamName;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	@Override
	public String Excercise() {
		// TODO Auto-generated method stub
		return "practise fast bowling";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	

}
