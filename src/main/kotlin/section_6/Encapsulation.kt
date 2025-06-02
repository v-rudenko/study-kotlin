package section_6


fun main() {
    val myLock = EncryptionLock(40)

    println(myLock.unlock(72))
}

class EncryptionLock(private val privateKey: Int) {

    public fun unlock(publicKey: Int): Boolean {
        return formula(publicKey) == privateKey
    }

    private fun formula(publicKey: Int): Int {
        return publicKey / 2 + 5
    }
}

