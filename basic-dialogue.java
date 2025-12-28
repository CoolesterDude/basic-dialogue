package Blake;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userNextLine = new Scanner(System.in);
        int choice = 0;

        String[] dialogue = {
                "Maithu: Sir the Kingdom is under attack.",
                "Flik: We must not yet attack. Our troops are severely disorganized.",
                "Flik: Ready any remaining manpower on defensive.",
                "Tir: 1. Okay let's do this \nTir: 2. Not just yet.."
        };

        for (int i = 0; i < dialogue.length - 1; i++) {
            System.out.println(dialogue[i]);
            userNextLine.nextLine();
        }

        while(true) {
            System.out.println(dialogue[3]);
            choice = Integer.parseInt(userNextLine.nextLine()); //converting next line into an integer so that the \n isn't stuck in the buffer

            if (choice == 1) {
                System.out.println("Maithu: We're sure to win this.");
                break;
            } else if (choice == 2) {
                System.out.println("Maithu: Sir we don't have much time..");
                break;
            } else {
                continue;
            }
        }
        userNextLine.close();
    }
}