package Exercice3;

import java.util.*;

public class Knapsack {

    // Structure pour représenter un article
    public static class Item {
        int value;
        int weight;
        public Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
        @Override
        public String toString() {
            return "(valeur: " + value + ", poids: " + weight + ")";
        }
    }

    public static Map<String, Object> knapsack(Item[] items, int capacity) {
        int n = items.length;
        // dp[i][w] représente la valeur maximale obtenable avec les i premiers articles et une capacité w
        int[][] dp = new int[n + 1][capacity + 1];

        // Remplissage de la table dp
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (items[i - 1].weight <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w],
                            dp[i - 1][w - items[i - 1].weight] + items[i - 1].value);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        // Reconstruction de la solution pour retrouver les articles choisis
        List<Item> chosenItems = new ArrayList<>();
        int w = capacity;
        for (int i = n; i > 0; i--) {
            if (dp[i][w] != dp[i - 1][w]) {
                chosenItems.add(items[i - 1]);
                w -= items[i - 1].weight;
            }
        }
        // Inverser l'ordre pour obtenir l'ordre original
        Collections.reverse(chosenItems);

        // On retourne à la fois la valeur maximale et la liste d'articles choisis
        Map<String, Object> result = new HashMap<>();
        result.put("maxValue", dp[n][capacity]);
        result.put("items", chosenItems);
        return result;
    }

}

