import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alia", "girl" + ",");

        Dancer dancer = new Dancer("Lisa", " the best dancer in group", "Black pink");


        Singer singer = new Singer("Rose", " the best vocalist", "Black pink");


        Programmer programmer = new Programmer("Mark", "Java developer.", "Google");


        Person[] prof = new Person[]{person, dancer, singer, programmer};

        for (Person profs : prof) {
            System.out.println(profs.toString());

        }












    }
}