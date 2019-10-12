package world.blocks;

import graphics.Screen;
import graphics.Sprite;
import graphics.Spritesheet;
import world.Block;

public class Dirt extends Block{

	public static final Sprite texture = new Sprite(0,0,32,Spritesheet.def1);
	
	public Dirt() {
		id = 1;
		colider = true;
		ladder = false;
	}
	
	public void render(Screen s, int x, int y) {
		s.renderSprite(x*32,y*32,texture);
	}
}
