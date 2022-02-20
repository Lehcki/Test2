import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		System.out.print("quantos degraus? ");
		Scanner scan = new Scanner(System.in);
		int num1 =scan.nextInt();
		
		if(num1 == 0) 
			System.out.println("Uma escada com zero degraus não é nada!");
		else {
		System.out.print("Certo! Uma escada com ");
		System.out.print(num1);
		System.out.println(" degraus!"); }
for(int linha = 0; linha < num1; linha++) {
		for(int car = 0; car < num1; car++) {
		if(car < num1 - linha - 1)
			System.out.print(" ");
		else
			System.out.print("*"); }
System.out.println();	
}
	}
}
