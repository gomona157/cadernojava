class Main {
  //cria um metodo(sem parametro)
  static void impPrime(){
    System.out.println("Só imprime isso");
  }
  
  //aqui cria um método passando parametro
  static void meuMetodo(String nome) {
    System.out.println("O nome é: "+ nome);
  }

  //aqui cria um método passando parametro
  static void nomeEidade(String nome,int ano) {
    System.out.println(nome + " tem "+ano + " anos");
  }

  //crie um metodo chamado exib que exibe uma String na tela

  //classe principal do java
  public static void main (String[] args){
    //chama metodo impPrime()
    impPrime();

    //chama metodo meuMetodo()
    meuMetodo("Julia");
    meuMetodo("Carlos");
    meuMetodo("Cibele");

    //metodo com dois parametros
    nomeEidade("Julia", 17);
    nomeEidade("Carlos", 15);
    nomeEidade("Cibele", 34);
   
  }
  
}