/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetGet;

import java.util.Calendar;

/**
 *
 * @author minhdq
 */
public class Student {
     String name;
    public String code;
    public int birthday;
    
    public Student(String sname, String scode, int sbirthday){
    
        this.name = sname;
        this.code = scode;
        this.birthday = sbirthday;
    }
    // setter
    public void setName(String sName){
        this.name = sName;
    }
    public void setCode(String sCode){
        this.code = sCode;
    }
    public void setBirthday(int sBirthday){
        this.birthday = sBirthday;
    }
    // getter
    //Lưu ý: kiểu trả về của nó ko cố định,
    //mà tuỳ vào thuộc tính
    
    public String getName(){
        return this.name;
    }
    public String getCode(){
        return this.code;
    }
    public int getBirthday(){
        return this.birthday;
    }
    // phuong thuc in ra thong tin sv
    public void showInfo(){
        System.out.println("---------------");
        System.out.println("Name \t\t: " + this.getName());
        System.out.println("Code \t\t: " + this.getCode());
        System.out.println("Birthday \t: " + this.getBirthday());
        System.out.println("Age \t\t: " + this.getAge());
    }
    // phuong thuc tinh tuoi
    public int getAge(){
        Calendar now = Calendar.getInstance();
        return now.get(Calendar.YEAR) - this.getBirthday();
 
    }
}
