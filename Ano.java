import java.util.Scanner;
public class Ano {
	public static void main(String[] args) {
		 int i=1, n, a, y;
		 
		 Scanner in=new Scanner(System.in); 
		 
		while(i<7) {
			System.out.println("Digite o ano atual: ");
			 a= in.nextInt();
			 System.out.println("Digite o ano que você nasceu: ");
			 n=in.nextInt();
			 y=a-n;
			 if (y<18) {
				 System.out.println("Você tem "+y+ " Menor de idade");
			 }else {
				 System.out.println("Você tem "+y+ " Maior de idade");
			 }
			 i++;
		}
		in.close();
	}
}
