import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {


        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Eugenio Corini", 53));
        students.add(new Student("Mirko Pigliacelli", 30));
        students.add(new Student("Salim Diakite", 23));
        students.add(new Student("Ionut Nedelcearu", 27));
        students.add(new Student("Pietro Ceccaroni", 28));
        students.add(new Student("Kristoffer Lund Hansen", 21));
        students.add(new Student("Filippo Ranocchia", 22));
        students.add(new Student("Claudio Gomes", 23));
        students.add(new Student("Jacopo Segre", 26));
        students.add(new Student("Roberto Insigne", 29));
        students.add(new Student("Matteo Brunori", 29));
        students.add(new Student("Federico Di Francesco", 29));

        System.out.println("lista studenti " + students);


        students.sort(Comparator.comparing(Student::getName));

        students.forEach(System.out::println);

    }
}