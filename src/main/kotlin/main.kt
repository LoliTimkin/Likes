import kotlin.concurrent.thread

fun main() {
    print("Введите количество лайков: ")
    var Likes = readLine()?.toInt()
    if (Likes != null) {
        if (Likes % 10 == 1) {
            println("Нравится $Likes человеку")
        } else println("Нравится $Likes людям")
    }
}