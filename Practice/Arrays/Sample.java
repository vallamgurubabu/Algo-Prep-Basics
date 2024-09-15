package Arrays;
// In Java, when you assign an array to another variable, it doesn't create a copy of the array. Instead, both variables point to the same memory location. This is known as a "shallow copy".

// In your example:

// 1. int a[] = {10, 20, 30}; creates an array a with values 10, 20, and 30.
// 2. int b[] = a; makes b point to the same memory location as a. Both a and b now reference the same array.
// 3. b[0] = 40; changes the first element of the array to 40.
// 4. Since a and b point to the same array, a[0] and b[0] both print 40.

// To create a separate copy of the array, you can use the Arrays.copyOf() method:


// int a[] = {10, 20, 30};
// int b[] = Arrays.copyOf(a, a.length);
// b[0] = 40;
// System.out.println(a[0]); // prints 10
// System.out.println(b[0]); // prints 40


// Now, a and b are separate arrays, and changing b[0] doesn't affect a[0].
public class Sample {
    public static void main(String[] args) {
        int a [] = {10,20,30};
        int b [] = a;
        b[0] = 40;
        System.out.println(a[0]);
        System.out.println(b[0]);
    }
}
