import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		int n, i=1, primeiro= 0, segundo= 1, p;
		
		Scanner in=new Scanner(System.in); 
		
		System.out.println("Digite o valor de n: ");
		n= in.nextInt();
		
		if(n<=0) {
			System.out.println("O valor de n deve ser maior que zero.");
		} else {
			System.out.println("Sequência de Fibonacci até a " + n + " termo: ");
		}
		
		while(i<=n) {
			System.out.println(primeiro);
			
			p= primeiro + segundo;
			primeiro= segundo;
			segundo= p;
			i++;
		}
		
		in.close();
	}
}
