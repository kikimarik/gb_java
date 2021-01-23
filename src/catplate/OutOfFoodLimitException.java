package catplate;

public class OutOfFoodLimitException extends Throwable {
    private String message;
    public OutOfFoodLimitException(String s) {
        this.message = s;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
