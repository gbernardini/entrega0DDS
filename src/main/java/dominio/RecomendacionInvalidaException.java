package dominio;

public class RecomendacionInvalidaException extends Exception {

    public RecomendacionInvalidaException(String errorMessage) {
        super(errorMessage);
    }
}
