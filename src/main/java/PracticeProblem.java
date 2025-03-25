public class PracticeProblem {

	public static boolean isPalindrome(String word) {
		word = word.replaceAll(" ", "").toLowerCase();
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == word.charAt(word.length()-1-i)) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	public static int getAge(String[] names, int[] ages, String person) {
		for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(person)) {  
                int age = ages[i];
				return age;
            }

		}
		return -1;
	}

	public static int countWords(String words, char letter) {
		int counter = 0;
		String[] words2 = words.split(" ");
		for (String i : words2) {
			if (i.indexOf(letter) >= 0) {
				counter++;
		}
	}
		return counter;
	}
}
