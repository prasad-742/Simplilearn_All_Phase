package Arithmatic;

	import java.util.Scanner;

	class Calculator{
		

	void input_value()
	{
		char operator;
	    Double number1, number2;

	    try (Scanner input = new Scanner(System.in)) {
			System.out.println("--> Enter first number");
			number1 = input.nextDouble();

			System.out.println("--> Enter second number");
			number2 = input.nextDouble();
			
			System.out.println("Choose an operator for operation: +, -, *, or /");
			operator = input.next().charAt(0);
		}

	    operation(number1,number2,operator);

	}

	void addition(double number1,double number2,char operator) {
		double result=number1 + number2;
		display(number1,number2,operator,result);
	}

	void substraction(double number1,double number2,char operator) {
		double result=number1 - number2;
		display(number1,number2,operator,result);
	}

	void multiplication(double number1,double number2,char operator) {
		double result=number1*number2;
		display(number1,number2,operator,result);
	}

	void division(double number1,double number2,char operator) {
		double result=number1/number2;
		display(number1,number2,operator,result);
	}


	void operation(double number1,double number2,char operator)
	{
		switch (operator) {

	     case '+':
	       
	    	 addition(number1,number2,operator);
	       
	    	 break;

	     case '-':
	    	
	    	 substraction(number1,number2,operator);
	       
	    	 break;

	      case '*':
	    	
	    	  multiplication(number1,number2,operator);
	       
	    	  break;

	     case '/':
	    	
	    	 division(number1,number2,operator);
	      
	    	 break;

	     default:
	       System.out.println("Invalid operator!!!");
	       break;
	   }

	  // input.close();
	}

	void display(double number1,double number2,char operator,double result)
	{	
		System.out.print("Final result is: ");
		System.out.println(number1 + " "+operator + " " +number2 + " = " + result);
		}

	}

	class Arithmatic_Calculator {
		
	  public static void main(String[] args) {
		 
		 System.out.println("-------------------------");
		 System.out.println("  Arithmatic Calculator   ");
		 System.out.println("-------------------------\n");
	     Calculator cl= new Calculator();
	     cl.input_value();
	     
	  }
	}

