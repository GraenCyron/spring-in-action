package com.mosbius;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mosbius.beans.Knight;
import com.mosbius.config.KnightConfig;

public class App  {
    public static void main( String[] args ) {
    	AnnotationConfigApplicationContext context =
    			new AnnotationConfigApplicationContext(KnightConfig.class);
    	
    	Knight knight = context.getBean(Knight.class);
    	
    	knight.embarkOnQuest();
    	context.close();
    }
}
