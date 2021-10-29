import java.util.Scanner;

class RectangleArea {

    public static int[] dataInput() {
        int[] abValues = {0, 0};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value: ");
        abValues[0] = scan.nextInt();
        System.out.println("Enter b value: ");
        abValues[1] = scan.nextInt();
        return abValues;
    }

    public static int calculateArea(int[] arg) {
        return arg[0] * arg[1];
    }

    public static void printData(int arg, int[]args) {
        System.out.println("a = " + args[0] + ", b = " + args[1] + ", equals " + arg);
    }
}

public class Main {

    public static void main(String[] args) {
        RectangleArea myObj = new RectangleArea();
        int[] values = myObj.dataInput();
        myObj.printData(myObj.calculateArea(values), values);
    }
}
