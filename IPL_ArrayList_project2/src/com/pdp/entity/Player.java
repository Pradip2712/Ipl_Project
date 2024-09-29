package com.pdp.entity;

public class Player {

	private String name;
	private int jrNo;
	private String tName;
	private int match;
	private int run;
	private int wicket;

	public Player() {
		super();
	}

	public Player(String name, int jrNo, String tName, int match, int run, int wicket) {
		super();
		this.name = name;
		this.jrNo = jrNo;
		this.tName = tName;
		this.match = match;
		this.run = run;
		this.wicket = wicket;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJrNo() {
		return jrNo;
	}

	public void setJrNo(int jrNo) {
		this.jrNo = jrNo;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public int getMatch() {
		return match;
	}

	public void setMatch(int match) {
		this.match = match;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public int getWicket() {
		return wicket;
	}

	public void setWicket(int wicket) {
		this.wicket = wicket;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", Jersey_No=" + jrNo + ", Team_Name=" + tName + ", Toatal_match=" + match
				+ ", run=" + run + ", wicket=" + wicket + "]";
	}

}
