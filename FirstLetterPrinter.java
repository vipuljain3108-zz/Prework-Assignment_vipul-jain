import java.util.Scanner;

class FirstLetterPrinter {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String input = in.nextLine();
            System.out.println(firstLetterPrinter(input) + "===" + firstLetterPrinter(input).length());
        }
    }

    static String firstLetterPrinter(String str) {
        if (str.length() <= 0) {
            return "";
        }

        String result = "";

        // 1. first method
        
        String[] arrOfStr = str.split(" ");

        for (int i = 0; i < arrOfStr.length; i++) {
        char firstLetter = arrOfStr[i].charAt(0);
        result += firstLetter;
        }

        // 2. Second method

        // for (int i = 0; i < str.length(); i++) {
        //     char letter = str.charAt(i);
        //     System.out.println(letter);
        //     if (i == 0) {
        //         result += letter;
        //     } else {
        //         if ((int) letter == 32) {
        //             System.out.println(str.indexOf(i + 1));
        //             result += str.charAt(i + 1);
        //         }
        //     }
        // }

        return result;

    }
}