fun main() {
    //ввод кол-ва строк и кол-ва столбцов
    print("Введите кол-во строк: ")
    val stroki = readln().toInt()
    print("Введите кол-во столбов: ")
    val stolb = readln().toInt()

    val r_stroki = 0
    val r_stolb = 0
    val arrNum: Array<Array<Int>> = Array( size =  stroki * stolb)
    for(i in 0..(stroki * stolb - 1)){
        Array (size = stroki) {
            print("Введите элемент [$r_stroki][$r_stolb]: ")
            readln().toInt()
        }

    }
    //произвести подсчет уникальных цифр
    //вывести массив
    for (i in 0..stroki) {
        for (j in 0..stolb){
            print(arrNum[i][j].toString() + "/t")
        }
        println()
    }
    //вывести кол-ва уник. цифр


}