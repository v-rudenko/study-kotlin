package section_5

fun main() {
//    DatabaseAccess.connect()

    if(DatabaseAccess.connected) {
        DatabaseAccess.disconnect()
    } else {
        DatabaseAccess.connect()
    }
    println(if (DatabaseAccess.connected) "Database is connected" else "Database is disconnected")
}

object DatabaseAccess {
    var connected = false
    fun connect () {
        connected = true
        println("Connected to database")
    }
    fun disconnect () {
        connected = false
        println("Disconnected from database")
    }
}