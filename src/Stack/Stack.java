package Stack;

import java.util.Scanner;



public class Stack {


       static int top=-1, stackArray[], size,meter;
       static Scanner scanner=new Scanner(System.in);



    public static void main(String[] args) {

        char ch;
        int choice=0;


        System.out.println("Enter The Size of Stack");
        size=scanner.nextInt();
        stackArray=new int[size];
        meter=size;


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


    private static void push() {

        if(top==(size-1)) {
            //Full Stack
           display();
        }

        if(top==-1){
            // If The stack is not full
            System.out.println("Enter Any "+meter+" Integer ");
            for (var i=0;i<stackArray.length;i++){
                stackArray[i]=scanner.nextInt();
                top++;
                meter--;
            }
        }
       else if(top!=-1 && top!=(size-1)) {
            System.out.println("Enter Any "+meter+" Integer ");
           for(var i=(top+1);i<stackArray.length;i++){
              stackArray[i]=scanner.nextInt();
               top++;
               meter--;

    }
}


    }

    private static void display() {

        if(top==-1)
            System.out.println(" !!! The Stack is Empty (Please Insert Some Value to Move ) Size is "+(top+1));

        else if(top==(size-1)) {
            System.out.println(" !!! The Stack is Full" + " \n Size " + (top+1));
            System.out.println("\nThe Stack");
            System.out.println("---------------------------");
            for (var i=top;i>=0;i--){
                System.out.println(stackArray[i]);
            }

        }

        else {
            System.out.println(" Size " + (top+1));
            System.out.println("\nThe Stack");
            System.out.println("---------------------------");
            for (var i=top;i>=0;i--){
                System.out.println(stackArray[i]);
            }
        }



    }

    private static void pop() {

        if(top==-1)display();  // no elements to delete

        else {
            System.out.println(stackArray[top]+" has to pop !!!");
            for (var i=stackArray.length-1;i>=0;i--) {
                stackArray[i]--;
                top--;
                meter++;
                break;

            }

        }
    }


    }





