package huijingyuan.community.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdivice {
	@ExceptionHandler({Exception.class})
	public void arimeticException(Exception e) {
	
	}
}
