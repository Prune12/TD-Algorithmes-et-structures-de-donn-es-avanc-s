
---

```markdown
# TPAdvanced Algorithms and Data Structures

Bienvenue dans le dépôt **TPAdvanced Algorithms and Data Structures**. Ce projet contient une série d'exercices portant sur des algorithmes avancés et des structures de données. Chaque exercice est implémenté dans son propre dossier et couvre les thématiques suivantes :

- **Exercice 1 : Recherche Binaire**
- **Exercice 2 : Parcours de Graphe (BFS & DFS)**
- **Exercice 3 : Sac à Dos 0/1 (Knapsack Problem)**
- **Exercice 4 : Fusion d'Intervalles**
- **Exercice 5 : Algorithme de Kadane (Maximum Subarray Sum)**

À la racine du projet se trouve également une classe `Main.java` qui propose un menu interactif pour tester l'ensemble des algorithmes.

---

## Table des Matières

- [Description du Projet](#description-du-projet)
- [Structure du Projet](#structure-du-projet)
- [Prérequis](#prérequis)
- [Comment Lancer le Projet](#comment-lancer-le-projet)
  - [Depuis l'Invite de Commande / Terminal](#depuis-linvite-de-commande--terminal)
  - [Utilisation d'IntelliJ IDEA](#utilisation-dintellij-idea)
  - [Utilisation de VS Code](#utilisation-de-vs-code)
  - [Utilisation d'Eclipse](#utilisation-de-eclipse)
- [Contenu et Explications des Exercices](#contenu-et-explications-des-exercices)
- [Contribuer](#contribuer)
- [Licence](#licence)

---

## Description du Projet

Ce projet a pour objectif de mettre en pratique plusieurs algorithmes fondamentaux et avancés en Java. Chaque exercice est conçu pour résoudre un problème spécifique :

- **Recherche Binaire :** Recherche rapide dans un tableau trié.
- **Parcours de Graphe :** Exploration de graphes via BFS (Breadth-First Search) et DFS (Depth-First Search), incluant la recherche du chemin le plus court.
- **Sac à Dos 0/1 :** Optimisation de la sélection d'articles pour maximiser la valeur tout en respectant une contrainte de poids grâce à la programmation dynamique.
- **Fusion d'Intervalles :** Fusion de plages horaires se chevauchant pour une gestion optimisée des intervalles.
- **Algorithme de Kadane :** Recherche du sous-tableau contigu ayant la somme maximale dans un tableau d'entiers.

La classe `Main.java` offre un menu interactif permettant de tester facilement chacun de ces algorithmes.

---

## Structure du Projet

```
TPAdvanced Algorithms and Data Structures/
│
├── Exercice1/
│   └── BinarySearch.java
│
├── Exercice2/
│   └── GraphTraversal.java
│
├── Exercice3/
│   └── Knapsack.java
│
├── Exercice4/
│   └── MergeIntervals.java
│
├── Exercice5/
│   └── KadaneAlgorithm.java
│
└── Main.java
```

- **Exercice1/BinarySearch.java :** Implémente la recherche binaire en Java.
- **Exercice2/GraphTraversal.java :** Contient l'implémentation des algorithmes BFS et DFS pour le parcours de graphe.
- **Exercice3/Knapsack.java :** Propose une solution au problème du sac à dos 0/1 à l'aide de la programmation dynamique.
- **Exercice4/MergeIntervals.java :** Fusionne des intervalles de temps se chevauchant.
- **Exercice5/KadaneAlgorithm.java :** Implémente l'algorithme de Kadane pour trouver le sous-tableau avec la somme maximale.
- **Main.java :** Point d'entrée du projet, proposant un menu interactif pour tester les différents algorithmes.

---

## Prérequis

- **Java Development Kit (JDK) 8 ou supérieur**  
  Assurez-vous que Java est installé et que la variable d'environnement `JAVA_HOME` est correctement configurée.
- Un éditeur ou IDE pour Java, par exemple :
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/)
  - [Visual Studio Code](https://code.visualstudio.com/)
  - [Eclipse](https://www.eclipse.org/)

---

## Comment Lancer le Projet

### Depuis l'Invite de Commande / Terminal

1. **Cloner le dépôt :**
   ```bash
   git clone https://github.com/votre-utilisateur/TPAdvanced-Algorithms-and-Data-Structures.git
   cd TPAdvanced-Algorithms-and-Data-Structures
   ```

2. **Compiler le projet :**  
   Depuis la racine du projet, compilez l'ensemble des fichiers Java. Par exemple, sous Linux/MacOS :
   ```bash
   javac */*.java Main.java
   ```
   Sous Windows, vous pouvez utiliser une commande similaire dans l'invite de commande.

3. **Exécuter le programme :**
   ```bash
   java Main
   ```

   Un menu interactif s'affichera. Tapez le numéro correspondant à l'algorithme que vous souhaitez tester et appuyez sur **Entrée**.

### Utilisation d'IntelliJ IDEA

1. **Ouvrir le Projet :**
    - Lancez IntelliJ IDEA.
    - Sélectionnez **File > Open** et choisissez le dossier `TPAdvanced Algorithms and Data Structures`.

2. **Configurer le Projet :**  
   IntelliJ détectera automatiquement les fichiers Java et configurera le projet. Assurez-vous que le SDK Java est bien configuré.

3. **Exécuter la Classe Main :**
    - Dans l'arborescence du projet, cliquez droit sur `Main.java` et sélectionnez **Run 'Main.main()'**.
    - Le terminal intégré affichera le menu interactif.

### Utilisation de VS Code

1. **Ouvrir le Dossier :**
    - Ouvrez VS Code.
    - Sélectionnez **File > Open Folder** et choisissez le dossier `TPAdvanced Algorithms and Data Structures`.

2. **Configurer l'Environnement Java :**  
   Installez les extensions recommandées pour Java (ex. : **Language Support for Java(TM) by Red Hat** et **Debugger for Java**).

3. **Compiler et Exécuter :**
    - Utilisez le terminal intégré pour compiler le projet :
      ```bash
      javac */*.java Main.java
      ```
    - Exécutez la classe `Main` avec :
      ```bash
      java Main
      ```

### Utilisation d'Eclipse

1. **Importer le Projet :**
    - Ouvrez Eclipse.
    - Sélectionnez **File > Import... > Existing Projects into Workspace**.
    - Naviguez vers le dossier `TPAdvanced Algorithms and Data Structures` et importez-le.

2. **Configurer et Exécuter :**
    - Assurez-vous que le JDK est configuré dans Eclipse.
    - Dans l'Explorateur de projets, faites un clic droit sur `Main.java` et sélectionnez **Run As > Java Application**.
    - Le menu interactif s'affichera dans la console d'Eclipse.

---

## Contenu et Explications des Exercices

1. **Recherche Binaire :**
    - Implémentation utilisant la méthode récursive pour diviser le tableau et localiser la valeur cible rapidement.
    - [Voir le code dans `Exercice1/BinarySearch.java`](Exercice1/BinarySearch.java).

2. **Parcours de Graphe (BFS & DFS) :**
    - Exploration de graphes pour trouver le chemin le plus court et parcourir l'ensemble des nœuds.
    - [Voir le code dans `Exercice2/GraphTraversal.java`](Exercice2/GraphTraversal.java).

3. **Sac à Dos 0/1 :**
    - Résolution du problème d'optimisation par programmation dynamique.
    - [Voir le code dans `Exercice3/Knapsack.java`](Exercice3/Knapsack.java).

4. **Fusion d'Intervalles :**
    - Tri et fusion d'intervalles se chevauchant pour obtenir des plages horaires consolidées.
    - [Voir le code dans `Exercice4/MergeIntervals.java`](Exercice4/MergeIntervals.java).

5. **Algorithme de Kadane :**
    - Recherche du sous-tableau avec la somme maximale grâce à une itération unique.
    - [Voir le code dans `Exercice5/KadaneAlgorithm.java`](Exercice5/KadaneAlgorithm.java).

La classe `Main.java` regroupe ces algorithmes et permet de les tester via un menu interactif.

---


## Licence

Ce projet est sous licence MIT. Voir le fichier [LICENSE](LICENSE) pour plus de détails.
```

---

Ce **README.md** offre une description complète du projet, détaille la structure des dossiers, explique comment configurer et lancer le projet sur différents environnements de développement (IntelliJ IDEA, VS Code, Eclipse), et fournit des liens vers les fichiers source pour chaque exercice. Vous pouvez l'adapter selon vos besoins ou ajouter des sections supplémentaires si nécessaire.