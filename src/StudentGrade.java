import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentGrade {
    Map<String, List<Integer>> gradeStudent = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void gradeMethod() {
        System.out.println("write student name: ");
        String name = scanner.nextLine();


        System.out.println("Algebra");
        int algebra = scanner.nextInt();
        System.out.println("Kyrgyz til");
        int ktil = scanner.nextInt();
        System.out.println("Phyz cultura");
        int phyzcultur = scanner.nextInt();
        System.out.println("English");
        int eng = scanner.nextInt();
        System.out.println("Phyzic");
        int phyzic = scanner.nextInt();
        System.out.println("History");
        int history = scanner.nextInt();

        System.out.println("Algebra: " + algebra);
        System.out.println("Kyrgyz til: " + ktil);
        System.out.println("Phiz ciltura: " + phyzcultur);
        System.out.println("English: " + eng);
        System.out.println("Physics" + phyzic);
        System.out.println("History" + history);

        double sum = (algebra + ktil + phyzcultur + eng + phyzic + history) / 6;
        System.out.println(sum + " ");

        gradeStudent.put(name,List.of(algebra,ktil,phyzcultur,eng,phyzic,history));

        System.out.println(gradeStudent);

    }

}