fun main() {
   reverse()
}

fun reverse() {
        var n = 456
        var rev = 0

        while (n > 0) {

            rev *= 10
            rev = rev + n % 10
            n = n / 10
        }
        println("reverse-- $rev")
    }
