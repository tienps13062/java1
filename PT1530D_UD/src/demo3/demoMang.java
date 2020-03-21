/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class demoMang {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        bai11();
    }
    public static void bai11(){
    // b1 nhập kích thước mảng
        System.out.print("Mời nhập size của mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        // b2 khai báo và khởi tạo mảng
        String hoTen[] = new String[size];
        int tuoi[] = new int[size];
        
        // b3 Nhập vào mảng
        System.out.println("Nhập vào từng thành viên");
        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập tên TV %d: ", i + 1);
            hoTen[i] = sc.nextLine();
            System.out.printf("Nhập tuổi TV %d: ", i + 1);
            tuoi[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("");
        // xuất
        for(int i = 0; i < hoTen.length; i++){
            System.out.printf("TV thứ %d có tên là %s và tuổi là %d\n", (i + 1), hoTen[i], tuoi[i] );
        }
        // cách 1 
        int max = tuoi[0];
        int viTri = 0 ;
        for(int i = 0; i < size; i ++){
            if(tuoi[i] > max){
                max = tuoi[i];
                viTri = i;
            }
        }
        System.out.println("");
        System.out.printf("Ng cao tuổi nhất là : %d, có thê là: %s\n", tuoi[viTri], hoTen[viTri]);
        System.out.println("");
        
        Arrays.sort(tuoi);
        System.out.println(Arrays.toString(tuoi));
        
        // cách 2
        int maxTuoi;
        String maxTen;
        for( int i = 0; i < size - 1; i ++){
            for(int j = i + 1; j < size; j++){
                if(tuoi[i] > tuoi[j]){
                    maxTuoi = tuoi[i];
                    tuoi[i] = tuoi[j];
                    tuoi[j] = maxTuoi;
                    
                    maxTen = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = maxTen;
                }
            }
        }
        System.out.println("Min tuổi là: " + tuoi[0] + " có tên là: " + hoTen[0]);
        
        System.out.println("Max " + tuoi[size - 1]);
        
        // thao tác mảng
        System.out.println(Arrays.toString(tuoi));
        System.out.println(Arrays.toString(hoTen));
        
    }
    public static void bai10(){
        // b1 nhập kích thước mảng
        System.out.print("Mời nhập size của mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        // b2 khai báo và khởi tạo mảng
        double canNang[] = new double[size];
        // b3 Nhập vào mảng
        System.out.println("Nhập vào từng cân nặng");
        for (int i = 0; i < size; i++) {
            System.out.printf("Phần tử thứ %d: ", i + 1);
            canNang[i] = sc.nextDouble();
        }
        // b4 xuất mảng
        System.out.print("\nMảng vừa nhập là: ");
        for (int i = 0; i < canNang.length; i++) {
            System.out.print(canNang[i] + "  ");
        }
        
        for(int i = 0; i < size; i++){
            if(canNang[i] % 2 == 0){
                System.out.print("Tuổi chia hết cho 2: "+ canNang[i]);
            }
        }
        // tìm max
        double max = canNang[0];
        
        for(int i = 1; i < size; i ++){
            if(canNang[i] > max){
                max = canNang[i];
            }
        }
        System.out.println("Cân nặng max: " + max);
        
    }
        
        
}
