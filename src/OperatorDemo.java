public class OperatorClass {
}

public static void main(String[] args) {

    int a =40;
    int b=20;
  //Arithmetic Operator
    System.out.println("Sum of a and b "+(a+b));
    System.out.println("The substraction result is "+(a-b));
    System.out.println("The multiplication result is "+(a*b));
    System.out.println("The division result is "+(a/b));
    System.out.println("The modulo division result is "+(b%a));

    //relational Operator
    System.out.println(a>b);
    System.out.println(a<b);


    //Logical Operator
    System.out.println((10>20) && (20>10));
    System.out.println((10>20) || (10<20));

    //Ternary Operator

    int x=100, y=200;

    int z=(x>y)?x:y; //
    System.out.println("Value of z is "+z);






}
