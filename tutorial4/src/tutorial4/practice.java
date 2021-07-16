package tutorial4;

import tutorial4.practice;

public class practice {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x=x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y=y;
	}
	public practice(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public practice getCenter(practice other) {
		return new practice((this.x+other.getX())/2,(this.y+other.getY())/2);
	}
}
