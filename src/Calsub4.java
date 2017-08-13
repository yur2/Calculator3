import java.util.Scanner;

public class Calsub4 {
	
    int a=0;
	int sum=0;
	String d="";
	Scanner scan =new Scanner(System.in);
	
	
	public void first(int a){
		this.a = a;
		sum = a;
	}
	
	
	public void read(){
		
		sum = a;
		System.out.println("수를 입력해주세요");
		a = scan.nextInt();
		
	

	}


	public void once(){
		
	switch(d) {
		

	case "+":

		read();
		sum= sum + this.a ;

		break;

		

	case "-":

		read();		
		sum = sum - this.a;

		break;

		

	case "*":

		read();
		sum = sum * this.a;

		break;

		

	case "/":

		read();
		sum = sum / this.a;

		break;

		

	case "=":

		System.out.println("="+ sum);

	}
	}
}
