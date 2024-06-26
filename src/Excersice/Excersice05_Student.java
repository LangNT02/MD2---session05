package Excersice;

import java.util.ArrayList;
import java.util.Scanner;

public class Excersice05_Student {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh dựa vào mã học sinh");
            System.out.println("4. Xóa học sinh dựa vào mã học sinh");
            System.out.println("5. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    displayAllStudents();
                    break;
                case 2:
                    addNewStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 5);
    }

    public static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách học sinh trống.");
        } else {
            for (Student student : students) {
                student.displayData();
                System.out.println("----------------------");
            }
        }
    }

    public static void addNewStudent() {
        Student student = new Student();
        student.inputData();
        students.add(student);
        System.out.println("Thêm học sinh thành công.");
    }

    public static void updateStudent() {
        System.out.print("Nhập mã học sinh cần sửa: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (Student student : students) {
            if (student.getStudentId() == id) {
                student.inputData();
                System.out.println("Cập nhật thông tin học sinh thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh với mã: " + id);
    }

    public static void deleteStudent() {
        System.out.print("Nhập mã học sinh cần xóa: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (Student student : students) {
            if (student.getStudentId() == id) {
                students.remove(student);
                System.out.println("Xóa học sinh thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh với mã: " + id);
    }
}

