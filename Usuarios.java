import java.util.Scanner;
public class Usuarios {
	public static void main (String[] args)  { 
		int ano, n, i, idade, idV, idN;
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Digite o ano atual: ");
		ano= in.nextInt();
		System.out.println("Digite o seu ano de nascimento: ");
		n= in.nextInt();
		idade = ano-n;
		System.out.println("Sua idade é: " + idade);
		idV= idade;
		idN= idade;
		
		
		for (i=1; i<=9; i++) {
			System.out.println("Digite o seu ano de nascimento: ");
			n= in.nextInt();
			idade = ano-n;
			System.out.println("Sua idade é: " + idade);
			
			if(idade>idV) {
				idV= idade;
			} else if(idade<idN) {
				idN= idade;
			}
		}
		
		System.out.println("A idade do mais velho é: " + idV);
		System.out.println("A idade do mais novo é: " + idN);
		
		in.close();
	}
}
