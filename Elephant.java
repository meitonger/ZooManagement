public class Elephant extends Animals {

    public Elephant() {

    }

    @Override
    public void information() {
        System.out.println("Animals information " + this.getName() + this.getColor() + this.getAge());

    }
}
