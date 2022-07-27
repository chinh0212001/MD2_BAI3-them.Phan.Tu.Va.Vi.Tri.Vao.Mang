import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int[]array = {1,2,3,4,5,6,0,0,0,0};
        System.out.println("Nhap 1 gtri ");
        // nhập giá trị muốn chèn !!!
        int X = scanner.nextInt();
        // X là vi trí phần tử muốn thay vào !!!
        System.out.println("nhap X");
        int i = scanner.nextInt();
        if (i<=1 || i >= array.length -1){
            System.out.println("ko chen dc phan tu vao mang");
            return;
        }
        System.out.printf("%-12s","mang cu : ");
        for (int value : array ){
            System.out.printf("%-5d",value);
        }
        System.out.printf("%n%-12s","Mang moi : ");
        System.arraycopy(array,i,array,i+1,array.length- 1- i);
        array[i] = X;
        for (int value : array){
            System.out.printf("%5d",value);
        }
    }
}