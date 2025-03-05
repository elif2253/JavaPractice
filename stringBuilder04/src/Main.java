//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StringBuilder strBuilder = new StringBuilder("Welcome to Java");

        strBuilder.append(" Java");
        strBuilder.insert(11, "HTML and ");
        strBuilder.delete(8, 11);
        strBuilder.deleteCharAt(8);
        strBuilder.reverse();
        strBuilder.replace(11, 15 , "HTML");
        strBuilder.setCharAt(0, 'w');

        System.out.println(strBuilder);



    }
}