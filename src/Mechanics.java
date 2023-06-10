import java.util.Random;

public class Mechanics {

    public Character[] characterLegendaryDatabase;
    public Character[] characterEpicDatabase;
    public Character[] characterRareDatabase;

    public Character roll(){
        Random rand = new Random();
        int roll = rand.nextInt(1001);
        if (roll % Probabilities.legendaryProbability == 0) {
            int characterNumber = rand.nextInt(characterLegendaryDatabase.length);
            return characterLegendaryDatabase[characterNumber];
        } else if (roll % Probabilities.epicProbability == 0) {
            int characterNumber = rand.nextInt(characterEpicDatabase.length);
            return characterEpicDatabase[characterNumber];
        } else {
            int characterNumber = rand.nextInt(characterRareDatabase.length);
            return characterRareDatabase[characterNumber];
        }
    }

    public void readDatabasesIfExists() {
        characterLegendaryDatabase = Utils.readFileToDatabase(Paths.legendaryCharactersPath);
        characterEpicDatabase = Utils.readFileToDatabase(Paths.epicCharactersPath);
        characterRareDatabase = Utils.readFileToDatabase(Paths.rareCharactersPath);
    }

}
