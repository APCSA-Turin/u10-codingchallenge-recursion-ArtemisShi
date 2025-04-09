    package com.example.project;

    public class RecursionChallenge {

            public static int bunnyEars(int n){
                if(n>1){
                    return 2+ bunnyEars(n-1);
                }
                return 2;
            }
        
            public static int factorial(int n){
                if(n>1){
                    return n* factorial(n-1);
                }
                return 1;
            }

            public static int sumNumbers(int n){
                if(n>1){
                    return n+sumNumbers(n-1);
                }
                return 1;
            }

            public static String countDown(int n){
                if(n>1){
                    System.err.print(n);
                    System.out.print(","); 
                    return countDown(n-1);
                }
                if(n==0){
                    return "Blast Off!";
                }
                return n+" Blast Off!";
            }

            public static int power(int x, int n){
                if(n>1){
                    return x*power(x,n-1);
                }
                
                return x*n;
            }

            public static int fib(int n){
                if(n==0){
                    return 0;
                }
        
                if(n==2){
                    return 1;
                }
                if(n==1){
                return 1;
                }
                return fib(n-2)+fib(n-1);
            }

            public static int countX(String s){
                if(s.length()>1){
                    return countX(s.substring(0, s.length()/2))+countX(s.substring(s.length()/2));
                }
                if(s.indexOf("x")>=0){
                return 1;
                }
                else{
                    return 0;
                }
            }

            public static String changePi(String s){
                if(s.length()>=2&&(!s.substring(0,2).equals("pi"))){
                    return s.substring(0,1)+changePi(s.substring(1));
                }
                else{
                    if(s.length()>=2){
                        return 3.14+changePi(s.substring(2));
                    }
                    else{
                        return s;
                    }
                }
                
            }


            public static String reverse(String s){
                if(s.length()>1){
                    return reverse(s.substring(1))+reverse(s.substring(0,1));
                }
                return s.substring(0);
            }

            public static Boolean isPalindrome(String s){
                if(s.length()==1||s.length()==0){
                    return true;
                }
               
                if(s.substring(0,1).equals(s.substring(s.length()-1,s.length()))){
                    return isPalindrome(s.substring(1,s.length()-1));
                }
                
                if(s.length()==2){
                    return s.substring(0).equals(1);
                }
                else{
                    return false;
                }
                
            }

    }