import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna",
                            "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        int index = 1;
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                index = i + 1;
                System.out.println("Position of " + name + " in the student list is: " + index);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found " + name + " in the list");
        }
    }
}
