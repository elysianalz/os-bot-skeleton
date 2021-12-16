package core;

import java.awt.Graphics2D;

import org.osbot.rs07.script.Script;
import org.osbot.rs07.script.ScriptManifest;


@ScriptManifest(author = "beeryboy", info = "chops trees duh", name = "SimpleCut", version = 0, logo = "")
public class Main extends Script {
	
	
	
	@Override
	public void onStart() {
		
	}

	public int onLoop() throws InterruptedException {
		
		
		
		return random(200, 300);
	}

	@Override
	public void onExit() {
		log("exiting");
	}

	@Override
	public void onPaint(Graphics2D g) {
		
	}
	
	
	
}