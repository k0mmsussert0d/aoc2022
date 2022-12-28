package day02

val ties = mapOf(
    "X" to "A",
    "Y" to "B",
    "Z" to "C"
)

val wins = mapOf(
    "X" to "C",
    "Y" to "A",
    "Z" to "B"
)

val loses = mapOf(
    "X" to "B",
    "Y" to "C",
    "Z" to "A"
)

fun part1(): Int {
    return object {}.javaClass.getResourceAsStream("/day02/input").bufferedReader().readLines()
        .map {
            val parts = it.split(" ")
            parts[0] to parts[1]
        }.sumOf {
            var res = 0
            when (it.first) {
                ties[it.second] -> {
                    res += 3
                }

                wins[it.second] -> {
                    res += 6
                }

                loses[it.second] -> {
                    res += 0
                }
            }
            res += ties.keys.indexOf(it.second) + 1
            res
        }
}

fun main() {
    println(part1())
}