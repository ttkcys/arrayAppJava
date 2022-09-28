package arrayapp;

public class ArrayApp {

    public static void main(String[] args) {

        double[] myList = {1.2, 1.3, 4.3, 5.6, 7.9};
        double total = 0;
        double maxValue = myList[0];

        for (double number : myList) {
            if (maxValue < number) {
                maxValue = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Total : " + total);
        System.out.println("Max number : " + maxValue);
    }

}
