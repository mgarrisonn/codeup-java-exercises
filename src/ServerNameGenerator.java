import java.util.Random;

public class ServerNameGenerator {

    private static String[] adjectives = {
            "Bland",
            "Sour",
            "Boiling",
            "Chilly",
            "Freezing",
            "Blaring",
            "Mute",
            "Silver",
            "Abundant"
    };
    private static String[] nouns = {
            "Juice",
            "Tom",
            "Car",
            "Dog",
            "Australia",
            "Ocean",
            "Chair",
            "Tokyo",
            "Bowl",
            "Chocolate"
    };

    static Random randomizer = new Random();

    public static String randomElement(String[] words){
        return words[randomizer.nextInt(words.length)];
    }

    public static String serverName(String a, String b){
        return "Your new server name is: " + a + "-" + b;
    }

    public static void main(String[] args) {
        System.out.println(serverName(randomElement(adjectives), randomElement(nouns)));
        System.out.println(serverName(randomElement(adjectives), randomElement(nouns)));

    }
}
