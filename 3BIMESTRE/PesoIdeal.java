import java.util.Scanner;
public class PesoIdeal {
	public static void main(String[] args) {
		String s, r;
		double altura, peso;
		
		Scanner in=new Scanner(System.in);
		
		
		
		do {
			
			System.out.println("Digite o seu sexo, F para feminino ou M para masculino: ");
			s = in.next();
			
			System.out.println("Digite sua altura: ");
			altura = in.nextDouble();
			
			if(s.equalsIgnoreCase("F")) {
				peso = 52 +(0.67*(altura-152.4));
			}
			else {
				peso = 52 +(0.75*(altura-152.4));
			}
			
			System.out.println("Seu peso ideal é: " + peso);
			
			System.out.println("Deseja continuar a execução? Digite S para sim e N para Não.");
			r = in.next();
			
			if(r.equalsIgnoreCase("N")) {
				System.out.println("Programa encerrado.");
			} 
		} while(r.equalsIgnoreCase("S"));			
		in.close();
	}
}
