import java.util.*;
public class StudentGradeCalculator{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Number of Subjects:");
        int num=s.nextInt();
        int marks[]=new int[num];
        int sum=0;
        for(int i=0,j=1;i<marks.length && j<=num;i++,j++){
            System.out.print("Marks in Subject "+j+":");
            marks[i]=s.nextInt();
        }
        for(int i=0;i<marks.length;i++){
            sum=sum+marks[i];
        }
        float average_percentage=(sum/num);
        System.out.println("TOTAL MARKS:"+sum);
        System.out.println("AVERAGE PERCENTAGE:"+average_percentage);
        if(average_percentage<=100 && average_percentage>=90){
            System.out.println("A GRADE");
        }
        else if(average_percentage<90 && average_percentage>=80){
            System.out.println("B GRADE");
        }
        else if(average_percentage<80 && average_percentage>=70){
            System.out.println("C GRADE");
        }
        else if(average_percentage<70 && average_percentage>=60){
            System.out.println("D GRADE");
        }
        else if(average_percentage<60 && average_percentage>=50){
            System.out.println("E GRADE");
        }
        else{
             System.out.println("FAIL");
        }
    }
}