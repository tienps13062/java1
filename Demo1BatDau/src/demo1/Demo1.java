/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;

/**
 *
 * @author minhd_000
 */
public class Demo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // các bạn code tất vào đây
        int a = 5;
        int b = 10; 
        int c = 5;
        int tong = a + b + c;
        int hieu = a - b;        
       // quy tắc Lạc Đà
        double diemToan = 8;
        double diemLy = 9;
        double diemHoa = 8.5;
        double diemTrungBinh = (diemToan*2 + diemLy + diemHoa)/4;
       
        System.out.println("Điểm trung binh là : "+ diemTrungBinh);
        System.out.println("Bạn Minh được "+ diemTrungBinh +" điểm ");
        System.out.printf("Bạn Minh được %.3f điểm \n", diemTrungBinh);
        System.out.printf("1",diemTrungBinh);
//        System.out.println("Tổng 2 số là : " + tong); // a+b
//        System.out.println("Hiệu 2 số là : " + hieu);
//        System.out.println("Tích 2 số là : " + a*b);
//        System.out.println("Tích 2 số là : " + a*b);
        
        
         
        
    }
    
}
