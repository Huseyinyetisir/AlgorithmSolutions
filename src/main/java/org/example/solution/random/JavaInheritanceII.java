package org.example.solution.random;

public class JavaInheritanceII {


        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            class Arithmetic{

                int add(int a, int b){
                    return a+b;
                }
            }

            class Adder extends Arithmetic{

                String getName(){
                    return "Arithmetic";
                }

            }
            Adder adder = new Adder();
            System.out.println("My superclass is: " + adder.getName() );
            System.out.println(adder.add(20,5) +" " + adder.add(20,6) +" " +  adder.add(20,7) );
        }
    }

