 
public class tabu {
	public static void main(String[] args) {
		int i=1, m, r;
		
		
		while(i<=10) {
			   m=1;
				while(m<=10) {
					r= i*m;
					System.out.println( i + "x" + m + "=" + r);
					m++;
				}
				i++;
		}
	}
}
