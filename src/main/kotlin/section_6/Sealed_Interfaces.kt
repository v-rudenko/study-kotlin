package section_6

fun main() {

}
sealed interface NetworkStatus

data object Available: NetworkStatus
data object Unavailable: NetworkStatus
data object Limited: NetworkStatus
data object Unknown: NetworkStatus

class NetworkCheck {
    private lateinit var status: NetworkStatus
    fun isAvailable(): Boolean {
        return when(status) {
            Available -> true
            Limited -> false
            Unavailable -> false
            Unknown -> false
        }
    }
}