package Project;

import java.util.ArrayList;

public class userOperation {
	
	ArrayList<User> users = new ArrayList<User>();

	public static void main(String []args) {
		
		userOperation obj = new userOperation();
		

		User userObj = obj.creatUsers();
		obj.add(userObj);
	}
	
	User creatUsers() { //method
		User user1 = new User(1,"ABC");// create new obj
		return user1; //return that obj
		
	}
	void add(User userObj) {
		users.add(userObj);
		
	}
	void printUser() {
		//we can add iterator
	}
	void deleteUser() {
		//delete
	}
}


