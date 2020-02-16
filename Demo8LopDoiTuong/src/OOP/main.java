/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import Java1.Teacher;



/**
 *
 * @author minhdq
 */
public class main {
    public static void main(String[] args) {
        // kbao ktao doi tượng
        Student sv1 = new Student();
        Student sv2 = new Student();
        
        Teacher gv1 = new Teacher();
        
        sv1.setName("java1");
        sv1.code = "PT2323";
        sv1.birthday = 2000;
        
        sv2.name = "java2";
        
        System.out.println("Name : " + sv1.getName());
        System.out.println("Name : " + sv2.name);
    }
    
}

//
//class Teacher{
//
//}