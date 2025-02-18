// 11. Группа крови
fun main() {
    // Запрашиваем у пользователя группу крови
    println("Введите вашу группу крови (A, B, AB, O):")
    val bloodType = readLine()?.toUpperCase()

    // Определяем, какие группы крови подходят для переливания
    when (bloodType) {
        "A" -> println("Для группы крови A можно переливать: A, O")
        "B" -> println("Для группы крови B можно переливать: B, O")
        "AB" -> println("Для группы крови AB можно переливать: A, B, AB, O")
        "O" -> println("Для группы крови O можно переливать: O")
        else -> println("Неизвестная группа крови. Пожалуйста, введите A, B, AB или O.")
    }
}