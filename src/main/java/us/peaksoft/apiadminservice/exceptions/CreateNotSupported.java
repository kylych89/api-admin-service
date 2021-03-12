package us.peaksoft.apiadminservice.exceptions;

/**
 * Created by Sayfullah on 12.03.2021.
 */
public class CreateNotSupported extends RuntimeException{
    public CreateNotSupported(String message) {
        super(message);
    }
}
