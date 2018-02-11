package com.mosbius.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mosbius.beans.*;
import com.mosbius.quest.*;

@Configuration
public class KnightConfig {
	
	@Bean
	public Knight knight() {
		return new BraveKnight(quest());
	}
	
	@Bean
	public Quest quest() {
		return new SlayDragonQuest(System.out);
	}
	
	@Bean
	public Minstrel minstrel() {
		return new Minstrel(System.out);
	}
	
}