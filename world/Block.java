package world;

import graphics.Screen;
import world.blocks.*;

public class Block {

	public int id;
	public boolean colider, ladder;
	
	public static Block getBlock(int id) {
		if(id==1)return new Dirt();
		if(id==2)return new BrokenDirt();
		return new Air();
	}
	
	public void update() {}
	
	public void render(Screen s,int x,int y) {}
}
