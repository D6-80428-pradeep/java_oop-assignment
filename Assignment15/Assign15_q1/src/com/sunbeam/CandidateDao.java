package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CandidateDao implements AutoCloseable {
	private Connection con;
	private PreparedStatement stmtInsert;
	private PreparedStatement stmtUpdate;
	private PreparedStatement stmtDelete;
	private PreparedStatement stmtFindById;
	private PreparedStatement stmtFindAll;
	private PreparedStatement stmtGetPartyWiseVotes;
	private PreparedStatement stmtFindByParty;
	
	public CandidateDao() throws Exception {
		con = DbUtil.getConnection();
		String sql1 = "INSERT INTO candidates VALUES(default,?,?,?)";
		stmtInsert = con.prepareStatement(sql1);
		String sql2 = "UPDATE candidates SET name=?, party=?, votes=? WHERE id=?";
		stmtUpdate = con.prepareStatement(sql2);
		String sql3 = "DELETE FROM candidates WHERE id=?";
		stmtDelete = con.prepareStatement(sql3);
		String sql4 = "Select * FROM candidates WHERE id=?";
		stmtFindById = con.prepareStatement(sql4);
		String sql5 = "Select * FROM candidates";
		stmtFindAll = con.prepareStatement(sql5);
		String sql6 = "Select party, sum(votes) total from candidates group by party";
		stmtGetPartyWiseVotes = con.prepareStatement(sql6);
		String sql7 = "SELECT * FROM candidates WHERE party=?";
		stmtFindByParty = con.prepareStatement(sql7);
	}

	@Override
	public void close() {
		try {
			if(stmtFindByParty != null) 
				stmtFindByParty.close();
			if(stmtGetPartyWiseVotes != null) 
				stmtGetPartyWiseVotes.close();
			if(stmtFindAll != null) 
				stmtFindAll.close();
			if(stmtFindById != null) 
				stmtFindById.close();
			if(stmtDelete != null) 
				stmtDelete.close();
			if(stmtUpdate != null) 
				stmtUpdate.close();
			if(stmtInsert != null) 
				stmtInsert.close();
			if(con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int save(Candidate c) throws Exception{
			stmtInsert.setString(1, c.getName());
			stmtInsert.setString(2, c.getParty());
			stmtInsert.setInt(3, c.getVotes());
			
			int cnt = stmtInsert.executeUpdate();
			return cnt;
	}
	
	public int update(Candidate c) throws Exception {
			stmtUpdate.setString(1, c.getName());
			stmtUpdate.setString(2, c.getParty());
			stmtUpdate.setInt(3, c.getVotes());
			stmtUpdate.setInt(4, c.getId());
			int count = stmtUpdate.executeUpdate();
			return count;
	} 
	
	public int delete(int id) throws Exception{
			stmtDelete.setInt(1, id);
			int count = stmtDelete.executeUpdate();
			return count;
	}
	
	public Candidate findById(int id) throws Exception {
		stmtFindById.setInt(1, id);
		try(ResultSet rs = stmtFindById.executeQuery()){
			if(rs.next()) {
				String name = rs.getString("name");
				String party = rs.getString("party");
				int votes = rs.getInt("votes");
				
				Candidate c = new Candidate(id, name, party, votes);
				return c;
			}
		}
		return null;
	}
	
	public List<Candidate> findAll() throws Exception {
		List<Candidate> li = new ArrayList<>();
		try(ResultSet rs = stmtFindAll.executeQuery()){
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String party = rs.getString("party");
				int votes = rs.getInt("votes");
				Candidate c = new Candidate(id, name, party, votes);
				li.add(c);
			}
		}
		return li;
	}
	
	public List<PartyVotes> getPartywiseVotes() throws Exception {
		List<PartyVotes> li = new ArrayList<>();
		try(ResultSet rs = stmtGetPartyWiseVotes.executeQuery()){
			while(rs.next()) {
				String party = rs.getString("party");
				int total = rs.getInt("total");
				
				PartyVotes pv = new PartyVotes(party, total);
				li.add(pv);
			}
		}
		
		return li;
	}
	
	public List<Candidate> findByParty(String party) throws Exception {
		List<Candidate> list = new ArrayList<Candidate>();
		stmtFindByParty.setString(1, party);
			try(ResultSet rs = stmtFindByParty.executeQuery()) {
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			}
		return list;
	}
}
