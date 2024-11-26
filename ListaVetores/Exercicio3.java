import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], i;
		
		a = new int [TAM];
		
		//lendo
				for(i=0; i<TAM; i++) {
					System.out.println("Digite o " + i + " elemento do vetor A");
					a[i] = ler.nextInt();
					
					
					 //mensagem
					if(a[i] % 2 == 1 || a[i]== 2) {
						System.out.println("O elemento " + a[i] + " é primo!");
						
					} else {
						System.out.println("O elemento " + a[i]+ " não é primo!");
					}
				}
		
		ler.close();
	}
}
