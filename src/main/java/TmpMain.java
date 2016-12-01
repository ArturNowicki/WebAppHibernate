import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hibernate.HibernateUtils;

public class TmpMain {


	public static void main (String[] args) {
		runSession();
		
	}

	private static void runSession() {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		System.out.println("Run");
		sessionFactory.close();
		
	}
}
