// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String name = args[0];
                Integer repeat_times = Integer.parseInt(args[1]);
                for (int i = 0; i < name.length(); i++) {
                        String letter = String.valueOf(name.charAt(i)).toUpperCase();
                        String a_or_an = "a  ";
                        if (letter.equals("A") || letter.equals("E") || letter.equals("F") || letter.equals("H")
                                        || letter.equals("I") || letter.equals("L") || letter.equals("M")
                                        || letter.equals("N") || letter.equals("O") || letter.equals("R")) {
                                a_or_an = "an ";
                        }
                        System.out.println("Give me " + a_or_an + letter + ": " + letter + "!");
                }
                System.out.println("What does that spell?");
                for (int i = 0; i < repeat_times; i++) {
                        System.out.println(name.toUpperCase() + "!!!");
                }
        }
}
