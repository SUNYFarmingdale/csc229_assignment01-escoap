
package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class NewClass {
    
     public static void main(String[] args) {
        
        Course crs = new Course(); //init the course object
        crs.setCode("codetest123");
        crs.setID(123456);
        crs.setName("Andrew");
        System.out.print("Name: ");
        System.out.println(crs.getName());
        System.out.print("Code: ");
        System.out.println(crs.getCode());
        System.out.print("ID: "); 
        System.out.println(crs.getID());
    }
    
}
