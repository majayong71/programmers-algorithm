import java.util.Scanner

class LegacyAddUntilZero {
    fun run() {
        val scanner = Scanner(System.`in`)

        while (true) {
            val a = scanner.nextInt()
            val b = scanner.nextInt()

            if (a == 0 && b == 0) {
                break
            }

            val sum = a + b
            println(sum)
        }

        scanner.close()
    }
}

fun main() {
    val program = LegacyAddUntilZero()
    program.run()
}
