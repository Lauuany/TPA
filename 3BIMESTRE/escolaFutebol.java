import java.util.Scanner;
public class escolaFutebol {
   public static void main(String[] args) {
	   java.util.Scanner in = new Scanner(System.in);
	   int idade;
	   
	   System.out.println("Digite a sua idade:");
	   idade = in.nextInt();
	   
	   switch(idade) {
	   case 6: 
		   System.out.println("Dente de leite");
	   break;
	   case 7:
		   System.out.println("Júnior");
	   break;
	   case 8:
		   System.out.println("Júnior Max");
	   break;
	   case 9:
		   System.out.println("Júnior Master");
	   break;
	   case 10:
		   System.out.println("Master");
	   break;
	   default:
		   System.out.println("Você ainda é muito novo");
	   }
	   in.close();
    }
}
