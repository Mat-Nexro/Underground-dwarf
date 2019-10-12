package game.gamestates;

import java.awt.event.KeyEvent;

import game.GameState;
import graphics.Screen;
import graphics.Sprite;
import graphics.Spritesheet;
import input.Keyboard;
import world.Map;

public class GS_Game extends GameState{

	
	//public static final Sprite ss = new Sprite(0,0,32,Spritesheet.def1);
	//public static final Sprite a = new Sprite(32,0,32,Spritesheet.def1);
	public static Sprite p;
	float x = 0,y = 0;
	float speed = (float) 1.75;
	public Map mapa;
	
	public GS_Game() {
		p = new Sprite(64,0,32,Spritesheet.def1);
		mapa = new Map(16,9);
	}
	
	public void update() {
		if(Keyboard.getKey(KeyEvent.VK_W)) {
			y -= speed;
		}
		
		if(Keyboard.getKey(KeyEvent.VK_S)) {
			y += speed;
		}
		
		if(Keyboard.getKey(KeyEvent.VK_A)) {
			x -= speed;
		}
		
		if(Keyboard.getKey(KeyEvent.VK_D)) {
			x += speed;
		}
	}
	
	public void render(Screen s) {
		//s.clear(0x0000FF);
		
//		for(int i = 0; i<16; i++)
//			for(int j = 0; j<3; j++)
//			s.renderSprite(32*i, 32*j, a);
//		
//		for(int i = 0; i<16; i++)
//			for(int j = 3; j<9; j++)
//			s.renderSprite(32*i, 32*j, ss);
		mapa.render(s);
		s.renderSprite((int)x+32, (int)y+64, this.p);
	}
	
}
