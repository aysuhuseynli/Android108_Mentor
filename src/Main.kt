fun main() {
    //task24()
    //task25()
    task30()
}

fun task24(){
    val number = readln().toInt()
    var factorial = 1
    for (i in 1..number){
        factorial *= i
    }
    println(factorial)
}

fun task25(){
    val text = readln() // salam
    var reversedText = ""

    for (index in text.length-1 downTo 0){
        reversedText += text[index]
    }
    println(reversedText)

}

fun task30(){
    println("Cumle daxil edin: ")
    val sentence = readln() //salam
    print("Hansi herfi evez edek? ")
    val oldLetter = readln()  //a
    print("Hansi herf ile evez edek? ")
    val newLetter = readln()  //e
    var newText = ""

    for(i in sentence){
        if(i.toString() == oldLetter){
            newText+= newLetter
        }else{
            newText+=i
        }
    }
    println(newText)

}