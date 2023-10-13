public class Assignment{

    // Method with no parameters
    public static void printMessage() {
        System.out.println("No parameters.");
    }

    // Method with one integer parameter
    public static void printMessage(int value) {
        System.out.println("One integer parameter: " + value);
    }

    // Method with two string parameters
    public static void printMessage(String str1, String str2) {
        System.out.println("Two string parameters: " + str1 + " and " + str2);
    }
    
    public static class MyClass{
        void myMethod() {
            System.out.println("Hello from myMethod!");
        }
    }

    public static void main(String[] args) {

        // 1:Write a program to demonstrate method overloading with 3 different parameters.

        System.out.println("#1 method overloading");
        printMessage();
        printMessage(42);
        printMessage("Hello", "World");
        System.out.println();

        //2: Write a program to create an object of a class which contain a method and call that class method in main method.

        System.out.println("#2 program to create an object of a class which contain a method and calling that class method in main method.");
        // Create an object of the MyClass class
        MyClass myObject = new MyClass();

         // Call the myMethod from the object
         myObject.myMethod();


        int []arr={17,2,13,10,20,23};

        System.out.println();
        //3: Write a java program to calculate the sum of all elements in an integer array
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        System.out.println("#3 Sum of all elements is: "+sum);
        System.out.println();

        //4: Write a java program to find the index of a specific element in an integer array.
        int specificElement=10;
        System.out.print("#4 Index of specific element '10' in the array arr is:");
        for(int i=0; i<arr.length;i++){
            if(arr[i]== specificElement){
                System.out.println(i);
            }
        }
        System.out.println();

        //5: Write a java program to print an entire array
        System.out.println("#5 Printing the entire array arr");

        for(int i:arr){
            System.out.print(i+" ");
        }

}
    
}