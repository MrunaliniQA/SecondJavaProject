public class SmallerNumber {
    static void main() {

        int i=400;
        int j=600;

        // Logic 1

        int smaller_number = (i<j)?i:j;
        System.out.println("Smaller Number is "+smaller_number);

        //Logic 2

        int a=2000 , b=800;

        if(a<b)
        {
            System.out.println("The smaller number is "+a);
        }
        else
        {
            System.out.println("The Smaller number is "+b);
        }
    }
}
