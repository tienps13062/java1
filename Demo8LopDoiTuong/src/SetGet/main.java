/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetGet;

import Java1.Teacher;

/**
 *
 * @author minhdq
 */
public class main {
    public static void main(String[] args) {
        Student student1 = new Student("java1", "PT23232", 2002);
        Student student2 = new Student("java2", "PT100010", 2000);
//        Student student1 = new Student();
//        Student student2 = new Student();
        
//        student1.setBirthday(2000);
//        student1.setCode("PT 010001");
//        student1.setName("Java1");
//        
//        student2.setBirthday(1999);
//        student2.setCode("PT 01223231");
//        student2.setName("Java2");
       
        Teacher gv1 = new Teacher();
        
        System.out.println("Student Info ");
        student1.showInfo();
        student2.showInfo();
        
        


    }
}
