/*
Ունենում եք double-երի 5 երկարությամբ զանգված որը Ձեր ուզած թվերով ինիթ եք անում։
Հետո ստեղծում եք երկրորդ զանգվածը, որը ինիթ չեք անում, բայց որը պետքա լինի էն նույն չափով, ինչ առաջին զանգվածը։
Խնդիրը նրանումա, որ պետքա 2-րդ զանգվածի մեջ լցնեք առաջին զանգվածի բոլոր ոչ բացասական թվերը։
Օրինակ՝ Ձեր ունեցած զանգվածը կանվանեմ input։
input - { 5,7, -2, -3, 1 }
output - {5, 7, 1, 0, 0 }
input - {-1, -4, 7, -2, 9}
output - {7, 9, 0, 0, 0}
input - { 5, 6, 7, 8, 9}
output - {5, 6, 7, 8, 9}
Թե խիա վերջում 0-ներ լինում, դա նույնպես կարդացեք, գուգլեք, հասկացեք։ Իմ ուղարկած նյութում էդ մասը չգտա, տակ շտո կարողա էդտեղ չգտնեք։
Տպելը կարաք տպեք առանձին-առանձին, առաջինից վերջին անդամները հերթով, որ արդյունքը տեսնեք։
Կարևոր - Ժող ջան, խնդիրները լուծում եք մինչև էս պահը Ձեր անցածի հիման վրա։
Այսքանը, բարի ժամանց։
 */
public class N_negative {
    public static void main(String[] args) {
        double[] input = {28.0, 68.8, -8.8, -6.8, 6.8};
        double[] output = new double[5];
        if (input[0] >= 0) {
            output[0] = input[0];
        }
        if (input[1] >= 0) {
            output[1] = input[1];
        }
        if (input[2] >= 0) {
            output[2] = input[2];
        }
        if (input[3] >= 0) {
            output[3] = input[3];
        }
        if (input[4] >= 0) {
            output[4] = input[4];
            System.out.println("Input - {" + input[0] + ", " + input[1] + ", " + input[2] + ", " + input[3] + ", " + input[4] + "}");
            System.out.println("output - {" + output[0] + ", " + output[1] + ", " + output[2] + ", " + output[3] + ", " + output[4] + "}");
        }
    }
}