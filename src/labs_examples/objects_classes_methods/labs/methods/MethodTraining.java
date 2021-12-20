package labs_examples.objects_classes_methods.labs.methods;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class MethodTraining {

    public static void main(String[] args){
        System.out.println(largest(10,50,100,67,120));
        System.out.println(count("Hello"));
        System.out.println(List(10,2, 1 ));
        System.out.println(List(10,2,1).size());


    }
    //Method overloading
    public static int test (int a) {
        return a;
    }
    public static int test(int a,int b){
        return a+b;
    }
//returns the largest number
    public static int largest(int... numbers){
      int value = numbers[0];
      for(int i = 1; i< numbers.length;i++){
          if(numbers[i]> value){
              value = numbers[i];
          }
      }
 return value;
    }

    //returns all consanents
    public static String count(String name){
        int number =0;

        String vowels ="aeiou";
     if(vowels.indexOf(name.charAt(number))==-1);

return name;
    }
    //prime or not

   // public static int prime(int number){
//ArrayList
    public static ArrayList<Integer> List(int maxNum, int divisor1, int divisor2){
        ArrayList<Integer> number= new ArrayList<Integer>();
        number.add(2);
        number.add(4);
        number.add(6);
        number.add(8);
        number.add(10);
        return number;
    }
//return an Array
    //public static int[] test(int[] number){

    }//}

