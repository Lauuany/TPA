import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		java.util.Scanner in = new Scanner(System.in);
		int p;
		
		System.out.println("Digite o último número da sua placa:");
		p = in.nextInt();
		
		switch(p) {
			case 1:
			case 2:
				System.out.println("Você não poderá rodar as segundas-feiras");
			break;
			case 3:
			case 4:
				System.out.println("Você não poderá rodar as terças-feiras");
			break;
			case 5:
			case 6:
				System.out.println("Você não poderá rodar as quartas-feiras");
			break;
			case 7:
			case 8:
				System.out.println("Você não poderá rodar as quintas-feiras");
			break;
			case 9:
			case 0:
				System.out.println("Você não poderá rodar as sextas-feiras");
			break;
			default:
				System.out.println("Dia inválido");
		}
		in.close();
	}
}
