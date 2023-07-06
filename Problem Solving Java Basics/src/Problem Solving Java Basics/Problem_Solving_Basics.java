/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import java.util.Scanner;

/**
 *
 * @author Mostafa Ail
 */
public class Problem_Solving_Basics {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        //Scanner input = new Scanner(System.in);
        
        //Calculate the area of Rectangle


        /*float length , width , area;
        
        Scanner input = new Scanner(System.in);
           
            System.out.print("Please Enter The Length of Rectangle: ");
            length = input.nextInt();
        
            System.out.print("Please Enter The Width of Rectangle: ");
            width = input.nextInt();
        
        area = length * width;
        System.out.printf("The Area of Rectangle is: %f \n", area);*/
        
        
        
        
        /*float mark;
        System.out.print("Please Enter Your Mark: ");
        Scanner input = new Scanner(System.in);
        mark = input.nextInt();
        if ( mark >= 50 ){
            System.out.println("You are Passed");
        }
        else{ 
            System.out.println("You are Failed");
            }*/
        
        
        
        
    /*float num;
        System.out.print("Please enter your number: ");
        Scanner input = new Scanner(System.in);
        num = imput.nextInt();
            if(num >= 0){
                System.out.println("This is a Positive Number");
            
                if(num %2 == 0){
                System.out.println("This is an Even Number");
                }
                else{
                        System.out.println("This is an Odd Number");
                    }
            }            
            else{
                    System.out.println("This is a Negative Number & Try Enter another Number");
                }*/
    
    
    
    
    /*float num1 , num2;
    
    Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number1: ");
        num1 = input.nextInt();
        
        System.out.print("Please enter your number2: ");
        num2 = input.nextInt();
        
            if(num1 == num2){
                System.out.println("Two Numbers are Equle");
            }
                else if(num1 >= num2){
                System.out.println("Number1 is grater than Number2 and Number1 is: ");
                }
                else{
                        System.out.println("Number2 is grater than Number1 and Number2 is: ") ;
                    }*/
    
    
    
    
    
    /*char grade;
    String message;
    
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Please Enter Your Grade: ");
        grade = reader.next().charAt(0);                
           
    switch(grade){
    
        case 'A': 
                    System.out.println("Excellant");
                break;
        case 'B': 
                    System.out.println("Very Good");
                break;        
    
        case 'C': 
                    System.out.println("Good");
                break;
        case 'D': 
                    System.out.println("Passed");
                break;        
        case 'F': 
                    System.out.println("Failed");
                break;
            
            default:
                    System.out.println("You are enter an Invaild Gread");
    }*/




    /*int num1, num2, result, choice;
    String message;
    
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Ther ara Your Chioce to do some calculations on two numbers are:\n 1. Add two numbers \n 2. Subtract two numbers \n 3. Multiply two numbers \n 4. Divide two numbers");
        System.out.print("Please Enter Your Choice: ");

        choice = reader.nextInt();                
        
    switch(choice){
    
        case 1: 
                    System.out.printf("Please Enter your Positive Integers Numbers: ");
                    System.out.print("Num1: ");
                    num1 = reader.nextInt();
                    System.out.print("Num2: ");
                    num2 = reader.nextInt();
                    result = num1 + num2;
                    System.out.println("The Result of Addition: " + result);
                break;
        case 2: 
                    System.out.println("Please Enter your Positive Integers Numbers: ");
                    System.out.print("Num1: ");
                    num1 = reader.nextInt();
                    System.out.print("Num2: ");
                    num2 = reader.nextInt();
                    result = num1 - num2;
                    System.out.println("The Result of Subtraction: " + result);
                break;        
    
        case 3: 
                    System.out.println("Please Enter your Positive Integers Numbers: ");
                    System.out.print("Num1: ");
                    num1 = reader.nextInt();
                    System.out.print("Num2: ");
                    num2 = reader.nextInt();
                    result = num1 * num2;
                    System.out.println("The Result of Multiplication: " + result);
                break;
        case 4: 
                    System.out.println("Please Enter your Positive Integers Numbers: ");
                    System.out.print("Num1: ");
                    num1 = reader.nextInt();
                    System.out.print("Num2: ");
                    num2 = reader.nextInt();
                    result = num1 / num2;
                    System.out.println("The Result of Division: " + result);
                break;        
            default:
                    System.out.println("You are enter an Invaild of Choice");
    }*/    
    
    
    
    
    /*char letter;
    String vowel = "This is a vowel leeter";
    
    System.out.print("Please Enter Your Vowel Letter: ");
    Scanner input = new Scanner(System.in);
    letter = input.next().charAt(0);
    
    switch(letter){
    
        case 'a':
        case 'e':
        case 'o':
        case 'u':
        case 'i':
            System.out.println("This is a Vowel Letter");
            break;
        default: System.out.println("This is not a Vowel Letter");
    
    }*/
    
    
    
    /*float grade = 0 ,sum = 0,average;
    int count = 1;
    
    Scanner input = new Scanner(System.in);
    
    while(count <= 6 && grade != -1){
    
        System.out.print("Please Enter the Grade of Studant num " + count + ": ");
        grade = input.nextInt();
        sum+= grade; 
        count++;
    
    }
  
        average = sum/6;
        System.out.println("The Average of grade of six Studants is: " + average);*/
    
    
    
    
    /*Boolean posnum = true;
    int count = 1;
    float num, sum = 0;
    Scanner input = new Scanner(System.in);
    
    while(posnum && count <= 3){
        System.out.print("Please Enter a Positive Number" + count + ": ");
        num = input.nextFloat();
        if(num < 0){
            posnum = false;
        }
        else{
                sum+=num;
                    }
        count++;
        }
        System.out.println("Sum of input number is: "+ sum);*/
    
    
    
    
    /*Boolean stillplaying = true;
    int gussenum, randnum;
    
    Scanner input = new Scanner(System.in);
    randnum = (int)(Math.random()*100);
    
        System.out.println("The Generanted Number is: " + randnum);
        System.out.print("Please Enter a Gusse Number that you think between 0 and 100: ");
        gussenum = input.nextInt();
    while(stillplaying){
    
        
        
        
            
            if(gussenum > 100){
            System.out.print("The Gusse Number you are enter is greater than 100 try another number between 0 and 100: ");
            gussenum = input.nextInt();
            
            if(gussenum > randnum){
                  
                System.out.print("The Gusse Number you are enter is greater than the Random Number try another number: ");
                gussenum = input.nextInt();   
            }
            
            }
        
        
        else if(gussenum > 0){
                        System.out.println("The Gusse Number you are enter is less than 0 try another number: ");
                        gussenum = input.nextInt();
        
        if(gussenum < randnum){
                System.out.println("The Gusse Number you are enter is less than the Random Number try another number: ");
        
                   gussenum = input.nextInt();
        }
        }
        
        else{
                System.out.println("You gusse correct well done, You Win!");
                stillplaying = false;
            }
        
    }*/ 
    
    /*float grade = 0 ,sum = 0 ,average;
    int count = 1;
    Scanner input = new Scanner(System.in);
        do {            
            System.out.print("Please enter your grade for studant num " + count + ": ");
            grade = input.nextFloat();
            count++;
            sum += grade;
        } while (count <= 6);
        average = sum / count;
        System.out.println("Average Grade of studants is: " + average);*/
    
        
    /*int option;
    float num1 = 10, num2 = 20; 
    Scanner input = new Scanner(System.in);
        do {            
            System.out.println("Select an option from the List:");
            System.out.println("1. Sum two numbers");
            System.out.println("2. Subttact two numbers");
            System.out.println("3. Divide two numbers");
            System.out.println("0. Exit");
            option = input.nextInt();
            
            switch(option){
            case 1:
                System.out.println("Sum two numbers is: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subttact two numbers is: " + (num2 - num1));
                break;
            case 3:
                System.out.println("Divied two numbers is: " + (num1 / num2));
                break;
            case 0:
                System.out.println("End Program");
                break;
            default:
                System.out.println("Invalid Option");
                //break;
        }
        } while (option != 0);*/
    
    /*float grade, sum = 0, average;
    int coun = 0;
        for(int count= 1; count <= 6; count++){
            System.out.print("Enter your Grade " + count + ": ");
            grade = input.nextInt();
                if(grade < 0){
                    System.out.println("You Should'n enter Negative Grade");
                    break;
                }
                else{
                        sum += grade;
                        coun++;
                }
        }
            average = sum / coun;
            System.out.println("The Average grade is: " + average);*/
    
    /*int num, sumodd = 0, sumeven = 0;
    for(int i = 1; i <= 5; i++){
        System.out.print("Enter your Number" + i + ": ");
        num = input.nextInt();
        if(num %2 == 0){
            sumeven += num;
        }
        else
        {
            sumodd += num;
        }
        
    }
    System.out.println("The sum of even number: " + sumeven);
    System.out.println("The sum of odd number: " + sumodd);*/
    
    /*int num, factorial = 1;
    System.out.print("Enter a positive number: ");
    num = input.nextInt();
    if(num < 0){
        System.out.println("You Should'n enter Negative Number");
    }
        else    
        {
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i; 
            }
        }
    System.out.println("Factorial = " + factorial);*/
    
    /*int num, count = 1, sum = 0; 
        
        while (count <= 6) {            
            System.out.print("Please Enter your Positive integer number " + count + ": ");
            num = input.nextInt();
            
            if (num < 0) {
                System.out.println("You enter Negative number and that isn't allowed");
                break;
            }
        sum += num;
        count ++;    
        }
        System.out.println("Sum = " + sum);*/
    
        /*System.out.println("Saudi Airlines");
        System.out.println("-------------------------------------");
        char passclass;
        double bagweight, extraweight = 0, charge = 1;
        int numberofpassengers, numberofgroups, numberofpassengergroups;

        System.out.print("Please enter the number of Groups: ");
        numberofgroups = input.nextInt();
        // System.out.print("Please enter the number of passengers: ");
        // numberofpassengers = input.nextInt();

        for (int i = 1; i <= numberofgroups; i++) {
            System.out.print("Please enter number of passengers's group for group No " + i + ": ");
            numberofpassengergroups = input.nextInt();
        for (int j = 1; j <= numberofpassengergroups; j++) {

            System.out.print("Please enter passenger's class for passenger No " + j + " for group No " + i + ": ");
            passclass = input.next().charAt(0);
            

            switch (passclass) {
                case 'F':
                case 'f':
                    System.out.print("Please enter bag weight: ");
                    bagweight = input.nextDouble();
                    if (bagweight > 30) {
                        extraweight = bagweight - 30;
                        charge = extraweight * 10;
                        System.out.println("You have to pay extra weight charge = " + charge);
                    }
                    break;

                case 'B':
                case 'b':
                    System.out.print("Please enter bag weight: ");
                    bagweight = input.nextDouble();
                    if (bagweight > 25) {
                        extraweight = bagweight - 25;
                        charge = extraweight * 10;
                        System.out.println("You have to pay extra weight charge = " + charge);
                    }
                    break;

                case 'E':
                case 'e':
                    System.out.print("Please enter bag weight: ");
                    bagweight = input.nextDouble();
                    if (bagweight > 20) {
                        extraweight = bagweight - 20;
                        charge = extraweight * 10;
                        System.out.println("You have to pay extra weight charge = " + charge);
                    }
                    break;
                default:
                    System.out.println("You enter invalid class please try again");
            }
                
                System.out.println("-------------------------------------");
            }
        }*/
    
//-------------------------------------------------------------------------------------------------------------------------------------

        /*sum();*/

        /*drawline('*', 10);
        System.out.println("Draw Line");
        drawline('#', 3);*/

        /*int i = 2, j = 3, result = 0;
        System.out.println(sum(i, j));
        result = sum(i,j)*3;
        System.out.println(result);*/

        /*int x, y, z, total;
        double result;
        System.out.println("Please enter 3 numbers : ");
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        total = sum(x, y, z);
        result = average(x, y, z);
        display(total, result);*/

        /*int x = 5, y = 7;
        char a = 'k', b = 'h';

        System.out.println(max(x, y));
        System.out.println(max(a, b));*/

        /*double salary1 ,salary2; 

        System.out.println("Please enter your salary: ");
        salary1 = input.nextDouble();
        System.out.println("Please enter your salary: ");
        salary2 = input.nextDouble();

        salary1 = salary1 + salary1 * 10 ;
        salary2 = salary2 + salary2 * 10 ;

        System.out.println(salary1);
        System.out.println(salary2);*/

        /*int size_length;
        System.out.print("Please enter the size length of array: ");
        size_length = input.nextInt();
        double[] salaries = new double[size_length];
        //double[] salary = {12.5, 4, 65.7, 88.3};
        for (int i = 0; i < salaries.length; i++) {
            System.out.print("Enter salary for employee no " + (i + 1) + ": ");
            salaries[i] = input.nextDouble();
        } 

        double sum = 0, average = 0;
        for (int i = 0; i < salaries.length; i++) {
            sum += salaries[i];
        }

        average = sum / salaries.length;
        System.out.println("sum = " + sum);
        System.out.print("Average = " + average);*/

        /*int size_length;
        System.out.print("Please enter the size length of array: ");
        size_length = input.nextInt();
        double[] posnum = new double[size_length];
        for (int i = 0; i < posnum.length; i++) {
            System.out.print("Enter positive number: ");
            posnum[i] = input.nextDouble();
        }   
        
        double sum = 0, average = 0;
        for (int i = 0; i < posnum.length; i++) {
            if (posnum[i] > 0) {
            sum += posnum[i];
            } else {
                System.out.println("you can't enter Negative number");
            }
        }

        average = sum / posnum.length;
        System.out.println("sum = " + sum);
        System.out.print("Average = " + average);*/

        /*System.out.print("Please enter the size length of array: ");
        int size_length, searchedid;
        size_length = input.nextInt();
        int[] ids = new int [size_length];
        fillarray(ids);
        displayarray(ids);
        
        System.out.print("Please enter id you are search for: ");
        searchedid = input.nextInt();
        int return_search_indexid = search(ids, searchedid);
            if (return_search_indexid >= 0) {
                System.out.println("item is found");
            }
            else{
                System.out.println("item is not found");
            }*/

        /*int [][] marks = {{0,1,2},{5,6,7},{3,4,5}};
        
            for (int i = 0; i < marks[0].length; i++) {
                marks[2][i] = 7;
                System.out.println(marks[2][i]);
            }

            for (int j = 0; j < marks[0].length; j++) {
                marks[1][j] = 6;
                System.out.println(marks[1][j]);
            }*/
        
        //System.out.println("Number of rows = " + marks.length);
        //System.out.println("Number of columns = " + marks[0].length);

        /*int [][] matrix = new int [3][2];
        fillarray(matrix);
        System.out.println("matrix is filled");
        displayarray(matrix);
        System.out.println("matrix will be display");
        int result = sumarray(matrix);
        System.out.println("sum of items's values of matrix: " + result);*/


        // GenralClass x;
        // x = new GenralClass();
        // GenralClass x = new GenralClass();
        /*GenralClass x1 = new GenralClass(100, "Ahmed");
        GenralClass x2 = new GenralClass(100, "Mohamed", false);
        GenralClass x3 = new GenralClass(10, "Fawzy", "CS", 5000, 600, true);*/
        // GenralClass y = new GenralClass();
        // GenralClass z = new GenralClass();
        /*GenralClass z = new GenralClass(10,30);
        // GenralClass c = new GenralClass(40, 70);*/
        // GenralClass v = new GenralClass();
        /*r.setlenght(10.5);
        r.setwidth(5);
        System.out.println(r.getlenghe());
        System.out.println(r.getwidth());
        System.out.println(r.getarea());*/

        /*x.setmaker("Honda");
        x.setmodel(2023);
        System.out.println(x.getmaker());
        System.out.println(x.getmodel());
           
        y.setmaker("Toyota");
        y.setmodel(2020);
        System.out.println(y.getmaker());
        System.out.println(y.getmodel());*/

        /*System.out.println(x.getlenghe());
        System.out.println(x.getwidth());
        x.setlenght(30);
        x.setwidth(20);
        System.out.println(x.getlenghe());
        System.out.println(x.getwidth());*/

        /*System.out.println(x.getleng());
        System.out.println(x.getwid());
        x.setleng("Ali");
        x.setwid("Mostafa");
        System.out.println(x.getleng());
        System.out.println(x.getwid());*/


        /*x.Print_Emp_Data();
        x1.Print_Emp_Data();
        x2.Print_Emp_Data();
        x3.Print_Emp_Data();*/

        //System.out.println(GenralClass.get_no_of_objects());


        /*System.out.println(GenralClass.add(10, 20));
        System.out.println(GenralClass.sub(20, 5));
        System.out.println(GenralClass.mult(5, 4));*/


        /*double roomlenght = 50;
        x.setlenght(roomlenght);
        System.out.println(roomlenght);*/

        /*y.modifyobject(z);
        System.out.println(z.getlength());
        System.out.println(z.getwidth());*/

        
        /*// GenralClass m = v.add(z, c);
        // System.out.println(m.getlength());
        // System.out.println(m.getwidth());
        System.out.println(z.add(c).getlength());
        System.out.println(z.add(c).getwidth());*/


        /*if (z.isequal(c)) {
            System.out.println("The objects are equal");
        } else {
            System.out.println("The objects are different");
        }*/

        /*GenralClass copy = new GenralClass(z);
        System.out.println(copy.getlength());
        System.out.println(copy.getwidth());*/
        //------------------------------------------------------

        /*Studant stu = new Studant();
        Studant stu2 = new Studant(23.0, "Mostafa", "Egypt", "Egyptoin", 4, "CS", 3.7);
        System.out.println(stu2.getname());*/

        /*//Salaried_Employee sae = new Salaried_Employee(25, "Ali", "Alex", "USA", 8000, "Nice", "Developer", 800, 0);
        Employee sae = new Salaried_Employee(25, "Ali", "Alex", "USA", 8000, "Nice", "Developer", 800, 0);
        System.out.println(sae.get_salary());
        Employee em = new Employee(23, "Ahmed", "kkkk", "lllllllll", 10000, "Bad", "Teatcher");
        System.out.println(em.get_salary());
        //em.print_all_details();*/

        /*//RetalItem r1 = new RetalItem();
        CD c = new CD();
        c.getitemprice();
        CD c1 = new CD(0, "Despaseto", "Unkown");
        c1.display();
        RetalItem r2 = new CD();
        r2.getitemprice();
        Displyable d = new CD(20, "Despaseto", "Unkown");
        d.display();*/

        /*Course c = Course.Database;
        Course c1 = Course.Math;

        //System.out.println(c.toString());
        //System.out.println(c.ordinal());
        System.out.println(c1.compareTo(c));
        System.out.println(c1.equals(c));*/


        /*try {
            int x, y;
            System.out.print("x = ");
            x = input.nextInt();
            System.out.print("y = ");
            y = input.nextInt();
            System.out.println(x/y);
        } catch (ArithmeticException e) {
            System.out.println("You can't deivid by zero");
        } catch (InputMismatchException e) {
            System.out.println("Error, Please Numeric Values");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
        

        /*ArrayList <String> list = new ArrayList<String>();
        list.add("Mostafa");
        list.add("Ahmed");
        list.add("Mohamed");
        System.out.println(list.get(2));
        list.add(1, "kkkkk");
        System.out.println(list);*/


    }

        /*public static void sum() {
            System.out.println("Please enter number");
            int x = input.nextInt();
            System.out.println("Please enter number");
            int y = input.nextInt();
            int z = x + y;
            System.out.println("Sum is: " + z);
        }*/

        /*public static void drawline(char ch, int length) {
            for (int i = 1; i <= length; i++) {
                System.out.print(ch);
            }
            System.out.println();
        }*/

        /*public static int sum(int x, int y) {
            int result = x + y;
            return result;
        }*/

        /*public static int sum(int n1, int n2, int n3) {
            return n1 + n2 + n3;
        }*/

        /*public static double average(int n1, int n2, int n3) {
            return sum(n1, n2, n3) / 3;
        }*/

        /*public static void display(int sum, double average) {
            System.out.println("The sum of 3 numbers is : " + sum);
            System.out.println("The average of 3 numbers is : " + average);
        }*/

        /*public static int max (int num1, int num2){

            if (num1 > num2) {
                return num1;
            }
                else
                    return num2; 
        }*/

        /*public static char max(char c1, char c2) {
            if (c1 > c2) {
                return c1;
            } else {
                return c2;
            }
        }*/

        /*public static void fillarray(int[] List) {
            for (int i = 0; i < List.length; i++) {
                System.out.print("please Enter id " + (i + 1) + ": ");
                List[i] = input.nextInt();
            }
        }

        public static void displayarray(int[] List) {
            for (int i = 0; i < List.length; i++) {
                System.out.println(List[i]);
            }
        }

        public static int search(int[] List, int target) {
            for (int i = 0; i < List.length; i++) {
                if (List[i] == target)
                    return i;
            }
            return -1;
        }*/

        /*public static void fillarray(int[][] List) {
            for (int i = 0; i < List.length; i++) {
                for (int j = 0; j < List[0].length; j++) {
                    System.out.print("please Enter value of row matrix numb " + (i + 1) + " And column numb " + (j + 1) + ": ");
                    List[i][j] = input.nextInt();
                }
            }
        }

        public static void displayarray(int[][] List) {
            for (int i = 0; i < List.length; i++) {
                for (int j = 0; j < List[0].length; j++) {
                    System.out.println(List[i][j]);
                }
            }
        }

        public static int sumarray(int[][] List) {
            int sum = 0;
            for (int i = 0; i < List.length; i++) {
                for (int j = 0; j < List[0].length; j++) {
                    sum += List[i][j];
                }
            }
            return sum;
        }*/

        



}