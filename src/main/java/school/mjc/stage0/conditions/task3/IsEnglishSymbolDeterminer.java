package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        String regex = "[a-zA-Z]";
        if(String.valueOf(symbol).matches(regex)) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
