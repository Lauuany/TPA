import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		java.util.Scanner in = new Scanner(System.in);
		int m;
		
		System.out.println("Digite o número do mês para saber a quantidade de dias correspondentes");
		m = in.nextInt();
		
		switch(m) {
			case 2:
				System.out.println("Esse mês tem 28 dias");
			break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Esse mês tem 31 dias");
			break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Esse mês tem 30 dias");
			break;
			default:
				System.out.println("mês inválido");
		}
		in.close();
	}
}

