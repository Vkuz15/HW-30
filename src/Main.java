//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            int result = 150 / 0;
        } catch (ArithmeticException exception) {
            System.out.println("Деление на ноль невозможно!");
        }
    }
}