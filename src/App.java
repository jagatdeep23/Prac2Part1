/**
 * Created by jc277043 on 9/03/15.
 */
public class App {
    public static void main(String[] args) {
        String text = "Thisisasimpletest\nOneTwoThree\nHelloworld!";
        for (int i = 0; i < text.length(); ++i) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }
}
