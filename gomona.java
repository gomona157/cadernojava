class Main {
  public static void main(String[] args) {
    System.out.println("Olá Mundo!");
    int myNum = 6;
    float myFloatNum = 4.99f;
    char myLetter = 'P';
    boolean myBool = false;
    String myText = "Só salvinho";
    System.out.println(myNum);
    System.out.println(myFloatNum);
    System.out.println(myLetter);
    System.out.println(myBool);
    System.out.println(myText); 
    // parte dois do código
    System.out.println(myText + myBool);
    int x = 8;
    float y = x;
    System.out.println(x);
    System.out.println(y);
    double myDouble = 5.99d;
    int myInt = (int) myDouble; // Manual casting: double to int
    System.out.println(myDouble);
    System.out.println(myInt);
  }
}