/**
 * 
 */
package game;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 * @author ibrahim
 *
 */
public abstract class Robot extends GameElement{
	protected int damage;
	protected int health;
	protected int curSpeed;
	protected Image img;
	
	
	public Robot(int x,int y) throws SlickException{
		super(x, y);
	}
	
	public void takeDamage(int damage) {
		health=health-damage;
	}
	
	public void draw() {
		img.draw(x, y, 50, 50);
	}
	
	public int getDamage() {
		return damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getSpeed() {
		return curSpeed;
	}
	
	public void attackToHuman(AttackerHuman shooter) {
		shooter.takeDamage(damage);
	}
	public void updateLocation() {
		x=x-curSpeed/2;
	}
	public abstract void run();
	
	public void stop() {
		curSpeed=0;
	}
}