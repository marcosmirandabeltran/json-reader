package ie.marcosmiranda.demo.pbowes.jsonreader.controller;


import ie.marcosmiranda.demo.pbowes.jsonreader.bean.ErrorFile;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
@ControllerAdvice
class GlobalControllerExceptionHandler {

    @ExceptionHandler(value = IOException.class)
    public ErrorFile
    defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        return new ErrorFile();
    }
}
