import java.util.*;
import java.lang.*;


/*
Գրում եք ծրագիր, որը կընդունի ամսվա համարը, ու դրանից կախված int փոփոխականին կվերագրի տվյալ ամսվա օրերի քանակը։
Ծրագրի վերջում պետքա տպվի ամսվա համարն ու տվյալ ամսվա օրերի քանակը համապատասխան տեքստով։
Ծրագիրը գրում եք օգտագործելով switch-case statement-ը ու փորձում եք գրել մաքսիմալ կարճ։
Ասմվա համարը պետքա input լինի կրկին Scanner-ով ու լավ կլինի, որ նախօրոք command line-ում տպվի համապատասխան տեքստ,
թե ինչ միջակայքում պետքա լինի input թիվը ( կարծում եմ պարզա, բայց ամեն դեպքում չեմ նշում )։
Ծրագրի մեջ հաշվի առեք, որ user-ը կարա ցանկացած թիվ input անի ու դուք էդ case-ը պետքա ստուգեք։
Եթե input-ը չի լինի նորմալ միջակայքից, ուրեմն համապատասխան տեքստա պետք տպել ու ծրագիրը terminate անել։
Թե ոնցա դա արվում, նայում եք էստեղ https://www.geeksforgeeks.org/system-exit-in-java/
 */

public class MonthSwitch {
    public static void main(String[] args) {
        System.out.println("\nPlease enter the number of month to see its days \n(Numbers should be within the range of 1 to 12)");
        int[] Year = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner input = new Scanner(System.in);
        try {
            int a = input.nextInt() - 1;
            switch (a) {
                case 0 -> System.out.println("[1] January has " + Year[0] + " days");
                case 1 -> System.out.println("[2] February has " + Year[1] + " days");
                case 2 -> System.out.println("[3] March has " + Year[2] + " days");
                case 3 -> System.out.println("[4] April has " + Year[3] + " days");
                case 4 -> System.out.println("[5] May has " + Year[4] + " days");
                case 5 -> System.out.println("[6] June has " + Year[5] + " days");
                case 6 -> System.out.println("[7] July has " + Year[6] + " days");
                case 7 -> System.out.println("[8] August has " + Year[7] + " days");
                case 8 -> System.out.println("[9] September has " + Year[8] + " days");
                case 9 -> System.out.println("[10] October has " + Year[9] + " days");
                case 10 -> System.out.println("[11] November has " + Year[10] + " days");
                case 11 -> System.out.println("[12] December has " + Year[11] + " days");
            }
            if (a > 11 || a < 0) {
                System.out.println("Terminating the program ");
                System.exit(0);
            }
        } catch (Exception inputMismatchException) {
            System.out.println("Terminating the program ");
            System.exit(0);
        }
    }
}