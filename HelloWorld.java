import java.util.Scanner;

class HelloWorld
{
  public static void main(String[] args)
   {
  Scanner input =new Scanner (System.in);
  System.out.println("Enter the first number");
  int n1 = input.nextInt();
  System.out.println("Enter the second number");
  int n2 = input.nextInt();
  int sum = n1 + n2;
  System.out.println("The sum of these two numbers is: ");
  System.out.println(sum);
  int sub = n1 - n2;
  System.out.println("The sub of these two numbers is: ");
  System.out.println(sub);
  int mul = n1 * n2;
  System.out.println("The mul of these two numbers is: ");
  System.out.println(mul);
  int div = n1/n2;
  System.out.println("The div of these two numbers is: ");
  System.out.println(div);

  
   }
}
