import java.util.Random
import java.util.Scanner
fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    val random: Random = Random() //random class generates random numbers
    var isGameOn = true
    var d1 = random.nextInt(6) + 1//bound 6 means 0-5
    var d2 = random.nextInt(6) + 1
    var sum = d1 + d2
    var target = 0
    println("$d1 $d2 -> ${d1 + d2}")

    if(sum == 7 || sum == 11){
        println("You win!")
        isGameOn = false
    }
    else if(sum == 2 || sum == 3 || sum == 12){
        println("You loose!")
        isGameOn = false
    }
    else{
        target = sum
        while(isGameOn){
            print("Hit Enter to roll again:")
            val readEnter = scanner.nextLine()
            if(readEnter.isEmpty()){
                d1 = random.nextInt(6) + 1//bound 6 means 0-5
                d2 = random.nextInt(6) + 1
                sum = d1 + d2
                println("$d1 $d2 -> ${d1 + d2}")
                if(sum == target){
                    println("You Win!")
                    isGameOn = false
                }
                else if(sum == 7){
                    println("You loose!")
                    isGameOn = false
                }
            }
        }
    }
}