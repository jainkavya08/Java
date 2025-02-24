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

        int age = 19;
        int year = 2025;
        int quantity = 5;

        System.out.println(age);
        System.out.println("The year is " + year);
        System.out.println(quantity);
    }
}
