import kotlin.concurrent.thread

fun main() {
    print("Введите количество лайков: ")
    val likes = readLine()?.toInt()
    if (likes != null) {
        if (likes % 100 == 11 ) {
            println("Нравится $likes людям")
        } else if (likes % 10 == 1) println("Нравится $likes человеку")
        else println("Нравится $likes людям")
    }
}
