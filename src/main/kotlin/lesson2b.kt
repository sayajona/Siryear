//while loop
//the statement sin the while loop will be executed as long as the condition is true
fun main(){
    var month =2
    while (month <10){
        println("month is $month so we don't expect rains")
        month ++
    }
    while (month in 11 .. 12 && month in 1..3){
        println("month is $month so we expect rains")
        month ++
    }
    var month2 =6
    while (month2 in 5..12){
        if (month2 == 10){
            println("The month is $month2 so we exit loop")
            break

        }
        println("month is $month2 so we expect rains")
        month2 ++
        //use break in while
    }
}