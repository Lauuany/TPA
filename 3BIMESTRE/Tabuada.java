import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
	 int i=1, n, r;
	 
	 Scanner in=new Scanner(System.in);
	 
	 System.out.println("Escreva um número: ");
	 n=in.nextInt();
	 
	 while(i<=10) {
		 r= i*n;
		 System.out.println(r);
		 i++;
	 }
	 
	 in.close();
 }
}
