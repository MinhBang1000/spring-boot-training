package ctu.cit.se.student.training.exceptions;

import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@Builder
record ErrorResponse(LocalDateTime localDateTime, String message, String details) {};
@ControllerAdvice
public class CustomizeResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    /*
    @ExceptionHandler(NullPointerException.class)
    public final ResponseEntity<ErrorResponse> handleNullPointerException(Exception ex, WebRequest request) throws Exception {

    }
    */
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ErrorResponse> handleAllException(Exception ex, WebRequest request) throws Exception{
        return new ResponseEntity<>(
                ErrorResponse.builder()
                        .localDateTime(LocalDateTime.now())
                        .message(ex.getMessage())
                        .details(request.getDescription(false))
                        .build(),
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}
