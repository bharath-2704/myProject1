import java.util.Scanner;
public class gradeCalculator {
    public static void main(String[]args){
        char Grade=' ';
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of subjects:");
        int n=sc.nextInt();
        System.out.println("enter the minimum marks and max marks of subjects:");
        System.out.println("out of 100  or out of 50 etc");
        System.out.println("enter minimum marks:");
        int min=sc.nextInt();
        System.out.println("emter max marks:");
        int max=sc.nextInt();
        int subjects[]=new int[n];
        int markstotal=0;
        int marks=0;
        for(int i=0;i<subjects.length;i++){
            System.out.println("enter the "+ (i+1) +" subject marks:");
            marks=sc.nextInt();
            markstotal+=marks;
            if(marks<36){
                Grade='F';
            }
        }
        double percentage=calculatePercentage( markstotal,n,max);
        if(Grade=='F'){
          System.out.println(" -------------------student overAll performance-----------------------");
        }else{
            Grade=displayGrade( percentage);
            System.out.println("----------------------------student overAll performance--------------------------");
        }
        System.out.println(" total marks is:  "+markstotal);
        System.out.println(" student percentage is:  "+percentage);
        System.out.println(" Grade is :  "+ Grade);
    }
   public static double calculatePercentage(int markstotal, int subjects,int max ){
        double  percentage=(double)markstotal/(subjects*max);
        return percentage*100;
   }
   public static char displayGrade(double percentage){
      double p=percentage;
      if(p>=91){
        return 'o';
      }
      else if(p>=81 && p<=90){
        return 'A';
      }
      else if(p>=71 && p<=80){
        return 'B';
      }
      else if(p>=61 && p<=70){
        return 'C';
      } else if(p>=51 && p<=60){
        return 'D';
      } else if(p>=36 && p<=50){
        return 'E';
      }
      return 'F';
   
   }
    
}
