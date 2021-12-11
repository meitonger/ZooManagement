public class Tiger extends Animals {

    public Tiger() {

    }

    @Override
    public void information() {
        System.out.println("Animals information " + this.getName() + this.getColor() + this.getAge());
    }

}
