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
			System.out.println("Digite o valor da posi��o " + i +  " do vetor A.");
			a[i] = ler.nextInt();
			
			//separa��o
			if(a[i] % 2 == 0) {
				b[par] = a[i];
				par++;
			} else {
				b[impar] = a[i];
				impar--;
			}
		}
		
		//apresenta��o
		System.out.println("\nPares e �mpares: ");
		for(i=0; i<TAM; i++) {
			System.out.println(b[i]);
		}
		
		ler.close();
	}
}
