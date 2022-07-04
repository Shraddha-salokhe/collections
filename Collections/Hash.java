package Collections;

public class Hash {

	public static void main(String[] args) {
		
		String a = "200";
		String b = "200";
		
		Integer x = Integer.valueOf(20);
		Integer y = Integer.valueOf(10);
		
		if(a.equals(b)) {// give equal hashcode...if 2 obj are equals then thier hashcode would b same
//	
//		System.out.println("x hashcode:  " + y.hashCode());
//		if(x.equals(y)) {
//			System.out.println("x and y equal");
//		}
			
		System.out.println("Equal");
		System.out.println(a.hashCode() + "  " + b.hashCode());//....>hashcode always return integer value

		//if(!a.equals(b)) {  //..not equal to method
        //System.out.println("Not equals");//if two obj r not equals
		}
	}
	}

