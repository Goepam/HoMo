import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

                         // <-<-<-<-<-<-<-<-<-<-  SECTION 1  ->->->->->->->->->->

        int c;
        int a = 6;
        int b = 8;
        c = a * a + b * b;
        System.out.println("                      TASK N1");
        System.out.println("The sum of the square of two for the given values is: " + c);

                         // <-<-<-<-<-<-<-<-<-<-  SECTION 2  ->->->->->->->->->->

        a = 27;
        b = 56;
        c = 31;
        int d = a + b / 2 * c;
        System.out.println("                      TASK N2");
        System.out.println("The surface area for the given geometric table is: " + d);

                         // <-<-<-<-<-<-<-<-<-<-  SECTION 3  ->->->->->->->->->->

        System.out.println("                      TASK N3");
        System.out.println("The output for the given number is: ");
        int num = 831;
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            reverse = num % 10;
            num = num / 10;
            System.out.println(reverse);
        }
    }
}
