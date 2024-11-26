import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 20;
		int a[], b[], i, par=0, impar=19;
		
		a = new int [TAM];
		b = new int [TAM];
	
		//lendo A
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o valor da posição " + i +  " do vetor A.");
			a[i] = ler.nextInt();
			
			//separação
			if(a[i] % 2 == 0) {
				b[par] = a[i];
				par++;
			} else {
				b[impar] = a[i];
				impar--;
			}
		}
		
		//apresentação
		System.out.println("\nPares e ímpares: ");
		for(i=0; i<TAM; i++) {
			System.out.println(b[i]);
		}
		
		ler.close();
	}
}
