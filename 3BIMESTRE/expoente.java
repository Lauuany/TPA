import java.util.Scanner;
public class expoente {
	public static void main(String[] args) {
		int i=0, b, e, p=1;
		
		Scanner in=new Scanner(System.in); 
		
		System.out.println("Escreva a base: ");
		b= in.nextInt();
		
		System.out.println("Escreva o expoente: ");
		e= in.nextInt();
		 
		while(i<e) {
			p= p*b;
			i++;
		}
		
		System.out.println("A potencia é: " + p);
		in.close();
	}
}
