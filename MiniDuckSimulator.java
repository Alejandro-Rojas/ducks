class MiniDuckSimulator {

  public static void main(String args[]) {

    Duck rhd = new RedheadDuck();
    rhd.display();
    rhd.performQuack();
    rhd.swim();

    Duck md = new MallardDuck();
    md.display();
    md.performQuack();
    md.swim();

    Duck dd = new DecoyDuck();
    dd.display();
    dd.performQuack();
    dd.swim();

    Duck rd = new RubberDuck();
    rd.display();
    rd.performQuack();
    rd.swim();

    Duck cd = new CanvasbackDuck();
    cd.display();
    cd.performQuack();
    cd.swim();
  }
}
