package springmvc01.control.ex7;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class MyControllerAdvice {
  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

  @InitBinder
  public void initBinder(WebDataBinder binder) {
    System.out.println("MyControllerAdvice.initBinder()....");
    dateFormat.setLenient(false);
    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
  }
  
}




