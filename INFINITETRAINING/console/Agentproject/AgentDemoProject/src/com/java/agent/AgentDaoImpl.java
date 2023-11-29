package com.java.agent;


import java.util.ArrayList;
import java.util.List;

public class AgentDaoImpl implements AgentDAO{

	static List<Agent> agentList;
	static {
		agentList = new ArrayList<Agent>();
	}
	@Override
	public List<Agent> showAgentDao() {
		// TODO Auto-generated method stub
		return agentList;
	}
	
	private int generateAgent() {
		if(agentList.size()==0) {
			return 1;
		}else {
			return agentList.get(agentList.size()-1).getAgentId()+1;
		}
	}
	
	@Override
	public String addAgentDao(Agent agent) {
		int id=generateAgent();
		agent.setAgentId(id);
		agentList.add(agent);
		return "Agent Record Inserted...";
	}
	@Override
	public Agent searchAgentDao(int empno) {
		Agent agentFound = null;
		for(Agent agent:agentList) {
			if(agent.getAgentId()==empno) {
				agentFound = agent;
				break;
			}
		}
		return agentFound;
	}
	@Override
	public String deleteAgentDao(int empno) {
		Agent agentFound = searchAgentDao(empno);
		if (agentFound!=null) {
			agentList.remove(agentFound);
			return "Employ Record Deleted...";
		}
		return "Employ Record Not Found...";
	}
	@Override
	public String updateAgentDao(Agent agentUpdated) {
		Agent agentFound = searchAgentDao(agentUpdated.getAgentId());
		if (agentFound!=null) {
			for (Agent agent : agentList) {
				if (agent.getAgentId()==agentUpdated.getAgentId()) {
					agent.setFirstName(agentUpdated.getFirstName());
					agent.setFirstName(agentUpdated.getFirstName());
					agent.setLastName(agentUpdated.getLastName());
					agent.setCity(agentUpdated.getCity());
					agent.setPayMode(agentUpdated.getPayMode());
					agent.setPremium(agentUpdated.getPremium());
					break;
				}
			}
			return "Employ Record Updated...";
		}
	return "Employ Record not Found...";
	}
	

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
