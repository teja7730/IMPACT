// public class day7 {
//     public static void main(String[] args) {
//         String str = "tejesh";
//         String reversedstr ="";
//         for(int i = str.length()-1 ; i>=0; i--){
//             reversedstr += str.charAt(i);
//         }
//         System.out.println("reversed string :" + reversedstr);
//     }
    
// }

// ________________________________________________


// import java.util.Scanner;

// public class day7 {

//     public static boolean isPalindrome(String str) {
//         int left = 0;
//         int rigth = str.length() - 1;

//         while (left < rigth) {
//             if (str.charAt(left) != str.charAt(rigth)) {
//                 return false;
//             }
//             left++;
//             rigth--;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String inputString = scanner.nextLine();
//         scanner.close();

//         if (isPalindrome(inputString)) {
//             System.out.println("The string is a palindrome.");
//         } else {
//             System.out.println("The string is not a palindrome.");
//         }
//     }
// }
