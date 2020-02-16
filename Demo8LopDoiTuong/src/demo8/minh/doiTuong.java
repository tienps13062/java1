/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo8.minh;

/**
 *
 * @author Minh
 */
public class doiTuong {
    public static void main02(String[] args) {
        
        String name;
        float height;
        int age;
        name = "Java chán kinh khủng";
        height = 1.7f;
        age = 21;
        System.out.println(name);
        System.out.println(height);
        System.out.println(age);
        
    }
    public static void main01(String[] args) {
        Person a = new Person();
        // khởi tạo xong -> gán gtri
        //ta sẽ tạo một đối tượng từ lớp con người và cung cấp thông tin cho nó:
        //Ta sẽ dùng cú pháp Person a = new Person(); 
        //có nghĩa là tạo đối tượng a thuộc lớp con người.
	a.name = "Vy";
	a.age = 21;
	a.height = 1.7f;
	System.out.println(a.name);
        System.out.println(a.height);
        System.out.println(a.age);
        
        a.eat("Rice");
        int age = a.getAge();
	System.out.println("His age:"+age);
        
    }
    public static void main(String[] args) {
        Person a = new Person("Vy", 21, 1.7f);
	a.eat("Rice");
//        System.out.println(a.name);
        int age = a.getAge();
	System.out.println("His age:"+age);
	}
}
