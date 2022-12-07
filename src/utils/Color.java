package utils;

public enum Color {
    RED("Красный"),
    YELLOW("Жёлтый"),
    GREEN("Зелёный"),
    BLUE("Голубой"),
    WHITE("Белый"),
    GREY("Серый"),
    BLACK("Чёрный"),
    PURPLE("Сиреневый"),
    BROWN("Коричневый");
    private String word;
    Color(String word){
        this.word = word;
    }


    @Override
    public String toString() {
        return word;
    }
}
