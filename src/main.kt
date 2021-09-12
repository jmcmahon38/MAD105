fun main(){
    val myName = "Justin"
    val myCity = "Cary"
    val myState = "IL"
    val favoriteThings = arrayOf("Raindrops on roses", "Whiskers on kittens", "Bright copper kettles", "Warm woolen mittens")
    println("\n" +
            "Name: $myName, City: $myCity, State: $myState \n" +
            "\nFavorite things:")
    for (i in favoriteThings.indices) {
        println(favoriteThings[i])

    }
}