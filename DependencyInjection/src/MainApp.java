import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//TheCoach coach=context.getBean("mycoach1",TheCoach.class);
		//TheCoach coach=context.getBean("mycoach",TheCoach.class);
		CricketCoach coach=context.getBean("ccoach",CricketCoach.class);//SetterInjection
		System.out.println(coach.Excercise());
		System.out.println(coach.getFortune());
		System.out.println(coach.getTeamName());
		System.out.println(coach.getEmailAddress());
		context.close();
	}

}
