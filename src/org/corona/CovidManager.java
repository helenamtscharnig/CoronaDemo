package org.corona;

import java.util.ArrayList;

public class CovidManager {

    public static void main(String[] args) {

        Incidence stmk20211111 = new Incidence(
                "Steiermark", "2021-11-11", 1300);
        Incidence stmk20211110 = new Incidence(
                "Steiermark", "2021-11-10", 1100);
        Incidence stmk20211109 = new Incidence(
                "Steiermark", "2021-11-09", 900);
        Incidence tir20211111 = new Incidence(
                "Tirol", "2021-11-11", 800);
        Incidence tir20211110 = new Incidence(
                "Tirol", "2021-11-10", 850);
        Incidence tir20211109 = new Incidence(
                "Tirol", "2021-11-09", 950);
        Incidence salz20211111 = new Incidence(
                "Salzburg", "2021-11-11", 1900);
        Incidence salz20211110 = new Incidence(
                "Tirol", "2021-11-10", 1650);
        Incidence salz20211109 = new Incidence(
                "Tirol", "2021-11-09", 1200);

        ArrayList<Incidence> recordedValues = new ArrayList<>();
        recordedValues.add(stmk20211111);
        recordedValues.add(stmk20211110);
        recordedValues.add(stmk20211109);
        recordedValues.add(salz20211111);
        recordedValues.add(salz20211110);
        recordedValues.add(salz20211109);
        recordedValues.add(tir20211111);
        recordedValues.add(tir20211110);
        recordedValues.add(tir20211109);
        recordedValues.add(new Incidence("burg", "2021-11-11", 550));

        //Wieviele Datensätze haben wir in der Datenbank?
        System.out.println("Count of Records " + recordedValues.size());

        //Anzahl der gesamten Fälle ermitteln
        int countTotalIncidences = 0;
        for (int i = 0; i < recordedValues.size(); i++) {
            Incidence oneValue = recordedValues.get(i);
            countTotalIncidences += oneValue.getNumber();

        }
        System.out.println("Bisher in Österreich " + countTotalIncidences + " Fälle");


    }
}
