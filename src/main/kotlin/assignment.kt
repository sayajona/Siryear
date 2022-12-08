import java.util.Scanner

//Create a program that calculates the BMI value and places the person under its obesity class.
fun main(){
    val scanner=Scanner(System.`in`)
    print("Enter Height in M: ")
    var height =scanner.nextFloat()
    print("Enter Weight in M: ")
    var weight =scanner.nextInt()
    var BMI =weight / (height * height)
    //if statements

    println("Your BMI is: $BMI")
    if (BMI <18.5){
        println("You are Underweight")
    }
    else if (BMI >=18.5 && BMI <=22.9){
        println("You are Normal")
    }
    else if (BMI >=23 && BMI <=24.9){
        println("You are Overweight")
    }
    else if (BMI >=25 && BMI <=29.9){
        println("You are Pre-Obese")
    }
    else if (BMI >=30.0 && BMI <=34.9){
        println("You are Obese Class I")
    }
    else if (BMI >=35 && BMI <=39.9){
        println("You are Obese Class II")
    }
    else if (BMI >=40.0){
        println("You are Obese Class III")
    }

}