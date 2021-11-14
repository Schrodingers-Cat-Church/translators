import java.util.Scanner;

public class catbinaryconverter {
    public static String textToBinary(String s) { // Just so its known i copied this code off stack overflow lol
        StringBuilder result = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            result.append(
                    String.format("%8s", Integer.toBinaryString(aChar))   // char -> int, auto-cast
                            .replaceAll(" ", "0")                         // zero pads
            );
        }
        return result.toString();
    } 

    public static String binaryToMeow(String s) {
        String newString = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 48) {
                newString += "meow";
            }
            if(s.charAt(i) == 49) {
                newString += "MEOW";
            }
        }
        return newString;
    }

    public static String meowToBinary(String s) {
        String newString = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 77) {
                newString += "1";
            }
            if(s.charAt(i) == 109) {
                newString += "0";
            }
        }
        return newString;
    }

    public static String binaryToText(String s) {
        String newString = "";

        char[] charArray = s.replace(" ", "").toCharArray();
        int length = charArray.length;

        int[] binaryArray = new int[length];
        for(int i = 0; i < length; i++) {
            binaryArray[i] = Integer.parseInt((charArray[i] + ""));
        }

        for(int i = 0; i < length/8; i++) {
            int num = 0;
            for(int j = 0; j < 8; j++) {
                num += binaryArray[(i*8 + 8) - j - 1] * (int) Math.pow(2, j);
            }
            newString += ((char) num);
        }

        return newString;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Text that you want to put into cat binary (Enter nothing if you don't want to):");
        System.out.println("Cat Binary: " + binaryToMeow(textToBinary(in.nextLine())));

        System.out.println("\nCat Binary that you want to put into (boring) text (Enter nothing if you don't want to):");
        System.out.println("Text: " + binaryToText(meowToBinary(in.nextLine())));

        System.out.println("\n\nAmen \\(⏓-⏓)/");
        in.close();
    }
}
