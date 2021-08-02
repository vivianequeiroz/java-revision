package pooThis;

public class ThisKeyword {
	
	int a;
	int b;
	
	//#1
	//to refer the current class instance variables 
	//(can be used to make it explicit that the variable is part of that method):
	ThisKeyword (int a) {
		this.a = a;
	}
	
	
	// #2
	// to invoke the current class constructor
	ThisKeyword () { 
        this(10, 20);
        System.out.println("Inside  default constructor \n");
	}
	     
    //Parameterized constructor
	ThisKeyword (int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }
	
	
	
	//#3
	// to invoke the current class instance
	ThisKeyword getThisKeyword() {
		return this;
	}
	
}
