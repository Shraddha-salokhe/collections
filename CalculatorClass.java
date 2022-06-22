
public class CalculatorClass {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		
		int result = obj.multiply(2,3);//.....>function call
		int result1 = obj.multiply(2);//.....>function call
    
		double result3 = obj.multiply(2.0,2);
		
		System.out.println(result);
        System.out.println(result1);
        System.out.println(result3);//double data type result
        
      //here 10 is integer value int..here float is bigger than int 
       float f = 10; //...>Implicit type conversion
       
       float f1 = 10.0f;  //f means floating value
       
      // byte b = 10;//...here 10 is int , int is bigger than byte
      // byte b = 1000;// here 1000 is int,1000 =1 byte,we can not assign,bcoz int lower than byte
       
       //therefore we do explicit conversion =
        byte b1 = (byte)1000; // ....>Explicit type conversion
      //when byte is smaller than int we can not assign value
        
        double d = 10.1;//..>Implicit type conversion
       
       System.out.println(b1);//...>it would be printed only 10.0
       
       int a =65;
       char c =(char)a;// int converted into char
       
       System.out.println(c);
       
       int result4=obj.convertStringToInt("123");//string converted into int
       System.out.println(result4);
	}

	}


class Calculator{
	
	int sum(int num1, int num2) {
	int num3 = num1 + num2;
	return num3;
}
	//method overloading depends upon no of data types & parameters 
		//method overloading
	//polymorphism poly= multiple, morph=forms
		double multiply(double num1, double num2) {
			return num1 * num2;
		}
	
		//method overloading
int multiply(int num1, int num2){
 return num1 * num2;
 
 }
int multiply(int num1){
	return num1* num1 ;
	
}
int difference(int num1,int num2){
int num3 = num1 - num2;
return num3;
}
int convertStringToInt(String input) {
	int result4=Integer.parseInt(input);//string converted into int
	return result4;
}




	}


