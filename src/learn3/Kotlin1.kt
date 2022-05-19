package learn3

/**
 * 枚举
 */
fun main() {
    val seasons = Season.values();
    seasons.forEach { season: Season -> println(season) }
}

enum class Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

