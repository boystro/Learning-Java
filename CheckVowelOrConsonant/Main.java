package CheckVowelOrConsonant;

public class Main {
	public static void main(String[] args) {
		String ch = "X";
		String vowels = "aeiou";
		String consonants = "bcdfghjklmnpqrstvwxyz";
		if (vowels.contains(ch.toLowerCase())) {
			System.out.print(ch);
			System.out.println(" is a vowel.");
		} else if (consonants.contains(ch.toLowerCase())) {
			System.out.print(ch);
			System.out.println(" is a consonant.");
		} else {
			System.out.print(ch);
			System.out.println(" is neither consonant nor vowel.");
		}
	}
}
