package in.laxmi.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MessageController {
	private Logger logger = LoggerFactory.getLogger(MessageController.class);
	@GetMapping("/welcome")
public String welComeMsg() {
		logger.debug("debug msg  execution started");
		logger.info("welcome execution started");
	  String msg= "welcome";
	  try {
		  int n = 10/0;
	  }catch(Exception e) {
		  logger.error("exception occured"+e);
	  }
		logger.warn(" warning message");
	logger.info("welcome execution exnded");
   return msg;
}
	@GetMapping("/greet")
public String greet() {
		logger.debug("greet execution started");
	String msg =  "good Evening";
	String s=null;
	s.length();
	logger.info("greet execution ended");
	return msg;
}
}
