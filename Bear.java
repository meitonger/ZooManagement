public class Bear extends Animals {

    public Bear() {
    }

    @Override
    public void information() {
        System.out.println("Animals information " + this.getName() + this.getColor() + this.getAge());
    }
}
