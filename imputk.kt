fun main(args: Array<String>) {
  // 1 - Faça um programa em kotlin que solicite dois números inteiros do usuário, o programa faz a soma desses números e exibe a resposta

  println("Qual seu nome?")
  var texto = readLine()!!
  println("Seja Bem Vindo " + texto)
  
  println("Digite um número: ")
  var num1 = readLine()!!
    var x = num1.toInt()
  println("O número é: " +num1)
  println("Digite outro número: ")
  var num2 = readLine()!!
  var y = num2.toInt()
  println("O número é: " +num2)
  var soma = x+y
  println("O resultado é: " +soma)
  //agora inclua as funcionalidades de subtração multiplicação e divisão
  
  println("Digite um número: ")
  var nume1 = readLine()!!
    var a = nume1.toInt()
    println("O número é: " +nume1)
  println("Digite outro número: ")
  var nume2 = readLine()!!
  var b = nume2.toInt()
  println("O número é: " +nume2)
  var subtração = a-b
  println("O resultado é: " +subtração)

  println("Digite um número: ")
  var numer1 = readLine()!!
    var c = numer1.toInt()
    println("O número é: " +numer1)
  println("Digite outro número: ")
  var numer2 = readLine()!!
    var d = numer2.toInt()
  println("O número é: " +numer2)
  var multiplicação = c*d
  println("O resultado é: " +multiplicação)

  println("Digite um número: ")
  var numero1 = readLine()!!
    var e = numero1.toInt()
    println("O número é: " +numero1)
  println("Digite outro número: ")
  var numero2 = readLine()!!
  var f = numero2.toInt()
  println("O número é: " +numero2)
  var divisão = e/f
  println("O resultado é: " +divisão)
}