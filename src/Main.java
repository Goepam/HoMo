import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // <-<-<-<-<-<-<-<-<-<-  SECTION 1  ->->->->->->->->->->

        System.out.println("\n                      TASK N1");
        int c;
        int a = 6;
        int b = 8;
        c = a * a + b * b;
        System.out.println("\nThe sum of the square of two for the given values is: " + c);

        // <-<-<-<-<-<-<-<-<-<-  SECTION 2  ->->->->->->->->->->

        System.out.println("\n                      TASK N2");
        a = 263;
        b = 961;
        c = 42;
        int d = (a + b) * c / 2;
        System.out.println("\nThe surface area for the given geometric table is: " + d);

        // <-<-<-<-<-<-<-<-<-<-  SECTION 3  ->->->->->->->->->->

        System.out.println("\n                      TASK N3_Updated_Simple_Version");
        System.out.println("\nThe output for the given number is: ");
        int num0 = 138;
        int reverse0 = 0;
        reverse0 = num0 % 10;
        System.out.println(reverse0);
        num0 = num0 / 10;
        reverse0 = num0 % 10;
        System.out.println(reverse0);
        System.out.println(num0 / num0);

        System.out.println("\n                      TASK N3");
        System.out.println("\nThe output for the given number is: ");
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
