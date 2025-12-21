public class Swapping_Number {
}

void main() {

    int a=100;
    int b=400;
     System.out.println("The values before swapping are "+a+" "+b);

   /*  //Logic 1 : Third Variable

    int t=a;
    a=b;
    b=t;

    System.out.println("The values after swapping are "+a+" "+b); */

    /*    // Swapping of number without using third variable
    //Logic 2 :  Use + and -  operator



    a=a+b;     // 100+400=500
    b=a-b;     // 500-400=100=b
    a=a-b;     // 500-100=400=a

      */

    //Logic 3 : * and / operator

    a=a*b;    // 100*400=40000
    b=a/b;   //   40000/400 = 100 =b
    a=a/b;   //  40000/100 = 400


    System.out.println("Now values after swapping are "+a+" "+b);

}
