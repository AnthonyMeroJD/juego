import java.lang.StringBuilder
import java.util.*
class recompenza(tipo:item)
class item(nombre: String,valor:Int)
fun creaMenu(opciones:Array<String>){
    val menu:StringBuilder=StringBuilder()
    for (opciones in )
}
fun pintaTablero(x:Int,y:Int):Unit{

    val tabla= arrayOf(x*2,y)
    val campo= StringBuilder()
    for (j in 0..y+1){
        if (j in 1..4) {
            campo.append("-A ${j}-")
            print("-A ${j}-")
        }else{
            campo.append(" A---")
            print(" A---")
        }
        for (i in 0..x*4){
            if (j==0 || j==y+1) {
                campo.append("*")
                print("*")
            }else{
                if (i%2==0 ){
                    campo.append("|")
                    print("|")
                }else{
                    campo.append("a")

                }
            }
            if (i==x*4){
                campo.append("\n")
            }
        }
    }
    print(campo)
}
fun main( args: Array<String>){

    pintaTablero(2,4)

}

