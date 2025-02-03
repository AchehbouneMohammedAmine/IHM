# TD1 - Introduction à Kotlin (L3 MIAGE - 2024-2025)

## 📌 Présentation
Ce projet contient la résolution du **TD1 de Kotlin** du cours *L3 MIAGE - HM et Programmation Mobile*.
Chaque exercice est implémenté dans un fichier dédié avec des classes et des fonctions bien structurées.

---

## 📂 **Structure du projet**
```
TD1/
│── src/
│   ├── main/
│   │   ├── kotlin/
│   │   │   ├── td1/
│   │   │   │   ├── Main.kt
│   │   │   │   ├── MathUtils.kt
│   │   │   │   ├── PolynomialSolver.kt
│   │   │   │   ├── FunctionalUtils.kt
│   │   │   │   ├── Statistics.kt
│   │   │   │   ├── Sequences.kt
│── README.md
│── pom.xml (si Maven)
```

---

## 📖 **Explication des exercices et solutions (avec classes et lignes)**

### **Exercice 1 - Analyse statistique**
1. **Générer une liste de 1000 nombres aléatoires entre 20 et 40**
   - Classe : `Statistics.kt` (ligne 9)
   - Solution : `val rndList = List(1000) { (20..40).random() }`

2. **Calcul de la moyenne**
   - Classe : `Statistics.kt` (ligne 12)
   - Code :
     ```kotlin
     val avg = rndList.sumOf { it } / rndList.size.toDouble()
     ```

3. **Calcul de la variance et de l'écart-type**
   - Classe : `Statistics.kt` (lignes 15-18)
   - Variance :
     ```kotlin
     val variance = rndList.sumOf { (it - avg) * (it - avg) } / rndList.size
     ```
   - Écart-type : `sqrt(variance)`

4. **Génération d'un histogramme**
   - Classe : `Statistics.kt` (ligne 22)
   - Code : `val histogram = rndList.groupingBy { it }.eachCount()`

5. **Comparaison des performances**
   - Classe : `Statistics.kt` (ligne 26-30)
   - Code : `measureTimeMillis {}`

---

### **Exercice 2 - Polynômes et racines réelles**
1. **Création de la fonction `mySqrt`**
   - Classe : `MathUtils.kt` (ligne 10)
   - Code :
     ```kotlin
     fun mySqrt(x: Double): Double? {
         return if (x >= 0) sqrt(x) else null
     }
     ```

2. **Calcul des racines réelles d'un polynôme de degré 2**
   - Classe : `PolynomialSolver.kt` (ligne 12-20)
   - Code :
     ```kotlin
     fun realRoots(a: Double, b: Double, c: Double): List<Double> {
         val delta = b * b - 4 * a * c
         return when {
             delta < 0 -> emptyList()
             delta == 0.0 -> listOf(-b / (2 * a))
             else -> listOf((-b - sqrt(delta)) / (2 * a), (-b + sqrt(delta)) / (2 * a))
         }
     }
     ```

3. **Tests avec plusieurs polynômes**
   - Classe : `PolynomialSolver.kt` (ligne 24)
   - Code : `println(realRoots(1.0, -3.0, 2.0))`

---

### **Exercice 3 - Programmation fonctionnelle avec `apply`**
1. **Définition de `apply`**
   - Classe : `FunctionalUtils.kt` (ligne 10)
   - Code :
     ```kotlin
     fun apply(n: Int, m: Int = 0, f: (Int) -> Int): Int {
         var result = n
         repeat(m) { result = f(result) }
         return result
     }
     ```

2. **Application de `apply` sur `x -> x * x`**
   - Classe : `FunctionalUtils.kt` (ligne 16)
   - Code : `println(apply(2, 3) { x -> x * x })`

3. **Utilisation pour la suite de Syracuse**
   - Classe : `Sequences.kt` (ligne 10)
   - Code :
     ```kotlin
     fun syracuse(n: Int, m: Int): List<Int> {
         return generateSequence(n) { if (it % 2 == 0) it / 2 else 3 * it + 1 }
             .take(m)
             .toList()
     }
     ```

4. **Approximation de sqrt(2) avec `apply`**
   - Classe : `Sequences.kt` (ligne 16)
   - Code :
     ```kotlin
     fun sqrtApprox(m: Int): Double {
         var u = 1.0
         repeat(m) { u = 0.5 * (u + 2 / u) }
         return u
     }
     println(sqrtApprox(10))
     ```

---

## 🛠 **Comment exécuter le projet ?**
### **1️⃣ Exécution avec `Main.kt`**
1. Ouvrir **IntelliJ IDEA**.
2. Lancer `Main.kt` avec ▶️.
3. Vérifier les résultats affichés dans la console.

### **2️⃣ Tester chaque fonction avec JUnit**
1. Installer `JUnit 5` si besoin.
2. Créer des fichiers de test dans `src/test/kotlin/td1/`.
3. Exécuter les tests avec **Run All Tests**.

---

## ✅ **Conclusion**
- Ce TD couvre **la génération aléatoire, les statistiques, les polynômes et la programmation fonctionnelle en Kotlin**.
- Les **tests unitaires garantissent la validité des résultats**.
- L'utilisation de **`apply` et `generateSequence` simplifie la programmation fonctionnelle**.

🚀 **Projet bien structuré et prêt à être utilisé pour d'autres TDs !**

