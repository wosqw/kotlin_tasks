import java.util.Scanner

// Задание 1. Функция для нахождения максимума

fun findMax(a: Int, b: Int): Int {
    if (a == b) {
        throw IllegalArgumentException("Числа равны.")
    }
    return if (a > b) a else b
}

// Задание 2. Калькулятор деления

fun divide(a: Int, b: Int): Int {
    if (b == 0) {
        throw ArithmeticException("Деление на ноль недопустимо")
    }
    return a / b
}

// Задание 3. Конвертер строк в числа

fun stringToInt(str: String): Int {
    return str.toIntOrNull() ?: throw NumberFormatException("Невозможно конвертировать строку в число")
}

// Задание 4. Проверка возраста

fun checkAge(age: Int) {
    if (age < 0 || age > 150) {
        throw IllegalArgumentException("Недопустимый возраст")
    }
}

// Задание 5. Нахождение корня

fun findSquareRoot(number: Double): Double {
    if (number < 0) {
        throw IllegalArgumentException("Невозможно найти корень из отрицательного числа")
    }
    return Math.sqrt(number)
}

// Задание 6. Факториал

fun factorial(n: Int): Int {
    if (n < 0) {
        throw IllegalArgumentException("Факториал отрицательного числа не существует")
    }
    var result = 1
    for (i in 1..n) {
        result *= i
    }
    return result
}

// Задание 7. Проверка массива на нули

fun checkArrayForZeros(arr: Array<Int>) {
    for (num in arr) {
        if (num == 0) {
            throw IllegalArgumentException("Массив содержит нули")
        }
    }
}

// Задание 8. Калькулятор возведения в степень

fun power(base: Int, exponent: Int): Int {
    if (exponent < 0) {
        throw IllegalArgumentException("Степень не может быть отрицательной")
    }
    var result = 1
    for (i in 1..exponent) {
        result *= base
    }
    return result
}

// Задание 9. Обрезка строки

fun truncateString(str: String, length: Int): String {
    if (length > str.length) {
        throw IllegalArgumentException("Длина обрезки больше длины строки")
    }
    return str.substring(0, length)
}

// Задание 10. Поиск элемента в массиве

fun findElement(arr: Array<Int>, element: Int) {
    if (element !in arr) {
        throw IllegalArgumentException("Элемент не найден")
    }
}

// Задание 11. Конвертация в двоичную систему

fun toBinary(number: Int): String {
    if (number < 0) {
        throw IllegalArgumentException("Число не может быть отрицательным")
    }
    return Integer.toBinaryString(number)
}

// Задание 12. Проверка делимости

fun isDivisible(a: Int, b: Int): Boolean {
    if (b == 0) {
        throw ArithmeticException("Деление на ноль недопустимо")
    }
    return a % b == 0
}

// Задание 13. Чтение элемента списка

fun getListElement(list: List<Int>, index: Int): Int {
    if (index < 0 || index >= list.size) {
        throw IndexOutOfBoundsException("Индекс выходит за пределы списка")
    }
    return list[index]
}

// Задание 14. Парольная проверка

class WeakPasswordException : Exception("Пароль слишком слабый")

fun checkPassword(password: String) {
    if (password.length < 8) {
        throw WeakPasswordException()
    }
}

// Задание 15. Проверка даты

fun checkDate(date: String) {
    try {
        val formatter = java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy")
        java.time.LocalDate.parse(date, formatter)
    } catch (e: java.time.format.DateTimeParseException) {
        throw java.time.format.DateTimeParseException("Неверный формат даты", date, 0)
    }
}

// Задание 16. Конкатенация строк

fun concatenateStrings(str1: String?, str2: String?): String {
    if (str1 == null || str2 == null) {
        throw NullPointerException("Одна из строк равна null")
    }
    return str1 + str2
}

// Задание 17. Остаток от деления

fun remainder(a: Int, b: Int): Int {
    if (b == 0) {
        throw ArithmeticException("Деление на ноль недопустимо")
    }
    return a % b
}

// Задание 18. Квадратный корень

fun squareRoot(number: Double): Double {
    if (number < 0) {
        throw IllegalArgumentException("Невозможно найти квадратный корень из отрицательного числа")
    }
    return Math.sqrt(number)
}

// Задание 19. Конвертер температуры

fun celsiusToFahrenheit(celsius: Double): Double {
    if (celsius < -273.15) {
        throw IllegalArgumentException("Температура ниже абсолютного нуля")
    }
    return celsius * 9 / 5 + 32
}

// Задание 20. Проверка строки на пустоту

fun checkStringEmpty(str: String?) {
    if (str.isNullOrEmpty()) {
        throw IllegalArgumentException("Строка пустая или равна null")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    // Задание 1. Функция для нахождения максимума
    try {
        println("Введите два числа для нахождения максимума:")
        val a = scanner.nextInt()
        val b = scanner.nextInt()
        val max = findMax(a, b)
        println("Максимальное число: $max")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    // Задание 2. Калькулятор деления
    try {
        println("Введите два числа для деления:")
        val a = scanner.nextInt()
        val b = scanner.nextInt()
        val result = divide(a, b)
        println("Результат деления: $result")
    } catch (e: ArithmeticException) {
        println(e.message)
    }

    // Задание 3. Конвертер строк в числа
    try {
        println("Введите строку для конвертации в число:")
        val str = scanner.next()
        val number = stringToInt(str)
        println("Конвертированное число: $number")
    } catch (e: NumberFormatException) {
        println(e.message)
    }

    // Задание 4. Проверка возраста
    try {
        println("Введите возраст:")
        val age = scanner.nextInt()
        checkAge(age)
        println("Возраст корректен")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    // Задание 5. Нахождение корня
    try {
        println("Введите число для нахождения корня:")
        val number = scanner.nextDouble()
        val root = findSquareRoot(number)
        println("Корень числа: $root")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    // Задание 6. Факториал
    try {
        println("Введите число для вычисления факториала:")
        val n = scanner.nextInt()
        val factorial = factorial(n)
        println("Факториал числа: $factorial")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    // Задание 7. Проверка массива на нули
    try {
        println("Введите элементы массива через пробел:")
        val arr = scanner.nextLine().split(" ").map { it.toInt() }.toTypedArray()
        checkArrayForZeros(arr)
        println("Массив не содержит нулей")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    // Задание 8. Калькулятор возведения в степень
    try {
        println("Введите основание и степень:")
        val base = scanner.nextInt()
        val exponent = scanner.nextInt()
        val powerResult = power(base, exponent)
        println("Результат возведения в степень: $powerResult")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    // Задание 9. Обрезка строки
    try {
        println("Введите строку и длину обрезки:")
        val str = scanner.next()
        val length = scanner.nextInt()
        val truncated = truncateString(str, length)
        println("Обрезанная строка: $truncated")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    // Задание 10. Поиск элемента в массиве
    try {
        println("Введите элементы массива через пробел и элемент для поиска:")
        val arr = scanner.nextLine().split(" ").map { it.toInt() }.toTypedArray()
        val element = scanner.nextInt()
        findElement(arr, element)
        println("Элемент найден")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    // Задание 11. Конвертация в двоичную систему
    try {
        println("Введите число для конвертации в двоичную систему:")
        val number = scanner.nextInt()
        val binary = toBinary(number)
        println("Двоичное представление: $binary")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    // Задание 12. Проверка делимости
    try {
        println("Введите два числа для проверки делимости:")
        val a = scanner.nextInt()
        val b = scanner.nextInt()
        val divisible = isDivisible(a, b)
        println("Результат проверки делимости: $divisible")
    } catch (e: ArithmeticException) {
        println(e.message)
    }

    // Задание 13. Чтение элемента списка
    try {
        println("Введите элементы списка через пробел и индекс:")
        val list = scanner.nextLine().split(" ").map { it.toInt() }
        val index = scanner.nextInt()
        val element = getListElement(list, index)
        println("Элемент списка: $element")
    } catch (e: IndexOutOfBoundsException) {
        println(e.message)
    }

    // Задание 14. Парольная проверка
    try {
        println("Введите пароль:")
        val password = scanner.next()
        checkPassword(password)
        println("Пароль корректен")
    } catch (e: WeakPasswordException) {
        println(e.message)
    }

    // Задание 15. Проверка даты
    try {
        println("Введите дату в формате dd.MM.yyyy:")
        val date = scanner.next()
        checkDate(date)
        println("Дата корректна")
    } catch (e: java.time.format.DateTimeParseException) {
        println(e.message)
    }

    // Задание 16. Конкатенация строк
    try {
        println("Введите две строки для конкатенации:")
        val str1 = scanner.next()
        val str2 = scanner.next()
        val concatenated = concatenateStrings(str1, str2)
        println("Конкатенированная строка: $concatenated")
    } catch (e: NullPointerException) {
        println(e.message)
    }

    // Задание 17. Остаток от деления
    try {
        println("Введите два числа для нахождения остатка от деления:")
        val a = scanner.nextInt()
        val b = scanner.nextInt()
        val remainder = remainder(a, b)
        println("Остаток от деления: $remainder")
    } catch (e: ArithmeticException) {
        println(e.message)
    }

    // Задание 18. Квадратный корень
    try {
        println("Введите число для нахождения квадратного корня:")
        val number = scanner.nextDouble()
        val sqrt = squareRoot(number)
        println("Квадратный корень: $sqrt")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    // Задание 19. Конвертер температуры
    try {
        println("Введите температуру в Цельсиях:")
        val celsius = scanner.nextDouble()
        val fahrenheit = celsiusToFahrenheit(celsius)
        println("Температура в Фаренгейтах: $fahrenheit")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    // Задание 20. Проверка строки на пустоту
    try {
        println("Введите строку для проверки на пустоту:")
        val str = scanner.next()
        checkStringEmpty(str)
        println("Строка не пустая")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}

