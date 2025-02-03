package td1.td1

import kotlin.math.sqrt
import kotlin.system.measureTimeMillis

object Statistics {

    // Génération d'une liste de 1000 nombres aléatoires entre 20 et 40
    val rndList = List(1000) { (20..40).random() }

    // Calcul de la moyenne
    fun mean(): Double = rndList.sumOf { it } / rndList.size.toDouble()

    // Calcul de la variance
    fun variance(): Double {
        val avg = mean()
        return rndList.sumOf { (it - avg) * (it - avg) } / rndList.size
    }

    // Calcul de l'écart-type
    fun stdDev(): Double = sqrt(variance())

    // Histogramme des valeurs de la liste
    fun histogram(): Map<Int, Int> {
        return rndList.groupingBy { it }.eachCount()
    }

    // Mesure de performance entre sumOf et une boucle for
    fun performanceTest() {
        val sumOfTime = measureTimeMillis {
            val avg1 = mean()
        }

        val loopTime = measureTimeMillis {
            var sum = 0
            for (num in rndList) sum += num
            val avg2 = sum.toDouble() / rndList.size
        }

        println("Temps avec sumOf : $sumOfTime ms, Temps avec boucle for : $loopTime ms")
    }

    fun test() {
        println("Moyenne : ${mean()}")
        println("Variance : ${variance()}")
        println("Écart-type : ${stdDev()}")
        println("Histogramme : ${histogram()}")
        performanceTest()
    }
}
