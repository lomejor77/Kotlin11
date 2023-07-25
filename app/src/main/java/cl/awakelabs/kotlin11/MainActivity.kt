package cl.awakelabs.kotlin11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/*fun main(){
    var num1 = 10
    var num2 = 33
    var num3 = 66


    var resultado = num1 + num2 + num3
    println("el promedio es : $resultado")

    num1 = 55

    resultado = num1 + num2 + num3

    println(resultado)

    val promedio = resultado / 3

    println("el promedio es: $promedio")
}*/


fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("nombre: $name")
        println("edad: $age")
        println("hobby: $hobby")
        if(referrer==null) {
            println("no tiene referido")
        }else{

            println("referido: ${referrer.name}")
        }

    }
}