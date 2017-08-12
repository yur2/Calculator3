import java.util.Scanner;

 

public class Calculator3{

 

	public static void main(String[] args) {

	

		int a=0, sum=0;

		String c = "";

		

 

		System.out.println("수를 입력해주세요");

		Scanner scan =new Scanner(System.in);

		a= scan.nextInt();

		sum =a;

		

		while(true) {

		

		String d;

		

		System.out.println("연산자를 입력해주세요");

		d = scan.next();

		if(c=="not") {

			c=d;

		}

			

		switch(d) {

		

		case "+":

			

			System.out.println("수를 입력해주세요");

			a = scan.nextInt();

			sum = sum + a;

			break;

			

		case "-":

		

			System.out.println("수를 입력해주세요");

			a = scan.nextInt();

			sum = sum - a;

			break;

			

		case "*":

			

			System.out.println("수를 입력해주세요");

			a= scan.nextInt();

			sum = sum * a;

			break;

			

		case "/":

			

			System.out.println("수를 입력해주세요");

			a = scan.nextInt();

			sum = sum / a;

			break;

			

		case "=":

			System.out.println("="+ sum);

	
		

		}

		

	

	}

		

		}

	}
