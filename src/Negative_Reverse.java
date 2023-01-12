/*
Ունեք array, որը լցվածա խառը թվերով։
Ձեր խնդիրնա բոլոր բացասական թվերը փոխարինել իրանց մոդուլով դրական թվերով ու նաև հաշվել նման փոխարինումների քանակը։
Իսկ վերջում տպել ստացված array-ը, տպել փոփոխությունների քանակը ու տպել նաև սկզբնական վիճակում array-ի ոչ բացասական անդամների քանակը։
*/
public class Negative_Reverse {
    public static void main(String[] args) {
        int[] arr1 = {-12, 32, 4, -894, -97, 56, 321, 64, -1, 0};
        System.out.println("\nA newly formed array is: ");
        int x = 0;
        int y = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] >= 0) {
                y++;
            }
            if (arr1[i] < 0) {
                arr1[i] = ~arr1[i] + 1;
                x++;
            }
            System.out.print(arr1[i] + ", ");
        }
        System.out.println("\nThere are " + x + " negative changes in array." + "\nThere are " + y + " non-negative numbers in initial array.");
    }
}
