package com.quiz.app;
import java.util.Scanner;
import com.quiz.service.*;
public class QuizApp{
  
  public static void main(String []args){
    Playground p1=new Playground();
    System.out.println("---------------Welcome to TCA quiz playground--------------");
    String result=p1.playQuiz();
    System.out.println(result);
    System.out.println("type 'view' show answer::");
    Scanner sc=new Scanner(System.in);
    if(sc.next().equals("view")) {
    	System.out.println("---------------Viewed Answers--------------");
    	p1.viewAnswer();
    }
    sc.close();
   
    
  }
  
}
