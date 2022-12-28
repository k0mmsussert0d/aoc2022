package day03

fun part2(): Int {
    return object {}.javaClass.getResourceAsStream("/day03/input").bufferedReader().readLines()
        .windowed(3, 3)
        .map {
            it[0].find { it0 -> it0 in it[1] && it0 in it[2] }!!
        }
        .sumOf {
            priority(it)
        }
}

fun main() {
    println(part2())
}