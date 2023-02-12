package IllegalTriangleException;

import Case_Study.services.Service;
import IllegalTriangleException.IllegalTriangleException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        try {
            int canh1 = prompt.nextInt();
            int canh2 = prompt.nextInt();
            int canh3 = prompt.nextInt();
            if (canh1 < 0 || canh2 < 0 || canh3 < 0) {
                throw new IllegalTriangleException("Phai lon hon khong");
            } else if ((canh1 + canh2) > canh3 || (canh2 + canh3) > canh1) {
                throw new IllegalTriangleException("Loi hai canh be hon");
            }
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Phải nhập số");
        }
    }
}
