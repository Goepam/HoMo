import java.util.*;

/*
Գրում եք ծրագիր, որը կընդունի int տիպի 3 թիվ command line-ից՝ a,b,c։
Ծրագիրը պետքա տպի համապատասխան տեքստ, եթե հնարավոր եղավ էդ 3 թվերով ստանալ եռանկյուն, և կրկին համապատասխան տեքստ հակառակ դեպքում։
Ծրագիրը գրելուց հետո թեստ եք անում Ձեր մտքին էկած հնարավոր սցենարներով։
Թե որ 3 թվովա հնարավոր ստանալ եռանկյուն՝ գուգլեք։
Թե ինչպես command line-ից input-ները տալ՝ պետքա օգտագործեք Scanner,
ավելի մանրամասն էստեղ կարաք նայեք https://www.w3schools.com/java/java_user_input.asp , կամ ինքներդ էլ գուգլեք։
 */
public class Triangle {
    public static void main(String[] args) {
        try {
            System.out.println("\nPlease enter the value for 'A' side");
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            while (a < 0 || a > 2147483646) {
                System.out.println("The number should be in the range of '0 to 2147483647', you have entered '" + (a) + " '");
                a = input.nextInt();
            }
            System.out.println("Please enter the value for 'B' side");
            int b = input.nextInt();
            while (b < 0 || b > 2147483646) {
                System.out.println("The number should be in the range of 0 to 2147483647, you have entered " + (b));
                b = input.nextInt();
            }
            System.out.println("Please enter the value for 'C' side");
            int c = input.nextInt();
            while (c < 0 || c > 2147483646) {
                System.out.println("The number should be in the range of 0 to 2147483647, you have entered " + (c));
                c = input.nextInt();
            }
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("The construction of triangle is possible when \n A = " + a + "\n B = " + b + "\n C = " + c);
            } else {
                System.out.println("The construction of triangle is impossible when \n A = " + a + "\n B = " + b + "\n C = " + c);
            }
        } catch (Exception inputMismatchException) {
            System.out.println("The value is inadmissible " + inputMismatchException);
        }
        System.out.println("\n THE END");
    }
}
