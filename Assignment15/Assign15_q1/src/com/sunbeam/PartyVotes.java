package com.sunbeam;

public class PartyVotes {
	String party;
	int votes;
	
	public PartyVotes() {
	}

	public PartyVotes(String party, int votes) {
		this.party = party;
		this.votes = votes;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}
	
	@Override
	public String toString() {
		return "Party Votes [party=" + party + ", votes=" + votes + "]";
	}
}
