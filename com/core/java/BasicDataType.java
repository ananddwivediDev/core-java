package com.core.java;

/**
 * @author : Anand
 */
public class BasicDataType {

    /**
     * Type        : boolean
     * Description : Represents a boolean value, either true or false.
     * Default     : false
     * Size        : 1 bit
     * Example Literals: true, false
     * Range of values : true, false
     */

    private static void booleanExample() {

        // Declaring and initializing a primitive boolean variable
        boolean isRaining = true;

        // Printing the value of the primitive boolean variable
        System.out.println("Is it raining? " + isRaining);

        // Using Boolean wrapper class
        Boolean isSunny = Boolean.FALSE;
        System.out.println("Is it sunny? " + isSunny);

        // Comparing boolean values
        boolean isEqual = isRaining == isSunny;
        System.out.println("Is it raining equal to sunny? " + isEqual);

        // Using logical operators with boolean values
        boolean isCold = false;
        boolean isWindy = true;
        boolean isWeatherGood = !isCold && !isRaining && isSunny && !isWindy;
        System.out.println("Is the weather good? " + isWeatherGood);

        // Converting boolean to string
        String weatherStatus = isWeatherGood ? "Good" : "Bad";
        System.out.println("Weather status: " + weatherStatus);

        // Tricky example: Boolean object comparison
        Boolean a = Boolean.TRUE;
        Boolean b = Boolean.TRUE;
        System.out.println("Is a equal to b? " + (a == b));  // Output: true

        Boolean c = new Boolean(true);
        Boolean d = new Boolean(true);
        System.out.println("Is c equal to d? " + (c == d));  // Output: false

        // Using XOR to swap boolean values
        boolean x = true;
        boolean y = false;
        System.out.println("Before swap: x=" + x + ", y=" + y);
        x ^= y;
        y ^= x;
        x ^= y;
        System.out.println("After swap: x=" + x + ", y=" + y);

    }

    /**
     * Type        : byte
     * Description : Represents a twos-complement integer.
     * Default     : 0
     * Size        : 8 bits
     * Example Literals: (none)
     * Range of values : -128 to 127
     */
    private static void byteExample() {
        byte myByte = 100;
        System.out.println("Byte value: " + myByte);

        // Overflow example
        byte overflowByte = (byte) (Byte.MAX_VALUE + 1);
        System.out.println("Overflow example: " + overflowByte);

        // Underflow example
        byte underflowByte = (byte) (Byte.MIN_VALUE - 1);
        System.out.println("Underflow example: " + underflowByte);
    }

    /**
     * Type        : char
     * Description : Represents a Unicode character.
     * Default     : \u0000
     * Size        : 16 bits
     * Example Literals: 'a', '\u0041', '\101', '\\', '\', '\n', 'β'
     * Range of values : characters representation of ASCII values (0 to 255)
     */
    private static void charExample() {
        char myChar = 'A';
        System.out.println("Character: " + myChar);

        // ASCII value example
        char asciiChar = 65;
        System.out.println("ASCII value example: " + asciiChar);
    }

    /**
     * Type        : short
     * Description : Represents a twos-complement integer.
     * Default     : 0
     * Size        : 16 bits
     * Example Literals: (none)
     * Range of values : -32,768 to 32,767
     */
    private static void shortExample() {
        short myShort = -300;
        System.out.println("Short value: " + myShort);

        // Casting example
        int intValue = 10000;
        short castedShort = (short) intValue;
        System.out.println("Casting example: " + castedShort);
    }

    /**
     * Type        : int
     * Description : Represents a twos-complement integer.
     * Default     : 0
     * Size        : 32 bits
     * Example Literals: -2, -1, 0, 1, 2
     * Range of values : -2,147,483,648 to 2,147,483,647
     */
    private static void intExample() {
        int myInt = 2000000;
        System.out.println("Integer value: " + myInt);

        // Binary representation example
        int binaryInt = 0b1010;
        System.out.println("Binary representation example: " + binaryInt);
    }

    /**
     * Type        : long
     * Description : Represents a twos-complement integer.
     * Default     : 0
     * Size        : 64 bits
     * Example Literals: -2L, -1L, 0L, 1L, 2L
     * Range of values : -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     */
    private static void longExample() {
        long myLong = 9999999999L;
        System.out.println("Long value: " + myLong);

        // Scientific notation example
        long scientificNotationLong = 1_000_000_000L;
        System.out.println("Scientific notation example: " + scientificNotationLong);
    }

    /**
     * Type        : float
     * Description : Represents a IEEE 754 floating point number.
     * Default     : 0.0
     * Size        : 32 bits
     * Example Literals: 1.23e100f, -1.23e-100f, .3f, 3.14F
     * Range of values : up to 7 decimal digits
     */
    private static void floatExample() {
        float myFloat = 3.14f;
        System.out.println("Float value: " + myFloat);

        // NaN example
        float nanFloat = Float.NaN;
        System.out.println("NaN example: " + nanFloat);
    }

    /**
     * Type        : double
     * Description : Represents a IEEE 754 floating point number.
     * Default     : 0.0
     * Size        : 64 bits
     * Example Literals: 1.23456e300d, -123456e-300d, 1e1d
     * Range of values : up to 16 decimal digits
     */
    private static void doubleExample() {
        double myDouble = 123456.789;
        System.out.println("Double value: " + myDouble);

        // Infinity example
        double infinityDouble = Double.POSITIVE_INFINITY;
        System.out.println("Infinity example: " + infinityDouble);
    }

    public static void main(String[] args) {
        booleanExample();
        byteExample();
        charExample();
        shortExample();
        intExample();
        longExample();
        floatExample();
        doubleExample();
    }
}
