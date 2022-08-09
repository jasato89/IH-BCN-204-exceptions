public class TextTooLongException extends RuntimeException{
    private String message;

    TextTooLongException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
