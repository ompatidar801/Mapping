package oneToOne5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class FatherChildrenMain
{
	static SessionFactory sf =new Configuration().configure().buildSessionFactory();

	public static void saveFatherChildrenMain()
	{
		Session sn = sf.openSession();
		FatherDTO u = new FatherDTO();
		u.setFid(985);
		u.setFname("Dhanraj");
		u.setAddress("Dhar");
		
		FatherDTO u1 = new FatherDTO();
		u1.setFid(986);
		u1.setFname("Mahesh");
		u1.setAddress("Indore");
		
		ChildrenDTO co1 = new ChildrenDTO();
		co1.setCdid(8347);
		co1.setCdname("Jayraj");
		co1.setCdaddress("Dewas");
		co1.setFath(u);
		
		ChildrenDTO co2 = new ChildrenDTO();
		co2.setCdid(5432);
		co2.setCdname("Devraj");
		co2.setCdaddress("Bhopal");
		co2.setFath(u1);
		
		Transaction tr = sn.beginTransaction();
		
		sn.save(co1);
		sn.save(co2);
		
		tr.commit();
		sn.close();
	
	}
	
	/*public static void getFatherChildrenMain()
	{
		Session sn1 = sf.openSession();
		
		ChildrenDTO ch1 = (ChildrenDTO)sn1.get(ChildrenDTO.class, 8347);
		System.out.println("ChildrenDTO Details");
		System.out.println(ch1.getCdid());
		System.out.println(ch1.getCdname());
		System.out.println(ch1.getCdaddress());
		
		
		Set ss = ch1.getFath();
		Iterator itr = ss.iterator();
		while(itr.hasNext())
		{
		FatherDTO u = (FatherDTO) itr.next();
		
		System.out.println("FatherDTO Details");
		System.out.println(u.getFid());
		System.out.println(u.getFname());
		System.out.println(u.getAddress());
		
		}
		sn1.close();
	}*/
	
	public static void updateFatherChildrenMain()
	{
		Session sn = sf.openSession();
		ChildrenDTO co2 = (ChildrenDTO) sn.get(ChildrenDTO.class, 985);
		FatherDTO u = co2.getFath();
		u.setFname("PrathviRaj");
		u.setAddress("Badnavar");
		Transaction trn = sn.beginTransaction();
		sn.update(u);
		trn.commit();
		sn.close();
	}
	
	/*public static void deleteFatherChildrenMain()
	{
		ChildrenDTO co2 = new ChildrenDTO();
		co2.setCdid(5432);
		
		Transaction trn = sn.beginTransaction();
		
		sn.delete(co2);
		trn.commit();	
	}
	*/
	public static void main(String[] args) 
	{
		//saveFatherChildrenMain();
		//getFatherChildrenMain();
		updateFatherChildrenMain();
		//deleteFatherChildrenMain();
		
	}
}
