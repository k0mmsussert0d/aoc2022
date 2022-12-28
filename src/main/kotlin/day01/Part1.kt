package day01

fun part1(): Int {
    val lines = object {}.javaClass.getResourceAsStream("/day01/part1.txt").bufferedReader().readText()
    return lines
        .trim()
        .split("\n\n")
        .maxOf { it.lines().sumOf(String::toInt) }
}

fun main() {
    println(part1())
}