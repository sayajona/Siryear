//using while loop print the numbers between 1 to 20 ignoring those divisible by 3
fun main(){
    var num =1
    while (num <20) {
        if (num % 3 == 0) {
            num++
            continue
        }
        println("$num is not divisible by 3")
        num++
    }
}
