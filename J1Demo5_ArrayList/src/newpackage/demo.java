/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;

/**
 *
 * @author minhdq
 */
public class demo {

    public static void main(String[] args) {
        
        ArrayList a = new ArrayList();
        
        a.add("Học nhanh còn đi ngủ");
        a.add(343.222);
        a.add("Cố học cho xong");
        
        double x = (Double)a.get(1);
        System.out.println(x);
        // xuất list vừa gõ 
        for(int i = 0; i < a.size(); i++){
            Object xxx = a.get(i);
            System.out.print(xxx+ "\n");
        }
        // for each for cải tiến for rút gọn)
        for(Object xx : a){
            System.out.println(xx);
        }
        
        
        
        ArrayList <String> b = new ArrayList<>();
        b.add("Minh");
        b.add("cố gắng lên, thầy mệt rồi :))");
        
        for(int i = 0; i < b.size(); i++){
            String xxx = b.get(i);
            System.out.println(xxx + "\n");
        }
        for(String xx : b){
            System.out.println(xx);
        }
        
        ArrayList<SV_Poly> listSV = new ArrayList<>();
        
        
        
                
//        for(int i = 0; i < b.size(); i++){
//            String x = b.get(i);
//            System.out.println(x);
//        }
//        // for each
//        for(String xx : b){
//            System.out.println(xx);
//        }
//        
//        for(Object xx : a){
//            System.out.println(xx);
//        }
        
        
    }
}
