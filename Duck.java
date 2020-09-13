public abstract class Duck {

  QuackBehavior quackBehavior;

  public abstract void display();

  public void swim() {
    System.out.println("Duck swimming (since all ducks float)");
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void setQuackBehavior(QuackBehavior qb) {
    quackBehavior = qb;
  }
}
