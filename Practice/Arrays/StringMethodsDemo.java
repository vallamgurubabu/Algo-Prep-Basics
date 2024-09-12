package Arrays;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Hello World!";

        // Length: Returns the number of characters in the string
        System.out.println("Length of the string: " + str.length());

        // Uppercase and Lowercase: Converts the string to uppercase or lowercase
        System.out.println("String in uppercase: " + str.toUpperCase());
        System.out.println("String in lowercase: " + str.toLowerCase());

        // Trim: Removes leading and trailing whitespace from the string
        String str2 = "   Hello World!   ";
        System.out.println("String with leading and trailing whitespace removed: " + str2.trim());

        // Substring: Returns a subset of the string
        System.out.println("Substring from index 0 to 5: " + str.substring(0, 5));

        // IndexOf: Returns the index of the first occurrence of the specified character or string
        System.out.println("Index of the first occurrence of 'World': " + str.indexOf("World"));

        // LastIndexOf: Returns the index of the last occurrence of the specified character or string
        System.out.println("Index of the last occurrence of 'o': " + str.lastIndexOf('o'));

        // Replace: Replaces all occurrences of the specified character or string with another string
        System.out.println("String with 'World' replaced by 'Universe': " + str.replace("World", "Universe"));
        System.out.println("String with 'World' replaced by 'Universe': " + str.replace(" ", ""));

        // Split: Splits the string into an array of substrings based on the specified delimiter
        String[] words = str.split(" ");
        System.out.println("String split into words: ");
        for (String word : words) {
            System.out.println(word);
        }

        // Matches: Checks if the string matches the specified regular expression
        System.out.println("String matches the pattern 'Hello.*': " + str.matches("Hello.*"));

        // Contains: Checks if the string contains the specified character or string
        System.out.println("String contains 'World': " + str.contains("World"));

        // StartsWith and EndsWith: Checks if the string starts or ends with the specified character or string
        System.out.println("String starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("String ends with 'World!': " + str.endsWith("World!"));
    }
}


