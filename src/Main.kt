import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {
    //task2()
    //task3()
    //task10()
    //task11()
    //task12()
    //task13()
    //task14()
    //task15()
    //task16()
    //task19()
    //task18()
    //task20()
    task21()
}

fun task1() {
    val name = "Aysu"
    println(name.uppercase())
    println(name.lowercase())
}

fun task2() {
    val name = "    aysu   "
    val reversedName = name.reversed()
    println(reversedName)
}

fun task3() {
    println("String-i daxil edin:")
    val input = readln()
    println("Deyismek istediyiniz herfi daxil edin:")
    val oldElement = readln()
    println("Hansi herfle deyisek?")
    val newElement = readln()
    val newString = input.replace(oldElement, newElement)
    println("New string: $newString")
}

fun task10() {
    val input = readln()
    val check = input[0].isDigit()
    println(check)
}

fun task11() {
    val digit = readln().toDouble()
    val result = digit.pow(3)
    Math.pow(digit, 6.0)
    println("Result: $result")
}

fun task12() {
    val array1 = arrayOf(1, 2, 3, 4, 5)
    val sum = array1.sum()
    println("Sum: $sum")
}

fun task13() {
    val array1 = arrayOf(4, 1, 6, 2, 8, 7, 3)
    val sortedArray = array1.sortedArray()
    println(sortedArray.contentToString())
}

fun task14() {
    val name = "   aysu   "
    println(name.trim())
}

fun task15() {
    val array1 = arrayOf(1, 2, 3, 4, 5, 6)
    println(array1.contains(7))
}

fun task16() {
    val name = "Aysu Huseynli"
    val newString = name.substring(2, 6)
    println(newString)
}

fun task19() {
    val array1 = arrayOf(1, 2, 3, 7, 9, 8)
    val check = array1.filter { it % 2 == 0 }
    println(check)
}

fun task18() {
    val name = "aysu huseynli"
    val vowels = name.filter { it in "aeouəüöiı" }
    println(vowels.length)
}

fun task20() {
    val array1 = arrayOf(1, 9, 3, 6, 2)
    println(array1.max())
}

fun task21() {
    val eded = 3.7
    println(eded.roundToInt())
}