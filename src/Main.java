public class Main {
    public static void main(String[] args) {
        Mechanics mechanics = new Mechanics();
        mechanics.readDatabasesIfExists();
        Character result;
        result = mechanics.roll();
        System.out.printf("You got %s, %s. It's a %s character.",result.name,result.description,result.rarity);





    }
}