//do while
//for
//iterating through anything that can provide an iterator
//e.g listof, arrayof, range
fun main(){
    var names = listOf<String>("Jonathan", "Modcom", "Errol")
    for( items in names){
        println(items)
    }
    var array= arrayOf(5637, 3535,3,534,342,3,23133,13)
    for (numbers in array){
        if (numbers==534){
            continue
        }
        println(numbers)
    }
    for (num in 1..20){
        println(num)
    }
    for (letter in "letters"){
        println(letter)
    }
}