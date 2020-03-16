/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo3;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class demo3 {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
     
        // B1 nhập size cho mảng
        System.out.print("Nhập kích thức mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        
        // b2 khai báo và khởi tạo mảng
        int tuoi[] = new int[size];
        // B3 nhập 
        System.out.println("Nhập phần tử mảng");
        
        for(int i = 0; i < size; i++){
            System.out.printf("Phần tử thứ %d: " , i + 1);
            tuoi[i] = sc.nextInt();
        }
        // b4 xuất
        System.out.println("Mảng vừa nhập là: ");
        for(int i = 0; i < tuoi.length; i++){
            System.out.print(tuoi[i] + "  ");
        }
        System.out.println("");
        
        
    }
    public static void vidu(){
    int [] a = {2,53,34,23};
        double b [] = {23232.2344,243424.3424,24242,42424.2222};
        
        System.out.println(a[0]+"\n" + b [2]);
        a [0] = 12;
        System.out.println(a[0]);
        
        String hoTen[] = new String[4];
        hoTen[0] = "là gì chả đc";
        hoTen[3] = "Ko có ng yêu khổ thật";
        hoTen[4] = "Cà khịa làm gì cho mệt";
        System.out.println(hoTen[3]);
    }
}
