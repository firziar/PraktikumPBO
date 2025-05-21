/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presistent;

/**
 *
 * @author firzi
 */
public class Person {
    private int id;
    private String name;
    
    public Person(String name){
        this.name = name;
    }
    
    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
}