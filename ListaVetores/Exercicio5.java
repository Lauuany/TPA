import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], i, j;
		
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " + i + " valor: ");
			a[i] = ler.nextInt();
		}
		for(i=0; i<TAM; i++) {
			System.out.println("Os divisores de " + i + " são:");
			for(j=1; j<a[i]; j++) {
				if(a[i]%j==0) {
				System.out.println(j);
				}
			}
		}
		
		ler.close();
	}
}
