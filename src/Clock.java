
/*
Պատկերացրեք սովորական կլոր ժամացույց ունեք, որի վրա կա 12 հատ բաժանմունք։
Հիմա, Դուք պետքա գրեք ծրագիր, որը կընդունի րոպեի սլաքի բաժանմունքի համարը ու կտպի թե կլոր ժամից քանի րոպեա անց։
Օրինակ. դուք ներմուծում եք 3, ծրագիրը պետքա տպի 15, որովհետև 12-ից սկսած 3 բաժանմունք էն կողմը անց 15 րոպեա։
Եթե տալիս եք ասենք 8, ուրեմն պետքա տպի 40, եվ այլն։
Ծրագիրը ոնց ուզում եք գրեք, բայց հնարավորինս կարճ գրեք ու հնարավորինս քիչ հիշողության օգտագործմամբ։
 */

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        System.out.println("\nEnter any round number from 1 to 12 to see how the minutes hand of the clock works. ");
        byte[] Clock = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 0};
        Scanner input = new Scanner(System.in);
        try {
            int a = input.nextInt() - 1;
            System.out.println("\nIt is " + Clock[a] + " minutes past.");
            if (a > 11 || a < 0) {
                System.out.println("You have entered a wrong number, try again... ");
                System.exit(0);
            }
        } catch (Exception inputMismatchException) {
            System.out.println("Terminating the program ");
            System.exit(0);
        }
    }
}