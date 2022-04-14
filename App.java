public class App {
    /**
     * This method takes in two int parameters to add.
     * 
     */
    private static int sum2(int num1, int num2){
        return num1 + num2;
    }
     
    /**
     * This method takes in 3 int parameters to add.
     * 
     */
    private static int sum3(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    /**
     * Modify the methods in such a way that the Class App
     * can now have 2 overloaded computeSum() methods.
     * One computing the sum of two numbers, and one computing the sum
     * of three numbers. 
     */

    static int computeSum(int num1, int num2){
        return sum2(num1, num2);
    }
    
    static int computeSum(int num1, int num2, int num3){
        return sum3(num1, num2, num3);
    }

    /**
     * 
     * Create method that returns the greater integer value
     */

    public static int greaterValue(int num1, int num2){
        if (num1 > num2)
           return num1;
        else
           return num2;
      }
    
    /**
     * 
     * Create method that returns the greater double value
     */

    public static double greaterValue(double num1, double num2){
        if (num1 > num2)
           return num1;
        else
           return num2;
      }
      public static double greaterValue(double num1, double num2, double num3){
        return greaterValue( greaterValue( num1,num2 ), num3 );
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(" "); 

        /**
         * Create Method calls that takes in 2 parameters, and 3 parameters
         * respectively and computes their sum.
         */
        System.out.println("Sum of 11 and 11 is: " + App.computeSum(11,11)); 
        System.out.println("Sum of 10, 172, and 88 is: " + App.computeSum(10,172,88)); 
        System.out.println("  "); 

        /**
         * Call the greaterValue method with integer parameters
         */
        
        System.out.println("The greater value between 45 and 100 is " + greaterValue(45,100));

        /**
         * Call the greaterValue method with double parameters
         */
        System.out.println("The greater value between 3.14 and 9.8 is " + greaterValue(3.14,9.8));
        System.out.println(" "); 
        
        }   
    
    }
