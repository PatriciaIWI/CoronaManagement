package org.campus02;

import java.util.ArrayList;
import java.util.HashMap;

public class CovidManager {
    public static void main(String[] args) {
        Incidence Stmk20211111 = new Incidence("Steiermark", "2021-11-11", 1300);
        Incidence Kärnt20211111 = new Incidence("Kärnten", "2021-11-11", 1200);
        Incidence Tirol20211111 = new Incidence("Tirol", "2021-11-11", 1500);
        Incidence Wien20211111 = new Incidence("Wien", "2021-11-11", 1800);


        ArrayList<Incidence>  recordedValues = new ArrayList<>();
        recordedValues.add(Stmk20211111);
        recordedValues.add(Kärnt20211111);
        recordedValues.add(Tirol20211111);
        recordedValues.add(Wien20211111);
        recordedValues.add(new Incidence("Salzburg", "2011-11-11", 2999));

        System.out.println("Count of recorded Records " +  recordedValues.size());

        //count der gesamten Fälle
        int countTotalIncidence = 0;
        for (int i = 0; i < recordedValues.size(); i++ ) {
            Incidence oneValue = recordedValues.get(i);
           // countTotalIncidence += oneValue.getNumber();
            countTotalIncidence = countTotalIncidence + oneValue.getNumber();
            System.out.println("bisher in Österr. : " + countTotalIncidence + "Fälle"); // Zeigt alle Fälle hintereinander zusammen gezählt

        }
        System.out.println("bisher in Österr. : " + countTotalIncidence + "Fälle"); // Zeigt die komplette Summe

        countTotalIncidence = 0;

        //iter

        for (Incidence incidence:
             recordedValues) {
            countTotalIncidence += incidence.getNumber();
        }
        System.out.println("bisher in Österr. : " + countTotalIncidence + "Fälle");

//Anzahl der Fälle je Bundesland
        HashMap<String, Integer> totalIncidencesState = new HashMap<>();
        for (Incidence oneElement : recordedValues) {
            /* 1. Ist mein Key bereits in der Liste
            2. Wenn nein, dann muss ich den Key aufnehmen
            3. wenn ja, dann muss ich den Wert auslesen, summieren und neu ablegen,
            4.
             */
            if (totalIncidencesState.containsKey(oneElement.getState())){
                //  Ja, Fall 3
                int currentValue = totalIncidencesState.get(oneElement.getState());
                currentValue += oneElement.getNumber();
                totalIncidencesState.put(oneElement.getState(), currentValue);
            }
            else {
                // Fall 4
            totalIncidencesState.put(oneElement.getState(), oneElement.getNumber());
            }

        }
        System.out.println("totalIncidencesState = " + totalIncidencesState);


        }



    }

