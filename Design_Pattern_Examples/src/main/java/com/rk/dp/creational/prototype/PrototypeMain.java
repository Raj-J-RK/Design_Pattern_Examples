package com.rk.dp.creational.prototype;

import java.time.LocalDate;
import java.util.List;

// Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs. 
// Prototype design pattern uses java cloning to copy the object
public class PrototypeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Users ullist = new Users();
		ullist.loadUser();
		System.out.println("ullist:"+ullist);
		System.out.println("ullist:"+ullist.getUserList().size());
		
		try {
			Users ulClone1 = (Users) ullist.clone();
			System.out.println("ulClone1:"+ulClone1);
			System.out.println("ulClone1:"+ulClone1.getUserList().size());
			List<User> ulist = ulClone1.getUserList();
			ulist.add(new User("0", "Name", "Name", 20, "City", "country", false, LocalDate.now()));
			System.out.println("ulClone1:"+ulClone1);
			System.out.println("ulClone1:"+ulClone1.getUserList().size());
			Users ulClone2 = (Users) ullist.clone();
			System.out.println("ulClone2:"+ulClone2);
			System.out.println("ulClone2:"+ulClone2.getUserList().size());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception : " + e);
		}
	}

}
