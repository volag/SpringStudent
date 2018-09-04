package com.lc.evaluation.control;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;

@Controller      
public class NotFoundController {      
	
	public NotFoundController() {
//		System.out.println("NotFoundController");
	}
	
	@RequestMapping("util/notFound")
	public String notFound(){
		return "util/notFound";
	}

   /**    
     * 用于处理异常的
     * @return    
     */      
   /* @ExceptionHandler(NoSuchRequestHandlingMethodException.class)       
    public String notFound() {       
        return "util/notFound";       
    }*/
    
   /* @ExceptionHandler(value = NullPointerException.class)
    public String handleNullPointerException(Exception e) {

        System.out.println("A null pointer exception ocurred " + e);

        return "nullpointerExceptionPage";
    }


    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = Exception.class)
    public String handleAllException(Exception e) {

        System.out.println("A unknow Exception Ocurred: " + e);

        return "util/notFound";
    }*/

/*
    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleResourceNotFoundException() {

        return "notFoundJSPPage";
    }
*/
}