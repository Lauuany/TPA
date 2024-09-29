import java.util.Scanner;
public class cantina {
   public static void main(String[] args) {
	java.util.Scanner in = new Scanner(System.in);
	int cod;
	
	System.out.println("Digite o código:");
	cod = in.nextInt();  
	
	switch(cod) {
	case 1:
		System.out.println("Cachorro-quente - preço: R$8,00");
		break;
	case 2:
		System.out.println("Cheeseburguer - preço: R$12,00");
		break;
	case 3:
		System.out.println("X-Salada - preço: R$15,00");
		break;
	case 4:
		System.out.println("Misto Quente - preço: R$11,00");
		break;
	case 5:
		System.out.println("Pão na chapa - preço: R$6,00");
		break;
		default:
			System.out.println("Código inválido");
	   }
	in.close();
	}
}
