package com.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Config {
	
		static Logger log = Logger.getLogger(Basic_Config.class);
		
		public static void main(String[] args) {
			
			BasicConfigurator.configure();
			log.debug("test debug");
			log.info("Test Information");
			log.warn("Test Warning");
			log.error("Test Error");
			log.fatal("test Fatal");
			
		}
		


}
