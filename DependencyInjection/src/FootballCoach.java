
public class FootballCoach implements TheCoach{

	private FortuneService fortuneService; 
	
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String Excercise() {
		// TODO Auto-generated method stub
		return "dribble for 45 mins";
	}

	@Override
	public String getFortune() {

		return fortuneService.getFortune();
	}

}
