class MiniDuckSimulator {

  public static void main(String args[]) {

    Duck rhd = new RedheadDuck();
    rhd.display();
    rhd.quack();
    rhd.swim();

    Duck md = new MallardDuck();
    md.display();
    md.quack();
    md.swim();

    Duck dd = new DecoyDuck();
    dd.display();
    dd.quack();
    dd.swim();

    Duck rd = new RubberDuck();
    rd.display();
    rd.quack();
    rd.swim();

    Duck cd = new CanvasbackDuck();
    cd.display();
    cd.quack();
    cd.swim();
  }
}
