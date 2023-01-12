import java.util.*;

/*
Ունեք char-երի array՝ char[] array, խառը անգլերեն տառերով։
Ձեզնից պահանջվումա ծրագրին որպես ինփութ տալ որևէ տառ ու դա փնտրել array-ի մեջ։
Առաջին անգամ տառին հանդիպելուց հետո էլ իմաստ չունի ցիկլը շարունակել։
Ցիկլից հետո տպում եք էն index-ը, որտեղ էդ տառը հայտնաբերվելա։
Եթե տառը չի գտնվել, ապա տպում եք, որ չի գտնվել։
Խնդիրը գրում եք while ցիկլով։
*/
public class Find_Char {
    public static void main(String[] args) {
        char[] array = {'a', 'f', 'l', 'j', 'y', 'w', 'm', 'z', 'c', 'h', 'r'};
        Scanner input = new Scanner(System.in);
        char b = input.next().charAt(0);
        int index = 0;
        for (char i = 0; i < array.length; i++) {
            index++;
            while (b == array[i]) {
                System.out.println("\nThe letter " + array[i] + " has been found at index N " + index + ".");
                return;
            }
            while (b != array[i]) {
                break;
            }
        }
        System.out.println("\nThe number was not found.");
    }
}