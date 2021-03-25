


public class Checker {
    public boolean isDayOfWeek(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
    public boolean allVowels(String string) {
        return string.matches("[aeiou]*");
    }
    public boolean timeOfDay(String string) {
        String[] input = string.split(":");
        return (input.length == 3) && ((input[0].matches("[0-1][0-9]") || input[0].matches("2[0-3]"))) &&
            (input[1].matches("[0-5][0-9]")) && (input[2].matches("[0-5][0-9]"));
        
    }
}
