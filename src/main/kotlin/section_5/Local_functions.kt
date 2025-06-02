package section_5

fun main() {
    start()
}

fun start() {
    val builder = StringBuilder()
    fun log(message: String) = builder.appendLine(message)
    log(message = "Status..OK")
    log(message = "Wings..OK")
    log(message = "Engine starting...")
    println(builder)
}