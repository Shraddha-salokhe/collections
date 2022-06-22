package IT; //...>in package this statement has to be the first statement

import Admin.Person;

//INHERITANCE
//child class or sub class of parent class person
public class Employee extends Person{ //public is access everywhere in package

	private int empId;//private is within the class only
	private String dept;
	
	//setter method = use to set the value of instance variables
	
	void setEmpId(int empId) {
		this.empId=empId;
	}
	
	//setter method
	void setDept(String dept) {
		this.dept = dept;
		
	}
	 void setNameAndAge(String name,int age) {
		 this.name= name;
		 this.age= age;
		 
	 }
	 void show() {
		 
		 print();
		 
		 System.out.println("EmpId: " + this.empId + " dept: " + this.dept);
	 }
	
  }
class Second{
	
	void setValue() {
		Employee obj = new Employee();
		obj.setEmpId(100);
		obj.setDept("IT");
		obj.setNameAndAge("shraddha", 32);
		
		obj.show();
	}
}