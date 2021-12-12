import java.time.MonthDay

fun main() {
    for_primer()
}

fun If2() {
    print(
        "If2. Дано целое число. Если оно является положительным, то прибавить к\n" +
                "нему 1; в противном случае вычесть из него 2. Вывести полученное число.\n"
    )


    print("Введите число: ")
    var num_int = readLine()!!.toInt()
    if (num_int > 0) {
        num_int = num_int + 1
        println("Положительное!")
    } else {
        num_int = num_int - 2
        println("Не положительное!")
    }

    print("\nНаше число: $num_int")


}


fun Case4() {
    print(
        "Case4.Дан номер месяца — целое число в диапазоне 1–12\n" +
                "(1 — январь, 2 — февраль и т.д.).\n" +
                " Определить количество дней в этом месяце для невисокосного года.)\n"
    )
    while (true) {
        print("\n Введите номер месяца :  ")
        var Month = readLine()!!.toInt()
        when (Month) {
            1 -> print("Январь")
            2 -> print("декабрь")
            3 -> print("февраль")
            4 -> print("март")
            5 -> print("Апрель")
            6 -> print("май")
            7 -> print("июнь")
            8 -> print("июль")
            9 -> print("август")
            10 -> print("сентябрь")
            11 -> print("октябарь")
            12 -> print("ноябрь")
        }
    }
}

fun for_primer()
{
    print("for_primer.\n" +
            "дана строка string и целое  число  number_of_times (N > O  )\" +
            "Введите   number_of_ times  " +
    )
   print("введите число":)
 var number = readLine()!!.toInt()
print("Введите количество" )
var number_of_times = readLine()!!.toint()

 for (i in 1..number){
   print("($i)")
   println(number)



 }





}





