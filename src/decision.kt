fun main() {
    numbers()
    names()
    drink()
    robot()



}
fun numbers(){
    for(num in 1..100)
        if (num%2==1)
            println(num)


}
fun names(){
    var fruits= arrayOf("orange","Apple","mango","pineapple","banana","kiwi")
    for (fruit in fruits){
        if (fruit.length>5){
            println(fruit)
        }


    }
}
fun drink(){
    val age=0
    if (age<6){
        println("milk")
    }
    else if (age<=15){
        println("fanta orange")
    }
    else{
        println("coca cola")
    }
}
fun robot() {
    for (x in 1..100) {
        println(x)
        for (x in 1..100) {
            if (x % 3 == 0) {
                println("fizz")

            }
        }
        for (Fizz in 1..100) {
            if (x % 5 == 0) {
            }

        }
        for (x in 1..100) {
            if (x % 3 == 0 && x % 5 == 0) {
                println("fizzBuzz")
            }
        }

    }
}
