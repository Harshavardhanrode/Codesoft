import java.util.Scanner;

class Task2{
    public static void main(String[] args){
        String grade = "invalid";                                // set a garde to be invlid in initial stage 
        System.out.println("Enter the marks out of 100");

        Scanner x = new Scanner(System.in);
        System.out.print("Enter the marks of maths:");
        int math_marks = x.nextInt();

        System.out.print("Enter the marks of science:");
        int science_marks = x.nextInt();

        System.out.print("Enter the marks of history:");
        int history_marks = x.nextInt();

        System.out.print("Enter the marks of biology:");
        int biology_marks = x.nextInt();
        
        int total_marks = (math_marks + science_marks + history_marks + biology_marks) ;
        int avarage_percentage = total_marks/4;

        if(avarage_percentage <=100 && avarage_percentage >=90 )
           grade = "A";
        else if(avarage_percentage <=90 && avarage_percentage >=80 )
             grade = "B";
        else if(avarage_percentage <=80 && avarage_percentage >=70 )     
            grade = "c";
        else if(avarage_percentage <=70 && avarage_percentage >=35 )     
            grade = "D";   
        else if(avarage_percentage <35 && avarage_percentage >=0 )     
            grade = "F";        
        else
            System.out.println("invalid input");  

        if(grade == "invalid" || math_marks>100||history_marks>100||science_marks>100||biology_marks>100)
            System.out.println("invalid input");   
        else     
            System.out.println("Total marks:" + total_marks+ "\n"+ "Avarge percentage:" + avarage_percentage + "\n" + "Grade:" + grade);    
        x.close();
    }
}