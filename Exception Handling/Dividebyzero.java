package ExeHandling;

public class Dividebyzero {

public static void main(String[] args) {
	int num1=9;
	int num2=0;
	int answer;
	{
	try {
		answer=num1/num2;
		System.out.println("Answwer is"+ answer);
	}

	catch (ArithmeticException e){
		System.out.println("Cannot be divided by zero");
	}
	}
}
}

