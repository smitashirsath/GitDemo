

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Student s1=new Student();
		s1.setSid(2);
		s1.setName("abc");
		s1.setAdd("pune");
		s.save(s1);
		Transaction ts=s.beginTransaction();
		ts.commit();
		s.close();
	}
}
