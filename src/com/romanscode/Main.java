package com.romanscode;

public class Main {

    public static void main(String[] args){
        //Task1

import java.util.Random;
        public class LitsJava {
            public static void main(String[] args) {


                var random = new Random();
                for(int i=0;i<=10;i++){
                    char c=(char)(random.nextInt(26)+'a');
                    System.out.println(c);
                }
            }
        }
//Task #2
        public class LitsJava {
            public static void main(String[] args) {
                var a = 0;
                for(int i =1;i<=15;i++) {
                    if (i % 2 == 0) {
                        a = a + i;
                    }
                }
                System.out.println(a);
            }
        }



//Task #3
import java.util.Random;
        public class LitsJava {
            public static void main(String[] args) {
                var a = new Random().nextInt(3000);
                System.out.println(a);
                if(a%3==0){
                    System.out.println("div on 3");
                }
                else if(a%5==0){
                    System.out.println("div on 5");
                }
                else if(a%7==0){

                }
                else {
                    System.out.println("doesnt div");
                }
            }


        }
//Task 4
import java.util.Random;
        public class LitsJava {
            public static void main(String[] args) {
                var random = new Random().nextInt(500);
                var a = 1;
                var b = 0;
                while (a <= 50) {
                    a++;
                    if (random % 7 == 0) {
                        System.out.println(random);
                        b = b + random;
                    }
                    random = new Random().nextInt(500);
                }
                System.out.println("сума "+b);
            }
        }



//Task#5
import java.util.Random;
        public class LitsJava {
            public static void main(String[] args) {
                var a = new Random().nextInt(3000);
                var sum = 0;
                var c = 1;
                while (c <= 15) {
                    sum= a + sum;
                    c++;
                }
                var medium=sum/15;
                System.out.println(sum);
                System.out.println(medium);
            }
        }
    }
}
