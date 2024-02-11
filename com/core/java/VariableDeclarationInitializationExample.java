package com.core.java;

/**
 * @author : Anand
 */
public class VariableDeclarationInitializationExample {
    // Initializing final variables in constructors or instance blocks
    final int finalVarInConstructor;

    // Constructor
    public VariableDeclarationInitializationExample() {
       // finalVarInConstructor = 100; // may give error since it's declared as final
    }

    // Instance block
    {
        finalVarInConstructor = 200;
    }

    public static void main(String[] args) {
        // Declaration and initialization of primitive types
        int a = 5;
        double b = 3.14;
        float f = 2.5f; // Note the 'f' suffix to denote float literal
        short s = 100;
        char c = 'A';
        boolean d = true;

        // Declaration of reference types
        String str;
        Object obj;

        // Initialization of reference types
        str = "Hello, world!";
        obj = new Object();

        // Declaration and initialization of arrays
        int[] array1 = {1, 2, 3, 4, 5};
        String[] array2 = new String[3];
        array2[0] = "Java";
        array2[1] = "is";
        array2[2] = "awesome";

        // Declaration and initialization of final variables
        final int CONSTANT = 10;

        // Declaration and initialization of variables with default values
        int defaultValueInt; // default value is 0
        double defaultValueDouble; // default value is 0.0
        float defaultValueFloat; // default value is 0.0f
        short defaultValueShort; // default value is 0
        char defaultValueChar; // default value is '\u0000' (null character)
        boolean defaultValueBoolean; // default value is false
        String defaultValueString; // default value is null

        // Declaration and initialization in separate steps
        int x;
        x = 10;

        // Re-declaration and re-initialization of variables
        int y = 20;
        y = 30; // variable y is re-initialized

        // Multiple variables of the same type in one line
        int m = 1, n = 2, o = 3;

        // Scope of variables
        {
            int scopeVariable = 100; // Variable declared within a block
            System.out.println("Value of scopeVariable: " + scopeVariable);
        }
        // System.out.println("Value of scopeVariable: " + scopeVariable); // This line will cause compilation error as scopeVariable is out of scope here

        // Initialization with expressions
        int p = 5 + 3; // p will be initialized to 8
        int q = p * 2; // q will be initialized to 16
        String helloWorld = "Hello" + "World"; // helloWorld will be initialized to "HelloWorld"

        // Tricky scenarios
        int uninitializedVariable; // Compilation error: Variable 'uninitializedVariable' might not have been initialized
        // System.out.println(uninitializedVariable); // Compilation error: Variable 'uninitializedVariable' might not have been initialized

        int x1, y1, z1 = 10; // Only z1 is initialized, x1 and y1 are not initialized
        // System.out.println(x1); // Compilation error: Variable 'x1' might not have been initialized
        // System.out.println(y1); // Compilation error: Variable 'y1' might not have been initialized
        System.out.println(z1); // This will print 10

        int x2 = 5, y2 = x2; // y2 will be initialized to the value of x2 (5)


        // Cannot re-assign value to final variable
        // finalVarInConstructor = 300; // Compilation error: cannot assign a value to final variable 'finalVarInConstructor'

        // Usage of short and float types in calculations
        short num1 = 100;
        short num2 = 200;
        short sum = (short) (num1 + num2); // Casting needed as result of addition of two shorts is an int

        float floatValue1 = 10.5f;
        float floatValue2 = 5.5f;
        float result = floatValue1 / floatValue2;

        System.out.println("Sum of shorts: " + sum);
        System.out.println("Result of float division: " + result);
    }
}
