package ra.presentation;

import ra.business.Employee;

import java.util.Scanner;

public class EmployeeManagement {
    private Employee[] arrEmployees = new Employee[100];
    int currentIndex = 0;

public static void main(String[] args) {
    EmployeeManagement employeeManagement = new EmployeeManagement();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("**********************MENU********************");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Hiển thị danh sách nhân viên");
            System.out.println("3. Tính lương cho nhân viên");
            System.out.println("4. Tìm kiếm nhân viên theo tên nhân viên");
            System.out.println("5. Cập nhật thông tin nhân viên");
            System.out.println("6. Xóa nhân viên theo mã nhân viên");
            System.out.println("7. Sắp xếp nhân viên tăng dần");
            System.out.println("8. Thoát");
            System.out.println("Chọn chức năng theo số");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    employeeManagement.inputEmployee(sc);
                    break;
                case 2:
                    employeeManagement.displayListEmployee();
                    break;
                case 3:
                    employeeManagement.calSalary(sc);
                    break;
                case 4:
                    employeeManagement.searchName(sc);
                    break;
                case 5:
                    employeeManagement.updateEmployee(sc);
                    break;
                case 6:
                    employeeManagement.deleteEmployee(sc);
                    break;
                case 7:
                    employeeManagement.sortEmployeeByCalSalary();
                    break;
                case 8:
                    System.exit(0);
                    break;

            }
        }
    }

    public void inputEmployee(Scanner sc) {
        System.out.println("Nhập vào số lượng nhân viên cần thêm: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            arrEmployees[currentIndex] = new Employee();
            arrEmployees[currentIndex].inputData(sc);
            arrEmployees[currentIndex].calSalary();
            currentIndex++;
        }
    }

    public void displayListEmployee() {
        for (int i = 0; i < currentIndex; i++) {
            arrEmployees[i].displayData();
        }
    }

    public void calSalary(Scanner sc){
        System.out.println("Nhập vào mã nhân viên cần tính lương: ");
        String id = sc.nextLine();
        for (int i = 0; i < currentIndex; i++) {
            if (arrEmployees[i].getId().equals(id)) {
                arrEmployees[i].calSalary();
                System.out.println("Lương của nhân viên "+arrEmployees[i].getName()+" là: "+arrEmployees[i].getSalary());
                return;
            }
        }
        System.err.println("Không tìm thấy mã nhân viên này");
    }

    public void searchName (Scanner sc){
        System.out.println("Nhập vào tên nhân viên cần tìm: ");
        String name = sc.nextLine();
        for (int i = 0; i < currentIndex; i++) {
            if (arrEmployees[i].getName().equals(name)) {
                arrEmployees[i].displayData();
                return;
            }
        }
        System.err.println("Không tìm thấy tên nhân viên nào");
    }

    public void updateEmployee (Scanner sc){
        System.out.println("Nhập vào mã nhân viên cần chỉnh sửa: ");
        String employeeUpdate = sc.nextLine();
        for (int i = 0; i < currentIndex; i++) {
            if (arrEmployees[i].getId().equals(employeeUpdate)) {
                arrEmployees[i].displayData();
                return;
            }
        }
        System.err.println("Không tìm thấy mã nhân viên này");

    }

    public void deleteEmployee (Scanner sc){
        System.out.println("Nhập vào mã nhân viên cần xóa: ");
        String employeeDelete = sc.nextLine();
        int indexDelete = -1;
        for (int i = 0; i < currentIndex; i++) {
            if (arrEmployees[i].getId().equals(employeeDelete)) {
                indexDelete = i;
                break;
            }
        }
        if (indexDelete != -1) {
            for (int i = indexDelete; i < currentIndex; i++) {
                arrEmployees[i] = arrEmployees[i + 1];
            }
            arrEmployees[currentIndex-1] = null;
            currentIndex--;
        }else {
            System.err.println("Mã nhân viên không tồn tại");
        }
    }

    public void sortEmployeeByCalSalary() {
        for (int i = 0; i < currentIndex - 1; i++) {
            for (int j = i + 1; j < currentIndex; j++) {
                if (arrEmployees[i].getSalary() > arrEmployees[j].getSalary()) {
                    Employee temp = arrEmployees[i];
                    arrEmployees[i] = arrEmployees[j];
                    arrEmployees[j] = temp;
                }
            }
        }
        displayListEmployee();
    }
}
