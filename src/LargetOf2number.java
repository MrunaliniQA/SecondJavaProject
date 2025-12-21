public class LargetOf2number {

    static void main() {
        int a = 100;
        int b = 200;

        //Logic 1

        int larger_Number = (a > b) ? a : b;
        System.out.println("The larger number is " + larger_Number);

        //Logic 2 :
        if (a > b)
        {
            System.out.println("Larger number is " + a);
        }
        else
        {
            System.out.println("The larger number is " + b);
        }


    }
}
