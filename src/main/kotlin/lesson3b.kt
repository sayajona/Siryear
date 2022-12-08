//kotlin functions
//function -block of code that performs a specific task
//in kotlin , functions are crated using the keyword fun
//syntax
//fun name_of_function(){body of tghe function}
//user_defined functions must be called inside the main function
fun main(){
    multiply( num1 = 12, num2 = 23)
    add(number1 = 20, number2 = 60)
    divide(number1 = 20, number2 = 5)
    student_details("Jonathan", "Saya", "sayajonathan82@gmail.com", "Male")
    maths()
    details()
}
fun multiply(num1:Int,num2:Int){
    var answer=num1*num2
    println(answer)
}
fun add(number1:Int, number2:Int): Int {
    var answer=number1+number2
    println(answer)
    return answer
}
//create a function to divide two numbers
fun divide(number1:Int, number2:Int): Int {
   var answer=number1/number2
   println(answer)
   return answer
}
fun student_details(fname:String,lname:String,email:String,gender:String):String{
    var answer = "My name is $fname and my family name is $lname. My email address is $email " +
            "and I am of $gender gender"
    println(answer)
    return answer
}
//compare two integers
fun compare(int1:Int,int2:Int):Int{
    var compare =int1.compareTo(int2)
    println(compare)
    return compare
}
fun maths(){
    //check if two numbers are the same and execute some statement
    if (compare( int1 = 12, int2 = 12) ==0){
        println("The two numbers are equal")
    }
    else{
        println("The two numbers are not equal")
    }
}
fun compare_string(name1:String,name2:String): Int {
    var answer=name1.compareTo(name2)
    println(answer)
    return answer
}
fun details(){
    //check if two names are the same and execute some statement
    if(compare_string( name1= "Jonathan", name2= "Mike")) ==0){
        println("The two names are the same")
    }
    else{
        println("The two names are not the same")
    }
}