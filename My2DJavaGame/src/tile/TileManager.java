package tile;

import java.awt.Graphics2D;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class TileManager {
	
	GamePanel gp;
	Tile[]tile;
	
	public TileManager(GamePanel gp) {
		this.gp = gp;
		
		tile = new Tile[10];
		
		try {
			getTileManager();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void getTileManager() throws IOException {
		
		tile[0] = new Tile();
		tile[0].image = ImageIO.read(getClass().getResourceAsStream("/tiles/grass.png"));
		
		tile[1] = new Tile();
		tile[1].image = ImageIO.read(getClass().getResourceAsStream("/tiles/wall.png"));
		
		tile[2] = new Tile();
		tile[2].image = ImageIO.read(getClass().getResourceAsStream("/tiles/water.png"));
	}
	
	public void draw(Graphics2D g2) {
		
		g2.drawImage(tile[1].image,0 ,0, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[1].image,48 ,0, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[1].image,96 ,0, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[1].image,144 ,0, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[1].image,192 ,0, gp.tileSize, gp.tileSize, null);
		
		g2.drawImage(tile[1].image,0 ,48, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[0].image,48 ,48, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[0].image,96 ,48, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[0].image,144 ,48, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[1].image,192 ,48, gp.tileSize, gp.tileSize, null);
		
		g2.drawImage(tile[1].image,0 ,96, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[0].image,48 ,96, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[0].image,96 ,96, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[0].image,144 ,96, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[0].image,192 ,96, gp.tileSize, gp.tileSize, null);
		
		g2.drawImage(tile[1].image,0 ,144, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[0].image,48 ,144, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[0].image,96 ,144, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[0].image,144 ,144, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[1].image,192 ,144, gp.tileSize, gp.tileSize, null);
		
		g2.drawImage(tile[1].image,0 ,192, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image,48 ,192, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image,96 ,192, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[2].image,144 ,192, gp.tileSize, gp.tileSize, null);
		g2.drawImage(tile[1].image,192 ,192, gp.tileSize, gp.tileSize, null);
		
	}

}