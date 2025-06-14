import kotlin.random.Random

fun main() {
//    task35()
//    task36()
//    task37()
//    task38()
//    task39()
//    task40()
    task42()
}

fun task35(){
    var number = 546
    val length = number.toString().length
    var mul = 1
    for (i in 1..length){
        val digit = number % 10
        mul*=digit
        number/=10
    }

    println(mul)
}

fun task36(){
    val number = 5
    val pow = 1
    var result = 1
    for (i in 1..pow){
        result*=number
    }
    println(result)
}

fun task37(){
    val randomNum= Random.nextInt(1,101)
    var guess: Int
    do {
        guess = readln().toInt()
        if (guess==randomNum){
            println("Tebrikler! dogru cavab $guess")
        }else if (guess>randomNum){
            println("Ededi azalt")
        }else{
            println("Ededi artir")
        }
    }while (guess!=randomNum)
}

fun task38(){
    var sum = 0
    var random: Int
    while (sum<=50){
        random = Random.nextInt(1,11)
        print("$random ")
        sum+=random
    }
    println("Sum: $sum")
}

fun task39(){
    val number = 8
    var i = 1
    var sum = 0
    while (i<=number){
        val square = i*i
        sum += square
        println(square)
        i++
    }
    println("Sum: $sum")
}

fun task40(){
    val number = 258
    var check = true
    for (i in number.toString()){
        if (i.digitToInt()%2!=0){
            check = false
        }
    }

    if (check){
        println("$number butun ededleri cutdur")
    }else{
        println("$number butun edeleri cut deyil")
    }
}

fun task42(){
    val num1 = readln().toInt() //18
    val num2 = readln().toInt() //12
    val loop = if(num1 > num2) num2 else num1

    for (i in loop downTo 1){
        if(num1%i==0 && num2%i == 0){
            println(i)
            break
        }
    }
}










