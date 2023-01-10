public class MamboN4 {
    public static void main(String[] args) {

//        <-<-<-<-<-<-<-<-<-<  PART 1  >->->->->->->->->->

        int x = 36354;
        int y = 6;
        int z = x / y;
        int w = z * y;
        int m = x - w;
        if (m == 0) {
            System.out.println("\n" + "True ");
        } else {
            System.out.println("\n" + "False ");
        }

//        <-<-<-<-<-<-<-<-<-<  PART 2  >->->->->->->->->->

        int a = 2, b = 6, c = 15, d = 67, e = 91, f = 11;
        double p = a + b + c / 3d;
        System.out.println("\n" + "The first average is: " + p);
        double q = d + e + f / 3d;
        System.out.println("\n" + "The second average is: " + q);
        double r = p + q;
        System.out.println("\n" + "The sum of two averages is: " + (int) r);
        System.out.println("\n" + "HAPPY VERY MERRY CHRISTMAS");
    }
}

