package Exercice2;

import java.util.*;

public class GraphTraversal {
    // Représentation du graphe par liste d'adjacence
    private Map<Integer, List<Integer>> graph;

    public GraphTraversal() {
        graph = new HashMap<>();
    }

    // Ajoute une arête dans le graphe non orienté
    public void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    // BFS : Parcours en largeur
    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        System.out.println("Parcours BFS à partir de " + start + ":");
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");
            for (int neighbor : graph.getOrDefault(current, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    // DFS : Parcours en profondeur (version récursive)
    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        System.out.println("Parcours DFS à partir de " + start + ":");
        dfsHelper(start, visited);
        System.out.println();
    }

    private void dfsHelper(int current, Set<Integer> visited) {
        visited.add(current);
        System.out.print(current + " ");
        for (int neighbor : graph.getOrDefault(current, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }

    // Fonction pour vérifier la connectivité et trouver le chemin le plus court entre deux nœuds avec BFS
    public List<Integer> shortestPath(int start, int target) {
        Map<Integer, Integer> parent = new HashMap<>(); // Pour reconstruire le chemin
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);
        parent.put(start, null);  // Le début n'a pas de parent

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == target) {
                // Reconstruction du chemin
                List<Integer> path = new ArrayList<>();
                for (Integer node = target; node != null; node = parent.get(node)) {
                    path.add(node);
                }
                Collections.reverse(path);
                return path;
            }
            for (int neighbor : graph.getOrDefault(current, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    parent.put(neighbor, current);
                    queue.add(neighbor);
                }
            }
        }
        // Si aucun chemin trouvé
        return Collections.emptyList();
    }

    // Exemple d'utilisation
   public static void main(String[] args) {
        GraphTraversal gt = new GraphTraversal();

        // Création d'un graphe simple
        gt.addEdge(1, 2);
        gt.addEdge(1, 3);
        gt.addEdge(2, 4);
        gt.addEdge(3, 4);
        gt.addEdge(4, 5);
        gt.addEdge(6, 7);  // composante séparée

        // Test BFS et DFS
        gt.bfs(1);
        gt.dfs(1);

        // Tester la recherche de chemin
        List<Integer> path = gt.shortestPath(1, 5);
        if (!path.isEmpty()) {
            System.out.println("Chemin le plus court entre 1 et 5: " + path);
        } else {
            System.out.println("Il n'existe pas de chemin entre 1 et 5.");
        }

        // Tester la connectivité dans une composante séparée
        List<Integer> path2 = gt.shortestPath(1, 7);
        if (path2.isEmpty()) {
            System.out.println("Les nœuds 1 et 7 ne sont pas connectés.");
        }
    }
}
