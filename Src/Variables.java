public class Variables {
    
    public static void main (String[] args) 
    {
        // variable = a reusable container for a value 
        //              a variable behaves as if it was the value it contains 

        // Primitive = simple value is stored directly in memory (stack)
        // reference = memory address (stack) that points to the (heap)

        // Primitive vs Reference variables
        // ---------    -------------------
        // int           string 
        // double        array
        // char          object
        // boolean       
        
        // 2 steps to creating a variable 
        // ----------------------------
        // 1. declaration 
        // 2. assignment 

        /****************Primitive ********************/
        int age = 19;
        int year = 2025;
        int quantity = 5;

        double price = 19.5;
        double price1 = 19;
        double gpa = 9.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol ='!';
        char currency = '$';

        boolean isStudent = true;           //camelCase in java two words first one is lower case and other is upper
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(age);
        System.out.println("The year is " + year);
        System.out.println(quantity);

        System.out.println(price);
        System.out.println(gpa);
        System.out.println(temperature);
        System.out.println(price1);

        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);

        System.out.println(isStudent);
        System.out.println(forSale);
        System.out.println(isOnline);       //boolean more than displaying is used internally within the program

        // One use of boolean is use of if statements 

        if (isStudent)
        {
            System.out.println("You are a student");
        }else{
            System.out.println("You are an adult");
        }

        /****************Reference********************/
        String name = "Kavya jain";
        String food = "Pizza";
        String email = "fake11@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("Hello " + name);
        System.out.println(food);
        System.out.println(email);
        System.out.println(car);
        System.out.println(color);

        //now use all the above and make sentences 

    }
}
