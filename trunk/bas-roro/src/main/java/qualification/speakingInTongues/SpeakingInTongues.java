package qualification.speakingInTongues;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SpeakingInTongues {

    static Scanner scanner;

    static Map<Character, Character> map = new HashMap<Character, Character>();

    static final String FILE_OUTPUT_NAME = "/src/main/resources/qualification/speakingInTongues/A-small-practice.out";

    static final String FILE_INPUT_NAME = "/src/main/resources/qualification/speakingInTongues/A-small-practice.in";

    static FileWriter fw;

    static BufferedWriter output;

    static {
        map.put(' ', ' ');
        map.put('y', 'a');
        map.put('n', 'b');
        map.put('f', 'c');
        map.put('i', 'd');
        map.put('c', 'e');
        map.put('w', 'f');
        map.put('l', 'g');
        map.put('b', 'h');
        map.put('k', 'i');
        map.put('u', 'j');
        map.put('o', 'k');
        map.put('m', 'l');
        map.put('x', 'm');
        map.put('s', 'n');
        map.put('e', 'o');
        map.put('v', 'p');
        map.put('z', 'q');
        map.put('p', 'r');
        map.put('d', 's');
        map.put('r', 't');
        map.put('j', 'u');
        map.put('g', 'v');
        map.put('t', 'w');
        map.put('h', 'x');
        map.put('a', 'y');
        map.put('q', 'z');
    }

    /**
	 * Methode de traitement du cas
	 * @return String
	 */
    private static String traitement() {
        String line = scanner.nextLine();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < line.length(); i++) {
            result.append(map.get(line.charAt(i)));
        }
        return result.toString();
    }
    
    /**
	 * Methode d'execution classique
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		// Ouverture du fichier d'entrées
		scanner = new Scanner(new File(FILE_INPUT_NAME));
		
		// Creation du fichier de sortie
		output = new BufferedWriter(new FileWriter(FILE_OUTPUT_NAME, false));
        
		// Recuperation du nombre de cas
        int n = new Scanner(scanner.nextLine()).nextInt();
        
        // On boucle sur le nombre de cas possible avec traitement du cas
        for (int i = 1; i <= n; i++) {
            String resultLine = "Case #" + i + ": " + traitement() + "\n";
            output.write(resultLine);
            System.out.print(resultLine);
        }

        // transfert des données au fichier et fermeture du fichier
        output.flush();
        output.close();
	}
}
