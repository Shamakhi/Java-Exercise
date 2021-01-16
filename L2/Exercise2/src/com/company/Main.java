package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
	Course course=new Course();

	    course.name[0]="RiyaziOmomi2";
	course.unit[0]=3;
	course.pish[0]="RiyaziOmomi1";


	    course.name[1]="Andishe2";
	course.unit[1]=2;
	course.pish[1]="Andishe1";


	    course.name[2]="ZabanT";
	    course.unit[2]=3;
	    course.pish[2]="ZabanPish";


	        course.name[3]="Algorithm";
	        course.unit[3]=3;
	        course.pish[3]="Hoshmasnoei";

course.name[4]="Madar";
course.unit[4]=3;
course.pish[4]="SakhtAfzar";
course.ham[4]="NarmAfzar";



        System.out.println("enter the course :\nRiyaziOmomi2\nAndishe2\nZabanT\nAlgorithm\nMadar\n");
        String temp=input.next();
        for(int i=0;i<5;i++){
            if(temp.equals(course.name[i])){
                System.out.println("Units"+course.unit[i]+ "\n Pishniaz"+course.pish[i]+"\n Hamniaz"+course.ham[i]);
                break;
            }
        }

    }
}
