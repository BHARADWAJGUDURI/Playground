import java.util.Scanner;
class Main{
	public static void main (String[] args) {
     Scanner in= new Scanner(System.in);
      int n1=in.nextInt();
      
      int p1=n1/100;
      int p2=(n1%100)%10;
      int sum=p1+p2;
      System.out.println(sum);
		// Type your code here
	}
}