package javaweek1.course.ini;

public class printsumandaverage {
	public static void main (String[] args) {
        int sum = 0;          
        double average;      
        int lowerbound = 1;   
        int upperbound = 400; 

        
        for (int number = lowerbound; number <= upperbound; ++number) {
            sum += number;     
        }
        
        average = sum / 100.0;
        
        
        System.out.printf("The sum is %d. The average is %.2f.", sum, average);
    }
}


