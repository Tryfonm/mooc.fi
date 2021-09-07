
public class HealthStation {

    private int countOfWeighs;

    public HealthStation() {
        this.countOfWeighs = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.countOfWeighs++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return this.countOfWeighs;
    }
}
