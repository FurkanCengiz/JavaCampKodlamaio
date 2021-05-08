package eCommerceDemo;

import eCommerceDemo.business.abstracts.UserService;

import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.core.conretes.EmailValidator;
import eCommerceDemo.core.conretes.RegisterWithGoogleAdapter;
import eCommerceDemo.dataAccess.conretes.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		/*
		 * System.out.
		 * println(" -------------------- E ticaret giri� --------------------");
		 * System.out.println("1-Kay�t ol"); System.out.println("1-giri� yap"); Scanner
		 * scan= new Scanner(System.in); int choose; choose = scan.nextInt();
		 * switch(choose) { case 1: System.out.println("---- Kay�t ----"); User user =
		 * new User(1,"Furkan","Cengiz","furkancengiz7@hotmail.com","123456");
		 * UserService userService = new UserManager(new HibernateUserDao(),new
		 * EmailValidator() ); userService.register(user); }
		 */
		
		User user = new User(1, "furkan", "cengiz ", "furkancengiz@hotmail.com", "123456");
		
		UserService userService = new UserManager(new HibernateUserDao(), new EmailValidator(),new RegisterWithGoogleAdapter() );
		
		userService.anotherLogin(user);
		//userService.register(user);
		//userService.login(user);
		//userService.verification(user);

	}

}
