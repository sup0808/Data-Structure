fun main() {
   println("Sum of digits ${sumOfDigits(2345)}")
}

fun sumOfDigits(number : Int) : Int{
    var n = number
    var sum = 0
    
    while(n>0)
    {
        sum = sum + n%10
        n = n/10
    }
    return sum
}
