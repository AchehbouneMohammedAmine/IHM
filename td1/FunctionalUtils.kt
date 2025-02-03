package td1.td1

object FunctionalUtils {

    // Fonction apply qui applique une fonction m fois sur n
    fun apply(n: Int, m: Int = 0, f: (Int) -> Int): Int {
        var result = n
        repeat(m) {
            result = f(result)
        }
        return result
    }

    fun test() {
        val result1 = apply(2, 3) { x -> x * x }
        println("apply(2, 3, x -> x*x) = $result1") // Résultat attendu : 256

        val result2 = apply(12, 8) { x -> x / 2 }
        println("apply(12, 8, x -> x/2) = $result2") // Résultat attendu : 0
    }
}
