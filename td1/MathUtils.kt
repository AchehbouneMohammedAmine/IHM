package td1.td1

import kotlin.math.sqrt

object MathUtils {

    // Fonction pour calculer la racine carrée d'un nombre
    fun mySqrt(x: Double): Double? {
        return if (x >= 0) sqrt(x) else null
    }

    fun test() {
        println("mySqrt(9) = ${mySqrt(9.0)}")
        println("mySqrt(-4) = ${mySqrt(-4.0)}")
    }
}
