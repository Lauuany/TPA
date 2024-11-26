public class Exercicio6 {
	public static void main(String[] args) {
		final int TAM = 11;
		int a[], i;
		
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.print("A[");
			for(i=0; i<TAM; i++) {
				a[i] = 2*i;
				System.out.print(a[i] + " ");
			}
			System.out.print("]");
			
		}
	}
}
