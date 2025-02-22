package com.mycompany.a2.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class PSMissileKillsAsteroidCom extends Command {
	private GameWorld gw;
	
	public PSMissileKillsAsteroidCom(GameWorld gw) {
		super("PS Missile Kills Asteroid");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent ev) {
		System.out.println("PS Missile Kills Asteroid command invoked...");
		gw.psMissileKillsAsteroid();
	}
}
