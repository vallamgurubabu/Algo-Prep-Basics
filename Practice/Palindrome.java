public class Palindrome {
    public static void main(String[] args) {
                String str = "A man a plan a canal Panama";
                System.out.println("Is palindrome: " + isPalindrome(str));
    }
        
    public static boolean isPalindrome(String str) {
                str = str.replace(" ", "").toLowerCase(); // Remove spaces and convert to lowercase
                int left = 0;
                int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
            }
            return true;    
        }
}
