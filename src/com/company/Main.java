package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	//zadanie 1
        int max=0, min=0;
        int[] array1=new int[26];
        for (int i = 0; i < 26; i++) {
      array1[i]=i;
        }
        for (int i = 0; i <26 ; i++) {
            if(i<min) {
                min = array1[i];
            }
            if(i>max){
                max=array1[i];
            }
    }
        for (int i = 0; i <26 ; i++){
            if(array1[i]==min){
                array1[i]=max;
            }
            else{
                if(array1[i]==max){
                    array1[i]=min;
            }
        }
    }
        System.out.println(Arrays.toString(array1));
}}
