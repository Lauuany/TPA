import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 5;
		int a[], b[], i, m;
		
		a = new int [TAM];
		b = new int [TAM];
		
		//lendo
		for(i=0; i<TAM; i++) {
			System.out.println("Digite um valor a posição " + (i) + " do vetor A");
			a[i] = ler.nextInt();
		}
		
		//apresentação
		System.out.println("\nA = ");
		for(i=0; i<TAM; i++) {
			System.out.println("\nTabuada do  " + a[i] + ":");
			for(m=0; m<=10; m++) {
				System.out.println(a[i] + " x " + m + " = " + (a[i]*m));
			}
		}
		
		ler.close();
	}
}
