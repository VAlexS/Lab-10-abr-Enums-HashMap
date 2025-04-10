import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name;
        int grade;

        var scanner = new Scanner(System.in);


        Map<String, Student> studentMap = new HashMap<>();

        for (int i = 1; i <= 4; i++) {
            System.out.print("¿Nombre del estudiante? ");
            name = scanner.nextLine();



            System.out.print("¿Calificación del estudiante? ");
            grade = scanner.nextInt();

            scanner.nextLine();

            studentMap.put(name, new Student(name, grade));




        }


    }
}