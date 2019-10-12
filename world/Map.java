package world;

import graphics.*;

public class Map {

	public final int WIDTH,HEIGHT;
	public Block[][] blocks;
	
	public Map(int w, int h) {
		WIDTH = w;
		HEIGHT = h;
		blocks = new Block[w][h];
		
		clear(1);
	}
	
	public void update() {
		
	}
	
	public void clear(int id) {
		for(int y = 0; y < HEIGHT; y++) {
			for(int x = 0; x < WIDTH; x++) {
				blocks[x][y] = Block.getBlock(id);
			}
		}
	}
	
	public void render(Screen s) {
		for(int y = 0; y < HEIGHT; y++) {
			for(int x = 0; x < WIDTH; x++) {
				blocks[x][y].render(s,x,y);
			}
		}
	}
}
