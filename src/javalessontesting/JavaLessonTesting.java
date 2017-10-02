/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalessontesting;

/**
 *
 * @author 96416
 */
public class JavaLessonTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*try{
            checkAge(12);
        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }*/
        
        InvalidTest t = new InvalidTest();
        t.callingmethod();
        
    }
    public static void checkAge(int age){
        if (age<18){
            throw new ArithmeticException("you have not attained voting age");
        }else{
            System.out.println("you are eligible to vote");
        }
    }
    
    public  static class InvalidTest {
        public void checkAge(int age)throws InvalidAgeException{
            if (age<18){
                throw new InvalidAgeException ("you have not attained voting age");
            }else{
                System.out.println("you are eligible to vote");
            }
    }
        
        
        public void callingmethod(){
            try{
        checkAge(12);
        }catch(InvalidAgeException iae){
                System.out.println(iae.getMessage());
        }
    }
    
}
    
}
    
    
