/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author micha
 */
import java.io.PrintWriter;
import java.util.HashMap;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public SaveableDictionary() {
        this(null);
    }

    public boolean load() {
        try ( Scanner fileScanner = new Scanner(Paths.get(this.file));) {
            while (fileScanner.hasNext()) {
                String[] row = fileScanner.nextLine().split(":");
                // System.out.println("Currently adding the words: " + row);
                this.add(row[0], row[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Couldn't read the file");
        }
        return false;
    }

    public boolean save() {
        try ( PrintWriter writer = new PrintWriter(this.file);) {

            ArrayList<String> alreadyAdded = new ArrayList<String>();
            for (String word : this.dictionary.keySet()) {

                String translation = this.dictionary.get(word);
                if (!(alreadyAdded.contains(word) || alreadyAdded.contains(translation))) {
                    alreadyAdded.add(word);
                    writer.println(word + ":" + translation);
                }
            }
            return true;

        } catch (Exception e) {
            System.out.println("Couldn't save the dictionary");
        }
        return false;
    }

    public void add(String word, String translation) {
        if (!(this.dictionary.containsKey(word))) {
            this.dictionary.put(word, translation);
            this.dictionary.put(translation, word);
        }
    }

    public String translate(String word) {
        return this.dictionary.get(word);
    }

    public void delete(String word) {
        if (this.dictionary.containsKey(word)) {
            String translation = this.dictionary.get(word);
            this.dictionary.remove(word);
            this.dictionary.remove(translation);
        }
    }
}
