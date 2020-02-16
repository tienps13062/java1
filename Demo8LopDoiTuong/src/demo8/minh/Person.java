/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo8.minh;

/**
 *
 * @author minhdq
 */
public class Person {
        String name;
	int age;
	float height;
        
        public Person(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

    Person() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        public void eat(String foodName) {
		System.out.println(name + " is eating "+ foodName);
	}
	
	public int getAge() {
		return age;
	}
}
