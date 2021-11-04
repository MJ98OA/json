fun main(){

    var p1=Personaje("Paquito",1)

    println(p1)
    println(p1.toJson())

    val json1="{\"nombre\":\"Marjar\",\"edad\":2}"
   // val p2=p1.fromJson(json1) sin el companion
    val p3=Personaje.fromJson(json1)

    println(p3)
}