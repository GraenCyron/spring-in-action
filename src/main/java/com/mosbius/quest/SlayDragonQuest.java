package com.mosbius.quest;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {
	private PrintStream stream;
	
	public SlayDragonQuest(PrintStream stream) {
		this.stream = stream;
	}
	public void embark() {
		stream.println("Go to the castle and slay the dragon");
	}
}