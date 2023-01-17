/*
 * Հայտարարել երկչափ զանգված, ինիթ անել ու տպել տվյալ երկչափ զանգվածի ամեն անդամ զանգվածի առաջին ու վերջին տարրերը։
 */

public class Edge_Values {
    public static void main(String[] args) {
        int[][] wini = {
                {11, 5, 6, 8, 99},
                {91, 54, 76, 21},
                {321, 46548, 87, 5, 989},
                {87, 89, 8, 5, 0},
                {5454},
                {45, 7}
        };
        int left = 0;
        int rigth = 0;
        for (int i = 0; i < wini.length; i++) {
            for (int j = 0; j < wini[i].length; j++) {
                left = wini[i][0];
                rigth = wini[i][j];
            }
            System.out.println("The first element in the row " + i + " is '" + left + "' The last is '" + rigth + "'");
        }
    }
}