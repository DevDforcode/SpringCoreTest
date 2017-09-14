package test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	String name;
	String email;
	Map<Address,Tenant> address;
	
	public Test(String name, String email, Map<Address,Tenant> address) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
	}

	void display()
	{
		System.out.println("Hello " +name+" ,your mail id is " +email);
		Set<Entry<Address,Tenant>> s= address.entrySet();
		Iterator<Entry<Address,Tenant>> itr=s.iterator();
		while(itr.hasNext())
			
		{
			Entry<Address,Tenant> e=itr.next();
			Address ad=e.getKey();
			Tenant t=e.getValue();
			System.out.println("Lived in");
			System.out.println(ad);
			System.out.println("by");
			System.out.println(t);
		
		}
	}
	
}
