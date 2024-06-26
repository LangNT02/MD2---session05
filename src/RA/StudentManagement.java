package RA;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        //Syntax: ClassName objectName = new Constructor(Argument)
        //1. Khởi tạo đối tượng sinh viên mà không khởi tạo bất cứ thông tin nào
        Student student1 = new Student();
        //2. Khởi tạo đối tượng sinh viên với mã sinh viên và tên sinh viên
        Student student2 = new Student("SV002", "Nguyễn Văn B");
        //3. Khởi tạo đối tượng sinh viên với đầy đủ thông tin
        Student student3 = new Student("SV003", "Nguyễn Văn C", 22, true, "Hồ Chí Minh", true);
        //4. Khởi tạo đối tượng sinh viên với mã sinh viên, tên, tuổi
        Student student4 = new Student("SV004", "Nguyễn Văn D", 24);
        //5. Nhập toàn bộ thông tin cho sinh viên 1
        System.out.println("NHẬP THÔNG TIN SINH VIÊN 1:");
        Scanner scanner = new Scanner(System.in);
        student1.inputData(scanner);
        //6. Sử dụng các phương thức set nhập thông tin sinh viên 2: tuổi, giới tính, điạ chỉ, trạng thái
        System.out.println("NHẬP THÔNG TIN SINH VIÊN 2:");
        System.out.println("Nhập vào tuổi sinh viên:");
        student2.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào giới tính:");
        student2.setSex(Boolean.parseBoolean(scanner.nextLine()));
        System.out.println("Nhập vào địa chỉ:");
        student2.setAddress(scanner.nextLine());
        System.out.println("Nhập vào trạng thái:");
        student2.setStatus(Boolean.parseBoolean(scanner.nextLine()));
        //7. In ra tổng tuổi của sinh viên 1,2,3
        int sumAge = student1.getAge() + student2.getAge() + student3.getAge();
        System.out.println("Tổng tuổi của 3 sinh viên là: " + sumAge);
        //8. Cho sinh viên 3 chào thầy Quang
        student3.hello();
        //In ra thông tin sinh viên 1, 2, 3
        //Syntax: objectName.methodName(Argument)
        System.out.println("THÔNG TIN SINH VIÊN 1:");
        student1.displayData();
        System.out.println("THÔNG TIN SINH VIÊN 2:");
        student2.displayData();
        System.out.println("THÔNG TIN SINH VIÊN 3:");
        student3.displayData();
//        student3.studentId = "abc";

    }
}
