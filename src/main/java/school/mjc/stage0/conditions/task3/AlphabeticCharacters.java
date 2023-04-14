package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String regexVowels = "[aeiouAEIOU]";
        String regexEnglishLetters = "[a-zA-Z]";
        if(String.valueOf(character).matches(regexEnglishLetters)) {
            if(String.valueOf(character).matches(regexVowels)) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
