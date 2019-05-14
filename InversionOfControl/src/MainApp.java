import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		TheCoach coach=context.getBean("mycoach1",TheCoach.class);
		//TheCoach coach=context.getBean("mycoach",TheCoach.class);
		System.out.println(coach.Excercise());
		context.close();
	}

}
