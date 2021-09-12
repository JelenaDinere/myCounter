import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class Main {
    Counter counter = new Counter();
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.showMenu();
    }

    void showMenu() {
        String userInput = "";
        do {
            System.out.println("Welcome to menu : ");
            System.out.println("1. Count up");
            System.out.println("2. Count down");
            System.out.println("\nEnter Quit to end program...");

            System.out.println("Choose a number:");
            userInput = scanner.nextLine();

            switch (userInput) {
                case "Quit":
                case "QUIT":
                case"quit":
                    System.out.println("Exiting Application...");
                    break;
                //count up
                case "1":
                    countUp();
                    break;
                //view all cars
                case "2":
                    countDown();
                default:
                    break;
            }

        }while (!userInput.equalsIgnoreCase("Quit"));
            return;
}
void countUp(){
    System.out.println("COUNT UP");

    System.out.println("Start");
    int start= intScanner.nextInt();
    System.out.println("Stop");
    int stop= intScanner.nextInt();

    counter.countTo(start,stop);
}
void countDown(){
    System.out.println("COUNT DOWN");


    System.out.println("Stop");
    int stop= intScanner.nextInt();
    System.out.println("Start");
    int start= intScanner.nextInt();

    counter.countDown(stop,start);

}
}