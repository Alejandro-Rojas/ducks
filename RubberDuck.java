class RubberDuck extends Duck {

  public RubberDuck() {
    quackBehavior = new Quack();
  }

  public void display() {
    System.out.println("Rubber duck displayed");
  }

}
