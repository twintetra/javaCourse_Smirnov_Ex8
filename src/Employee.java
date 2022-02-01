public class Employee extends Person implements Printable, ClickHandler {

    String position;

    Employee(String name, int age, String position) {
        super(name,age);
        this.position = position;
    }

    @Override
    public void season() {
        for (Season season: Season.values()) {
            System.out.println("Сейчас " + season.name() + ", а цвет " + season.getColor());
        }
    }

    @Override
    public void print() {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Должность: " + position);
    }
}
