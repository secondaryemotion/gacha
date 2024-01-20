package mechanics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Utils {

    public static String[] readFile(String path){
        try {
            return Files.readString(Path.of(path)).split("\r\n");
        } catch (IOException E) {
            System.out.println("There is no such file. Please, check again.");
            return null;
        }
    }

    public static Character readLineToCharacter(String line) {
        String[] data = line.split(",");
        if (data.length < 3){
            System.out.println("Something is wrong with line "+line);
            return null;
        }
        Character newCharacter = new Character();
        newCharacter.rarity = Rarity.valueOf(data[0]);
        newCharacter.name = data[1];
        newCharacter.description = data[2];
        return newCharacter;
    }

    public static Character[] readFileToDatabase(String path){
        String[] file = readFile(path);
        assert file != null;
        Character[] database = new Character[file.length];
        for (int i = 0; i < file.length; i++){
            database[i] = readLineToCharacter(file[i]);
        }
        return database;
    }
}
