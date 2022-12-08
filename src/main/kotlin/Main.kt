//if statements
fun main(){
    var age=12
    if (age >=18){
        println("You qualify for betting practices")
    }
    else{
        println("Your age is $age so you do not qualify for betting practices")
    }
    //else if
    //check if number is equal to zero, greater than or less than zero
    var num=-8
    if (num == 0){
        println("num $num is equal to zero(0)")
    }
    else if (num <0){
        println("The num $num is negative")
    }
    else{
        println("num $num is greater than zero")
    }
    // #nested if statements
    var age2:Int=32
    var weight =40
    if (age2 >18){
        //check if persons weight is more than 50
        if (weight >=50){
            println("Hello, you qualify to donate blood")
        }
        else{
            println("Sorry you cannot donate blood: Underweight")
        }
    }
    else{
        println("You are underage")
    }
    //condition with two test expressions
    var marks =50
    if (marks <=50){
        println("Failed")
    }
    else if (marks >50 && marks <=70){
        println("Average Performance")
    }
    else if (marks >70 && marks <=90){
        println("Above Average")
    }
    else if (marks >90 && marks <=100){
        println("Brilliant Performance")
    }
}

