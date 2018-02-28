package com.abc.roomviewer.entity;

public class Room {

	private int xpos;
	private int ypos;
	private int width;
	private int height;
	private int occupancyPercent;
	
	public Room(int xpos, int ypos, int width, int height, int occupancyPercent) {
		this.xpos = xpos;
		this.ypos = ypos;
		this.width = width;
		this.height = height;
		this.occupancyPercent = occupancyPercent;
	}

	public int getXpos() {
		return xpos;
	}

	public void setXpos(int xpos) {
		this.xpos = xpos;
	}

	public int getYpos() {
		return ypos;
	}

	public void setYpos(int ypos) {
		this.ypos = ypos;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getOccupancyPercent() {
		return occupancyPercent;
	}

	public void setOccupancyPercent(int occupancyPercent) {
		this.occupancyPercent = occupancyPercent;
	}
	
	
}
