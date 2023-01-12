/*
Ունեք 2 հատ array` arr1, arr2, նույն երկարությամբ։
Ստացեք 3-րդ array-ը, որի հերթական անդամը կլինի
a. arr1-ից, եթե 2-ի i-րդ անդամն էլ կենտ են
b. arr2-ից, եթե 2-ի i-րդ անդամն էլ զույգ են
c. 0, եթե վերևի 2 պայմանները չեն իրականացել
Վերջում տպում եք նոր ստացված array-ը։
 */
public class Third_Array {
    public static void main(String[] args) {
        int[] arr1 = {17, 16, 46, 98, 62, 97, 88, 56};
        int[] arr2 = {63, 98, 45, 12, 22, 23, 28, 23};
        int[] arr3 = new int[8];
        System.out.print("\narr3 = {");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0 && arr2[i] % 2 != 0) {
                arr3[i] = arr1[i];
            } else if (arr2[i] % 2 == 0 && arr2[i] % 2 == 0) {
                arr3[i] = arr2[i];
            } else {
                arr3[i] = 0;
            }
            System.out.print(arr3[i] + ",");
        }
        System.out.print("}\n");
    }
}

