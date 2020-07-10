package HomeWork5.color;

public class Color {
    private int colorNumber;

    /**
     * 1.2 Константы цветов
     */
    private final int RED = 1;
    private final int ORANGE = 2;
    private final int YELLOW = 3;
    private final int GREEN = 4;
    private final int LIGHTBLUE = 5;
    private final int BLUE = 6;
    private final int PURPLE = 7;

    /**
     * 1.1 Конструктор для передачи номера цвета
     * @param colorNumber
     */
    public Color (int colorNumber) {
        this.colorNumber = colorNumber;
    }

    /**
     * 1.3 Методы getNumber - возвращает номер цвета, getName - название цвета.
     * @return
     */
    public int getNumber() {
        return colorNumber;
    }

    public String getName() {
        switch (colorNumber) {
            case RED:
                return "Красный";
            case ORANGE:
                return "Оранжевый";
            case YELLOW:
                return "Жёлтый";
            case GREEN:
                return "Зелёный";
            case LIGHTBLUE:
                return "Голубой";
            case BLUE:
                return "Синий";
            case PURPLE:
                return "Фиолетовый";
            default:
                return "Неизвестно";
        }
    }
}
