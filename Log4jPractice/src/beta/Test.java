package beta;

import org.apache.logging.log4j.*;
public class Test 
{
	
	private static Logger log=LogManager.getLogger(Test.class.getName());
	public static void main(String[] args) 
	{
		
		log.debug("I am debugging");
		
			log.info("Object is present");
			
			log.error("Object is not present");
			
			log.fatal("This is fatal");
		
		
		
	}
}
