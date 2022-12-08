// conditional statements
//when
//check whether a number is less/great or equal to another number
fun main(){
    val age=20
    when{
        age <10 -> { println("$age is less than 10") }
        age == 10 -> { println("$age is equal to 10") }
        age > 10 -> { println("$age is greater than 10") }
    }
    //range
    val marks =90
    when (marks){
        in 0 .. 50 -> println("Marks is $marks. you fail")
        in 51 .. 60 -> println("Marks is $marks. Grade C")
        in 61 .. 70 -> println("Marks is $marks. Grade B")
        in 71 .. 100 -> println("Marks is $marks. Grade A")
    }
    //read objects from variables
    val fruit="Banana"
    when {
        (fruit == "Banana") -> println("I love Banana")
        (fruit == "Melon") -> println("Melon is my favourite fruuit")
    }
    //use when to print what the object represents
    //sun is a star
    //moon is a satelite
    //earth is a planet
    print("Enter the name of the object: ")
    val object1 = readln()
    when (object1){
        "sun", "alpha", "Beta", "Gamma", "Delta", "Epsilon Cassiopeiae" -> println(object1 + "is a star")
        "moon", "Ganymede", "Callisto", "Io", "Europa" -> println(object1 + "is a satelite")
        "earth", "pluto", "mars", "jupiter", "venus" -> println(object1 + "is a planet")
    }
}
