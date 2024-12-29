public class Count_vowels_consonants_Spaces {
    
        public static void solve(String str, int length) {
          int vowels = 0, consonants = 0, whitespaces = 0;
          str = str.toLowerCase(); // converting given string to lowercase
          for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
              vowels++;
            else if (ch >= 'a' && ch <= 'z')
              consonants++;
            else if (ch == ' ')
              whitespaces++;
          }
      
          System.out.println("Vowels: " + vowels);
          System.out.println("Consonants: " + consonants);
          System.out.println("White spaces: " + whitespaces);
        }
// --------------------------------------------------------------------------------------------

        public static void solveApproach2(String str, int length) {

            int vowels = 0, consonants = 0, whitespaces = 0;
            String vowelString = "aeiou";
            str = str.toLowerCase(); // converting given string to lowercase

            for (int i = 0; i < length; i++) {

              char ch = str.charAt(i);

              if (vowelString.indexOf(ch) != -1)
                vowels++;
              else if (ch == ' ')
                whitespaces++;
              else consonants++;  
            }
        
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("White spaces: " + whitespaces);
          }
        public static void main(String args[]) {
          String str = "Kashyap Mavani";
          int length = str.length();
          solveApproach2(str, length);
        }
      
}
