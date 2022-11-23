package utils;

public enum Color {
    RED,
    YELLOW,
    GREEN,
    BLUE,
    WHITE,
    GREY,
    BLACK,
    PURPLE,
    BROWN;


    @Override
    public String toString() {
        return switch (this) {
            case RED -> "Красный";
            case YELLOW -> "Жёлтый";
            case GREEN -> "Зелёный";
            case BLUE -> "Голубой";
            case WHITE -> "Белый";
            case GREY -> "Серый";
            case BLACK -> "Чёрный";
            case PURPLE -> "Сиреневый";
            case BROWN -> "Коричневый";
        };
    }
}
