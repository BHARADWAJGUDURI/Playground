import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner (System.in);
    int N=in.nextInt();
      int first=N/100;
    int second=(N/10)%10;
    int third=(N%10);
    int reverse=(third*100+second*10+first);
    System.out.println(reverse);
  }
}