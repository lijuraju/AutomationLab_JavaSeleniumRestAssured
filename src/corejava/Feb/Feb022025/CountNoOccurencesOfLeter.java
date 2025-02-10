package corejava.Feb.Feb022025;

public class CountNoOccurencesOfLeter {
        public static void main(String[] args) {
            String input = "Hello World";
            findDuplicateCharacters(input);
        }

        public static void findDuplicateCharacters(String str) {
            // Convert the string to lowercase to make the search case-insensitive
            str = str.toLowerCase();

            // Iterate through each character in the string
            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);

                // Skip spaces and already processed characters
                if (currentChar == ' ' || str.indexOf(currentChar) != i) {
                    continue;
                }

                int count = 1; // Initialize count for the current character

                // Compare the current character with the rest of the characters in the string
                for (int j = i + 1; j < str.length(); j++) {
                    if (currentChar == str.charAt(j)) {
                        count++;
                    }
                }

                // If the character appears more than once, print the character and its count
                if (count > 1) {
                    System.out.println("Character '" + currentChar + "' occurs " + count + " times.");
                }
            }
        }
    }

