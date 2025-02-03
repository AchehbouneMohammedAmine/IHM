package td1.td1

object Sequences {

    // Générer les m premiers termes de la suite de Syracuse
    fun syracuse(n: Int, m: Int): List<Int> {
        return generateSequence(n) { if (it % 2 == 0) it / 2 else 3 * it + 1 }
            .take(m)
            .toList()
    }

    // Approximation de sqrt(2) avec la suite de Newton
    fun sqrtApprox(m: Int): Double {
        var u = 1.0
        repeat(m) {
            u = 0.5 * (u + 2 / u)
        }
        return u
    }

    fun test() {
        println("Suite de Syracuse pour n=12, m=10 : ${syracuse(12, 10)}")
        println("Approximation de sqrt(2) après 10 itérations : ${sqrtApprox(10)}")
    }
}
