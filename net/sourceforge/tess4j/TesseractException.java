package net.sourceforge.tess4j;

public class TesseractException extends Exception {

    public TesseractException() {
        super();
    }

    public TesseractException(String message) {
        super(message);
    }

    public TesseractException(Throwable cause) {
        super(cause);
    }

    public TesseractException(String message, Throwable cause) {
        super(message, cause);
    }
}
