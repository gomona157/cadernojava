class Carro{
  var marca = ""
  var modelo = " "
  var ano = 0
}
class Car(var marca: String, var modelo: String, var ano: Int){
  

//metodo da classe
  fun ligar(){
    println("Wrooom!")
  }
}
//funçao principal
fun main() {
  //criar uma instancia de carro
  var corola=Carro()

  //atribui valores
  corola.marca="Toyota"
  corola.modelo="Corola"
  corola.ano=2023

  //Imprimir atributos
  println(corola.marca)
  println(corola.modelo)
  println(corola.ano)

  //instanciar passando os parametros
  val c1 = Car("Ford", "Mustang", 1969)
  println (c1.marca)
  println (c1.modelo)
  println (c1.ano)
  //instanciar outro carro
  val fusca=Car("Fusca", "Vw", 1975)
  println(fusca.modelo)
  c1.ligar()
  fusca.ligar()
}