package com.rk.dp.structural.composite;

public class CompositeMain {

	// Composite pattern is used where we need to treat a group of objects in similar way as a single object
	// Composite pattern composes objects in term of a tree structure to represent hierarchy.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ceo = new Employee("CEO Name", 55, 1, "Head Office");
		Employee manager1 = new Employee("manager 1", 50, 100, "Head Office");
		Employee manager2 = new Employee("manager 2", 51, 101, "Branch Office");
		Employee manager3 = new Employee("manager 3", 52, 102, "Head Office");
		ceo.addReportee(manager1);
		ceo.addReportee(manager2);
		ceo.addReportee(manager3);
		
		Employee lead1 = new Employee("lead 1", 40, 200, "Branch Office");
		Employee lead2 = new Employee("lead 1", 40, 200, "Branch Office");
		manager1.addReportee(lead1);
		manager3.addReportee(lead2);
		Employee developer1 = new Employee("developer 1", 25, 301, "Branch Office");
		Employee developer2 = new Employee("developer 2", 30, 302, "Branch Office");
		Employee developer3 = new Employee("developer 3", 31, 303, "Branch Office");
		Employee developer4 = new Employee("developer 4", 33, 304, "Branch Office");
		Employee developer5 = new Employee("developer 5", 29, 305, "Branch Office");
		Employee developer6 = new Employee("developer 6", 34, 306, "Branch Office");
		lead1.addReportee(developer1);
		lead1.addReportee(developer3);
		lead1.addReportee(developer5);
		lead2.addReportee(developer2);
		lead2.addReportee(developer4);
		lead2.addReportee(developer6);
		
		System.out.println("CEO Reportees:");
		for(Employee e:ceo.getReportees()) {
			System.out.println(e.toString());
		}
		System.out.println("manager1 reportees");
		for(Employee e:manager1.getReportees()) {
			System.out.println(e.toString());
		}
		System.out.println("lead1 reportees");
		for(Employee e:lead1.getReportees()) {
			System.out.println(e.toString());
		}
	}

}
