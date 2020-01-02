import java.util.Scanner;
class Main {
	public static void main (String[] args) {
      int year;
     
		Scanner in = new Scanner(System.in);
		// Type your code here
       year=in.nextInt();
      if(year%4==0 && year%100!=0 || year%400==0)
        System.out.println("Leap year");
                           else
                           System.out.println("Non Leap year");
      
    }
}