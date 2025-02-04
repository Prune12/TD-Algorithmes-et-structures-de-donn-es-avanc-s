package Exercice4;

import java.util.*;

public class MergeIntervals {

    // Classe pour représenter un intervalle
    public static class Interval {
        int start;
        int end;
        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
        @Override
        public String toString() {
            return "(" + start + ", " + end + ")";
        }
    }

    public static List<Interval> mergeIntervals(List<Interval> intervals) {
        if (intervals == null || intervals.isEmpty()) {
            return Collections.emptyList();
        }
        // Trier les intervalles par heure de début
        intervals.sort(Comparator.comparingInt(i -> i.start));

        List<Interval> merged = new ArrayList<>();
        Interval current = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval next = intervals.get(i);
            if (current.end >= next.start) { // chevauchement détecté
                // Fusionner les intervalles en mettant à jour la borne de fin
                current.end = Math.max(current.end, next.end);
            } else {
                // Aucun chevauchement, on ajoute l'intervalle courant et on passe au suivant
                merged.add(current);
                current = next;
            }
        }
        // Ajouter le dernier intervalle
        merged.add(current);
        return merged;
    }

}

