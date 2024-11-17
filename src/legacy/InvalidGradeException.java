package legacy;

public class InvalidGradeException extends IllegalArgumentException{
    public InvalidGradeException(int grade) {
        super(String.format("Добавление оценки %d невозможно",grade));
    }
}
