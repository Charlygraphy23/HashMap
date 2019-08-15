package Stack;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayStack {

   static ArrayList<Integer> list=new ArrayList<>();
   static int arraySize,choice,meter;
   static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        char ch;

        System.out.println("Enter Stack Size ");
        arraySize=scanner.nextInt();
        meter=arraySize;



        do {
            System.out.println("---Main Manu ---");
            System.out.println("    1 Push    ");
            System.out.println("    2 Pop     ");
            System.out.println("    3 Display ");
            System.out.println("    4 Exit    ");
            System.out.println("----------------\n");
            System.out.print("Enter Your Choice ");
            choice=scanner.nextInt();

            switch (choice){

                case 1: push();
                    break;
                case  2: pop();
                    break;
                case 3: display();
                    break;
                case 4: System.exit(0);
                    break;
                default:
                    System.out.println("Enter a Valid Choice");
            }

            System.out.println("Do you Want to Continue ?");
            ch=scanner.next().charAt(0);

        }while (ch=='y'||ch=='y');

    }

    private static void display() {


        if (list.size() == arraySize ) {
            System.out.println(" !!! The Stack is Full" + " \n Size " + list.size());
            System.out.println("\nThe Stack");
            System.out.println("---------------------------");
            for (var i = arraySize - 1; i >= 0; i--)
                System.out.println(list.get(i));

        }

        else if(list.size()==0)
            System.out.println(" !!! The Stack is Empty (Please Insert Some Value to Move ) Size is "+list.size());
        else
        {
            System.out.println(" Size " + list.size());
            System.out.println("\nThe Stack");
            System.out.println("---------------------------");
            for (var i =(list.size()-1); i >= 0; i--)
                System.out.println(list.get(i));
        }
    }

    private static void pop() {

       if(list.size()==0) display(); // for empty stack

        else {
           System.out.println(list.get((list.size()-1))+" needs to be pop");
            for (var i=(list.size()-1);i>=0;i--){
                list.remove(i);
                meter++;
                break;
            }
       }



    }

    private static void push() {

        if(list.size()==arraySize){
            display();// full stack
        }

       else if(list.size()==0) {
            // If The stack is empty
            System.out.println("Enter Any "+meter+ " Integer ");
            for(var i=0;i<arraySize;i++){
                var value=scanner.nextInt();
                list.add(i, value);
                meter--;
            }
        }


        else if(list.size()!=arraySize && list.size()!=0){
            System.out.println("Enter Any " + meter+ " Integer ");
              for(var i=list.size();i<arraySize;i++)
              {
                  var value=scanner.nextInt();
                  list.add(i, value);
                  meter--;
              }

        }

    }


}


