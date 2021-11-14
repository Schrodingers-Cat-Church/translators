import java.util.Scanner;

public class catbinary {
    public static String convertToBinary(String s) {
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
    public static String convertToMeow(String s) {
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Text that you want to put into cat binary (Put nothing if you don't want to):");
        String s = in.nextLine();
        System.out.println("Cat Binary: " + convertToMeow(convertToBinary(s)));
    }
}
