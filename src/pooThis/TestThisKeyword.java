package pooThis;

public class TestThisKeyword {

	public static void main(String[] args) {
		
		//Used to reference attributes and methods from the class 
		
		//#1
		ThisKeyword classVariables = new ThisKeyword(5);
		
		System.out.println(classVariables.a);
		
		//#2
		ThisKeyword currentConstructor = new ThisKeyword();
		
		
		//#3
		ThisKeyword currentClassInstance = new ThisKeyword();
		currentClassInstance.getThisKeyword();
	}	

}
