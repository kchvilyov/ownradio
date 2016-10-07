package kz.tanat.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * There can be handled all thrown thru all controllers exceptions
 *
 * Created by Konstantin on 06.10.2016.
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Exception")
    @ExceptionHandler(Throwable.class)
    public void handleException(Throwable e) {
        log.error("Exception: " + e);
    }
}
