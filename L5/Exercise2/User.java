package com.company;

public class User {
   private static User user;
   private synchronized static User getInstance(){
       if(user==null){
           User user=new User();
       }
       return user;
   }
   private User(){};
   public static void username(){ System.out.println("Shamakhi1999");}
   public static void password(){System.out.println("the password is 1234"); }
   public static void  name(){ System.out.println("the name is Abolfazl"); }
   public static void age(){ System.out.println("the age is 22"); }

}
