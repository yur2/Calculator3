import java.util.Scanner;

 

public class Calculator3{

 

	public static void main(String[] args) {

	

		int a=0, sum=0;

		String c = "";

		

 

		System.out.println("���� �Է����ּ���");

		Scanner scan =new Scanner(System.in);

		a= scan.nextInt();

		sum =a;

		

		while(true) {

		

		String d;

		

		System.out.println("�����ڸ� �Է����ּ���");

		d = scan.next();

		if(c=="not") {

			c=d;

		}

			

		switch(d) {

		

		case "+":

			

			System.out.println("���� �Է����ּ���");

			a = scan.nextInt();

			sum = sum + a;

			break;

			

		case "-":

		

			System.out.println("���� �Է����ּ���");

			a = scan.nextInt();

			sum = sum - a;

			break;

			

		case "*":

			

			System.out.println("���� �Է����ּ���");

			a= scan.nextInt();

			sum = sum * a;

			break;

			

		case "/":

			

			System.out.println("���� �Է����ּ���");

			a = scan.nextInt();

			sum = sum / a;

			break;

			

		case "=":

			System.out.println("="+ sum);

	
		

		}

		

	

	}

		

		}

	}
