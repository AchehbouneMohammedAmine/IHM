package td1.td1

import kotlin.math.sqrt

object PolynomialSolver {

    // Fonction pour calculer les racines réelles d'un polynôme de degré 2
    fun realRoots(a: Double, b: Double, c: Double): List<Double> {
        val delta = b * b - 4 * a * c
        return when {
            delta < 0 -> emptyList()
            delta == 0.0 -> listOf(-b / (2 * a))
            else -> {
                val sqrtDelta = sqrt(delta)
                listOf((-b - sqrtDelta) / (2 * a), (-b + sqrtDelta) / (2 * a))
            }
        }
    }

    fun test() {
        println("Racines de x^2 - 2x + 1: ${realRoots(1.0, -2.0, 1.0)}")
        println("Racines de x^2 - 2x + 2: ${realRoots(1.0, -2.0, 2.0)}")
        println("Racines de x^2 - 3x + 2: ${realRoots(1.0, -3.0, 2.0)}")
    }
}
