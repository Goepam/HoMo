/*
 * Հայտարարել երկչափ զանգված, ինիթ անել տարբեր երկարությամբ զանգվածներով։ Ծրագիրը պետքա հայտնաբերի ու տպի մեջների ամենաերկար զանգվածը
 */
public class Largest_Element {
    public static void main(String[] args) {
        int[][] mini = {
                {11, 5, 6, 8, 99},
                {91, 54, 76, 21},
                {321, 46548, 87, 5, 4, 989},
                {87, 89, 8, 5, 0, 5},
                {5454},
                {45, 7}
        };
        System.out.println("\nThe longest element(s) have/has ");
        int l = mini[0][0];
        for (int i = 0; i < mini.length; i++) {
            for (int j = 0; j < mini[i].length; j++) {
                if (mini[i][j] > l) {
                    l = mini[i][j];
                }
                if (mini[0].length < mini[i].length) {
                    mini[0][0] = mini[i][j];
                    System.out.print(mini[0][0] + ", ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\nThe longest value is - " + l + "\n");
    }
}