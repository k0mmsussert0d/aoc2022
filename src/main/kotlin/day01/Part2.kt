package day01

fun part2(): Int {
    val lines = object {}.javaClass.getResourceAsStream("/day01/part1.txt").bufferedReader().readText()
    return lines
        .trim()
        .split("\n\n")
        .map { it.lines().sumOf(String::toInt) }
        .take(3)
        .sum()
}

fun main() {
    println(part2())
}