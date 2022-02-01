public class Client extends Person implements Printable,ClickHandler {

    String company;

    Client(String name, int age, String company) {
        super(name,age);
        this.company = company;
    }

    @Override
    public void season() {
        for (Season season: Season.values()) {
            System.out.println("Сейчас " + season.name() + ", а цвет " + season.getColor());
        }
    }

    @Override
    public void print() {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Компания: " + company);
    }
}
