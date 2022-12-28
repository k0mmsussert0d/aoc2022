package day02

import java.lang.RuntimeException

val points = mapOf(
    "A" to 1,
    "B" to 2,
    "C" to 3
);

val wins0 = mapOf(
    "A" to "B",
    "B" to "C",
    "C" to "A"
);

val loses0 = mapOf(
    "A" to "C",
    "B" to "A",
    "C" to "B"
)

fun part2(): Int {
    return object {}.javaClass.getResourceAsStream("/day02/input").bufferedReader().readLines()
        .map {
            val parts = it.split(" ")
            parts[0] to parts[1]
        }
        .sumOf {
            when (it.second) {
                "X" -> points[loses0[it.first]]!!
                "Y" -> points[it.first]!! + 3
                "Z" -> points[wins0[it.first]]!! + 6
                else -> throw RuntimeException()
            }
        }
}

fun main() {
    println(part2())
}