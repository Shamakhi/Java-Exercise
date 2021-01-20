package com.company;
import java.io.*;
public class File {
public void write(){
Entity entity=new Entity();
try{
FileOutputStream fileOutputStream=new FileOutputStream("E:\\Program\\java\\javax.txt");
ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
objectOutputStream.writeObject(entity.getName());
objectOutputStream.writeObject(entity.getFamilyname());
objectOutputStream.writeObject(entity.getFathername());
objectOutputStream.close();
fileOutputStream.close();
}catch (Exception e){
    System.out.println("couldnt read file"+e.getMessage());
}
}
}
