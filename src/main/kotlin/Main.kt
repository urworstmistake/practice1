import kotlin.math.*
fun main(args: Array<String>) {
    //Task1
    val exercises = 13
    var exercisesSolved : Int = 0
    exercisesSolved++
    /*Объявлена константа и переменная, переменную увеличиваем*/
    //Task2
    val age: Int = 18
    exercisesSolved++
    /*Константа названа age так, потому что возраст*/
    //Task3
    var averageAge: Double = 18.0
    averageAge = (averageAge + 30) / 2
    exercisesSolved++
    /*Объявлена переменная типа Double, названа averageAge*/
    //Task4
    val testNumber: Int = 37
    val evenOdd : Int = testNumber % 2
    exercisesSolved++
    /*Созданы константы testNumber и evenOdd типа int, testNumber присвоено какое-то значение, evenOdd присвоен остаток от деления  на 2 testNumber
    *   /*В задаче вопрос, что будет с evenOdd, если изменить testNumber, оно так же выведет остаток от деления на 2 этой константы*/
    */
    //Task5
    var answer: Int = 0
    answer += 1
    answer += 10
    answer shr 3
    println(answer)
    exercisesSolved++
    /*Созданна переменная типа int, со значением 0. Далее проводятся различного рода манипуляции с этой переменной*/
    //Task6
    var age2 = 16
    print(age2)
    age2 = 30
    print(age2)
    exercisesSolved++
    /*В задании спрашивалось какое ключевое слово нужно использовать, val или var. В данном случае var, т.к нам нужна переменная, а не константа*/
    //Task7
    /*
        /*val a: Int = 46
        val b: Int = 10
        val answer1: Int = (a * 100) + b // 4610
        val answer2: Int = (a * 100) + (b * 100) // 5600
        val answer3: Int = (a * 100) + (b / 10) // 4601*/
    */
    exercisesSolved++
    //Task8
    (5*3) - ((4/2)*2)
    exercisesSolved++
    /*Скобки расставлены так, чтобы не изменить порядок вычислений*/
    //Task9
    val a : Double = 60.0
    val b : Double = 484.5
    val average : Double = (a + b) / 2
    exercisesSolved++
    /*Созданы 3 константы типа double, a и b присвоенны числа, average присвоено среднее арефметическое констант a и b*/
    //Task10
    val fahrenheit : Double = 57.2
    val celcius : Double = (fahrenheit - 32) / 1.8
    exercisesSolved++
    /*Объявлены 2 константы типа double, fahrenheit присвоено какое-то значение, celcius присвоена формула преобразования температуры fahrenheit в температуру цельсия*/
    //Task11
    val position : Int = 10
    val row : Int = position / 8
    val column : Int = position % 8
    exercisesSolved++
    /*
    Объявлены 3 константы position, row, column типа int, нужно по значению position определить, строку и столбец на клетки на шахматной доске.

    */
    //Task12
    val degrees : Double = 68.0
    val radians : Double = degrees * PI / 180
    exercisesSolved++
    /*Объявлено 2 константы, degrees и radians типа double, degrees присвоено начальное значение, radians присвоено формула преобразования degrees в радианы*/
    //Task13
    val x1 : Double = 30.0
    val y1 : Double = 68.0
    val x2 : Double = 300.0
    val y2 : Double = 85.0

    val distance : Double = sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))
    /*Объявляем 5 констант, x1,y1,x2,y2,distance типа double, x1,y1,x2,y2 присваиваются значения.
    * Нужно найти расстояние между двумя точками, его мы находим по формуле расстояния между двумя точками на плоскости*/
    exercisesSolved++
    //Вывод чтобы ошибку на последнем икрименте не выдавал
    println()
    println(exercisesSolved)
}
