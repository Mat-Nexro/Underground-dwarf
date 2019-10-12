package world.blocks;

import graphics.Screen;
import graphics.Sprite;
import graphics.Spritesheet;
import world.Block;

public class BrokenDirt extends Block{

	public static final Sprite texture = new Sprite(128,0,32,Spritesheet.def1);
	
	public BrokenDirt() {
		id = 2;
		colider = false;
		ladder = false;
	}
	
	public void render(Screen s, int x, int y) {
		s.renderSprite(x*32,y*32,texture);
	}
}
