fun main() {
    print("Введите первое число: ")
    val chast01 = readln()
    print("Введите второе число: ")
    val chast02 = readln()

    val chetNechet = false

    val chast01All = chast01 + chast02
    if (chast01All.toInt() % 2 == 1){
        println("Вывод нечетного числа - $chast01All")
        val chetNechet = true
    }
    val chast02All = chast02 + chast01
    if (chast02All.toInt() % 2 == 1){
        println("Вывод нечетного числа - $chast02All")
        val chetNechet = true
    }

    if(!chetNechet) {
        println("Вывести нечетное число невозможно")
    }
}