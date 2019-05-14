
public class TrackCoach implements TheCoach{

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	
	@Override
	public String Excercise() {
		// TODO Auto-generated method stub
		return "Run 5km for 1 hr";
	}

	@Override
	public String getFortune() {
		
		return fortuneService.getFortune();
	}

}
