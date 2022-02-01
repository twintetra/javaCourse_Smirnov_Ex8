public enum Season {
    WINTER("Белый"),
    SPRING("Красный"),
    SUMMER("Зеленый"),
    AUTUMN("Желтый");

    private final String color;
    Season(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

}
