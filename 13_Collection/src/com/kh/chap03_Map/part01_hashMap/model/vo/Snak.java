package com.kh.chap03_Map.part01_hashMap.model.vo;

public class Snak {

	
	private String flaver;
	private int calory;
	
	public Snak() {
		super();
	
	}

	public Snak(String flaver, int calory) {
		super();
		this.flaver = flaver;
		this.calory = calory;
	}


	public String getFlaver() {
		return flaver;
	}

	public void setFlaver(String flaver) {
		this.flaver = flaver;
	}

	public int getCalory() {
		return calory;
	}

	public void setCalory(int calory) {
		this.calory = calory;
	}

	
	
	@Override
	public String toString() {
		return "Snak [flaver=" + flaver + ", calory=" + calory + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + calory;
		result = prime * result + ((flaver == null) ? 0 : flaver.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Snak other = (Snak) obj;
		if (calory != other.calory)
			return false;
		if (flaver == null) {
			if (other.flaver != null)
				return false;
		} else if (!flaver.equals(other.flaver))
			return false;
		return true;
	}
	
	
	
	
}
