fun main() {
    println(weather("Ankara", 27, 31, 82))
    println()

    println(weather("Tokyo", 32, 36, 10))
    println()

    println(weather("Cape Town", 59, 64, 2))
    println()

    println(weather("Guatemala City", 50, 55, 7))
    println()
}

fun weather(city: String, lowTemperature: Int, highTemperature: Int, rain: Int): String {
    return "City: $city\nLow temperature: $lowTemperature, High temperature: $highTemperature\nChance of rain: $rain%"
}