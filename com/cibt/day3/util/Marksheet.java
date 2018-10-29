/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.day3.util;

import java.util.Scanner;

public class Marksheet{

    String[] subjects;
    double[] marks;
    Scanner input;

    public Marksheet(String[] subjects){
        input=new Scanner(System.in);
        input=new Scanner(System.in);
        this.subjects=subjects;
        marks=new double[this.subjects.length];
    }
    public  void entry(){
        for(int i=0;i<subjects.length;i++){
            System.out.printf("\r\nEnter marks for  %S",subjects[i]);
            marks[i]= input.nextInt();

        }
    }

    public double getTotal(){
        double total=0;
        for(int i=0;i<marks.length;i++){
            total +=marks[i];
        }
        return total;
    }  

    public boolean isfail(){
        for(int i=0;i<marks.length;i++){
            if(marks[i]<32){
                return true;
    
            }
        }
        return false;
    }
    public double getPercentage(){
        return getTotal()/subjects.length;
    }
    public  void getGrade(){
        double p=getPercentage();
        if(p > 80){
            System.out.println("distinction"); 
         }else if(p< 80 && p >=60){
             System.out.println("First Divison");
         }else if(p< 60 && p>=45){
             System.out.println("Second Divison");
         }else{
             System.out.println("Third Divison");
         }
    }
     
    
}