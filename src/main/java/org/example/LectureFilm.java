package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LectureFilm {
    private ArrayList<String> films = new ArrayList<String>();

    public LectureFilm(String path) throws FileNotFoundException {
        enregistrerFilms(path);
    }

    public void enregistrerFilms(String path) throws FileNotFoundException {

        // Ouvre le fichier path
        var fileInput = new FileInputStream(path);
        Scanner fileScanner = new Scanner(fileInput);

        while (fileScanner.hasNextLine()) {
            String titre = fileScanner.nextLine();
            films.add(titre);
        }
        fileScanner.close();
    }

    public ArrayList<String> getFilms() {
        return films;
    }
}
