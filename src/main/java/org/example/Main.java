package org.example;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // permuter();

        System.out.print("Entrer le nom du fichier : ");
        Scanner scannerConsole = new Scanner(System.in);
        String filePath = scannerConsole.nextLine();
        try {
            LectureFilm lectureFilm = new LectureFilm(filePath);
            ArrayList<String> films = lectureFilm.getFilms();

            for (String film : films) {
                System.out.println("Titre : " + film);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Le fichier " + filePath + " n'existe pas");
        }
    }

    public void permuter() {
        int a = 1;
        int b = 5;

        System.out.println("Voici les valeurs de a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Voici les valeurs de a = " + a + ", b = " + b);
    }
}