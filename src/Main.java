import Exercice1.BinarySearch;
import Exercice2.GraphTraversal;
import Exercice3.Knapsack;
import Exercice4.MergeIntervals;
import Exercice5.KadaneAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static Exercice1.BinarySearch.binarySearch;
import static Exercice3.Knapsack.knapsack;

import java.util.*;



//================== Classe Main: Menu de Test ==================
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== Menu des Algorithmes =====");
            System.out.println("1. Recherche Binaire");
            System.out.println("2. Parcours de Graphe (BFS & DFS)");
            System.out.println("3. Sac à Dos 0/1");
            System.out.println("4. Fusion d'Intervalles");
            System.out.println("5. Algorithme de Kadane");
            System.out.println("0. Quitter");
            System.out.print("Veuillez choisir une option : ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    testBinarySearch();
                    break;
                case 2:
                    testGraphTraversal();
                    break;
                case 3:
                    testKnapsack();
                    break;
                case 4:
                    testMergeIntervals();
                    break;
                case 5:
                    testKadane();
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while(choice != 0);
        scanner.close();
    }

    // Test de l'algorithme de Recherche Binaire
    private static void testBinarySearch() {
        System.out.println("\n--- Test de la Recherche Binaire ---");
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 7;
        int index = BinarySearch.binarySearch(sortedArray, target);
        if (index != -1) {
            System.out.println("La cible " + target + " a été trouvée à l'indice " + index + ".");
        } else {
            System.out.println("La cible " + target + " n'a pas été trouvée dans le tableau.");
        }
    }

    // Test de l'algorithme de Parcours de Graphe (BFS & DFS)
    private static void testGraphTraversal() {
        System.out.println("\n--- Test du Parcours de Graphe ---");
        GraphTraversal gt = new GraphTraversal();
        // Création d'un graphe d'exemple
        gt.addEdge(1, 2);
        gt.addEdge(1, 3);
        gt.addEdge(2, 4);
        gt.addEdge(3, 4);
        gt.addEdge(4, 5);
        gt.addEdge(6, 7); // composante séparée

        // Affichage des parcours
        gt.bfs(1);
        gt.dfs(1);

        // Recherche du chemin le plus court
        List<Integer> path = gt.shortestPath(1, 5);
        if (!path.isEmpty()) {
            System.out.println("Chemin le plus court entre 1 et 5 : " + path);
        } else {
            System.out.println("Aucun chemin trouvé entre 1 et 5.");
        }
    }

    // Test du problème du Sac à Dos 0/1
    private static void testKnapsack() {
        System.out.println("\n--- Test du Sac à Dos 0/1 ---");
        Knapsack.Item[] items = {
                new Knapsack.Item(60, 10),
                new Knapsack.Item(100, 20),
                new Knapsack.Item(120, 30)
        };
        int capacity = 50;
        Map<String, Object> solution = Knapsack.knapsack(items, capacity);
        System.out.println("Valeur maximale obtenue : " + solution.get("maxValue"));
        System.out.println("Articles sélectionnés : " + solution.get("items"));
    }

    // Test de l'algorithme de Fusion d'Intervalles
    private static void testMergeIntervals() {
        System.out.println("\n--- Test de Fusion d'Intervalles ---");
        List<MergeIntervals.Interval> intervals = new ArrayList<>();
        intervals.add(new MergeIntervals.Interval(1, 3));
        intervals.add(new MergeIntervals.Interval(2, 6));
        intervals.add(new MergeIntervals.Interval(8, 10));
        intervals.add(new MergeIntervals.Interval(15, 18));
        intervals.add(new MergeIntervals.Interval(17, 20));
        List<MergeIntervals.Interval> merged = MergeIntervals.mergeIntervals(intervals);
        System.out.println("Intervalles fusionnés : " + merged);
    }

    // Test de l'Algorithme de Kadane
    private static void testKadane() {
        System.out.println("\n--- Test de l'Algorithme de Kadane ---");
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] result = KadaneAlgorithm.kadane(arr);
        System.out.println("Somme maximale : " + result[0]);
        System.out.println("Sous-tableau optimal : de l'indice " + result[1] + " à l'indice " + result[2]);
    }
}
