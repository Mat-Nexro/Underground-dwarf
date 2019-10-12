package game.gamestates;

import java.awt.event.KeyEvent;
import game.GameState;
import game.GameStateManager;
import graphics.Screen;
import graphics.Sprite;
import graphics.Spritesheet;
import input.Keyboard;

public class GS_Menu extends GameState{

	public static final Sprite s_tlo = new Sprite(0,0,512,288,Spritesheet.tlo1);
	public static final Sprite s_pointer = new Sprite(96,0,32,Spritesheet.def1);
	public static final Sprite s_newGame = new Sprite(0,32,96,32,Spritesheet.def1);
	public static final Sprite s_Cont = new Sprite(0,64,96,32,Spritesheet.def1);
	public static final Sprite s_Set = new Sprite(0,96,96,32,Spritesheet.def1);
	public static final Sprite s_Exit = new Sprite(0,128,32,Spritesheet.def1);
	
	private int choose = 0;
	private float pointerPosition = 0;
	
	public GS_Menu() {
		
	}
	
	public void update() {
		if(Keyboard.getKey(KeyEvent.VK_ENTER)) {
			//GameStateManager.ChangeGameState(GameStateManager.GAME_STATE_GAME);
			if(choose == 0)GameStateManager.ChangeGameState(GameStateManager.GAME_STATE_GAME);	//NGame
			if(choose == 3)GameStateManager.ChangeGameState(GameStateManager.GAME_STATE_EXIT);	//Exit
		}
		
		if(Keyboard.getKeyOnce(KeyEvent.VK_DOWN))choose++;
		if(Keyboard.getKeyOnce(KeyEvent.VK_S))choose++;
		if(Keyboard.getKeyOnce(KeyEvent.VK_UP))choose--;
		if(Keyboard.getKeyOnce(KeyEvent.VK_W))choose--;
		
		if(choose > 3)choose = 0;
		if(choose < 0)choose = 3;
		 
		if(choose == 0)setPointer(20);	//NGame
		if(choose == 1)setPointer(20+32);	//Cont
		if(choose == 2)setPointer(20+64);	//Set
		if(choose == 3)setPointer(20+96);	//Exit
		
	}
	
	private void setPointer(int i) {
		pointerPosition += (i - pointerPosition) / 6;
	}
	
	public void render(Screen s) {
		//s.clear(0x00FF00);
		s.renderSprite(0, 0, s_tlo);
		s.renderSprite(32, 20, s_newGame);
		s.renderSprite(32, 20+32, s_Cont);
		s.renderSprite(32, 20+64, s_Set);
		s.renderSprite(32, 20+96, s_Exit);
		s.renderSprite(0, (int)pointerPosition, s_pointer);
	}
}
