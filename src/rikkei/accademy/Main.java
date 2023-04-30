package rikkei.accademy;

public class Main {
    public static void main(String[] args) {
        // hiển thị các số tự nhiên từ 1 đến 100 sử dụng cấu trúc lặp for
        for (int i = 1; i <=100; i++ ) {
            System.out.print(i+",");
            if (i%10==0){
                System.out.println();
            }
        }
    }
}
