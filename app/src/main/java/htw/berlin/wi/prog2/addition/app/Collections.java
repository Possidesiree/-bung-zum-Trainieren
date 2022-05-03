package htw.berlin.wi.prog2.addition.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections {
    public static void main(String[] args) {
        // 1. Siehe Klasse "Kunde"

        // 2.
        Kunde meyer = new Kunde("Meyer", "Haupstraße");
        Kunde mueller = new Kunde("Müller", "Nebenstrasse");

        // 3.
        List<Kunde> kunden = new ArrayList<>();
        kunden.add(meyer);
        kunden.add(mueller);

        // 4.
        for(Kunde kunde : kunden){
            System.out.println(String.format("Dieser Kunde heißt %s und hat die Anschrift %s", kunde.getName(), kunde.getStrasse()));
        }

        // 5.
        meyer.setStrasse("An der Goldgrube");

        // 6.
        Map<String, Kunde> kundenMap = new HashMap<>();
        kundenMap.put("X01", meyer);
        kundenMap.put("X02", mueller);

        // 7.
        for(Map.Entry<String, Kunde> kundenEntry : kundenMap.entrySet()){
            System.out.println(String.format("Dieser Kunde hat die id %s, heißt %s und hat die Anschrift %s", kundenEntry.getKey(), kundenEntry.getValue().getName(), kundenEntry.getValue().getStrasse()));
        }

        // 8. wie 4.
        for(Kunde kunde : kunden){
            System.out.println(String.format("Dieser Kunde heißt %s und hat die Anschrift %s", kunde.getName(), kunde.getStrasse()));
        }
    }
}
