package day03


fun part1(): Int {
    return object {}.javaClass.getResourceAsStream("/day03/input").bufferedReader().readLines()
        .map {
            it.slice(0 until it.length / 2) to it.slice(it.length / 2 until it.length)
        }
        .map {
            it.first.find { it1 -> it1 in it.second }!!
        }
        .sumOf {
            priority(it)
        }
}

fun priority(it: Char) = if (it.isLowerCase()) {
    it.code - 'a'.code + 1
} else {
    it.code - 'A'.code + 27
}

fun main() {
    println(part1())
}