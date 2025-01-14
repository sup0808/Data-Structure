fun main() {
   println("Sum of digits ${sumOfDigits(2345)}")
}

fun sumOfDigits(n: Int): Int {
        return if (n == 0) {
            return 0
        } else {
            n % 10 + sumOfDigits(n / 10)
        }
    }

