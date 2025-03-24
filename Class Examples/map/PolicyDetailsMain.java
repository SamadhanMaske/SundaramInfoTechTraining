package com.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Policy{
	private int policyId;
	private String policyName;
	public Policy(int policyId, String policyName) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
}

class PolicyDetail{
	private Map<Integer, String> policyMap = new TreeMap();
	
	public Map<Integer, String> getPolicyMap() {
		return policyMap;
	}

	public void setPolicyMap(Map<Integer, String> policyMap) {
		this.policyMap = policyMap;
	}

	public void addPolicyDetails(int policyId, String policyName) {
		policyMap.put(policyId, policyName);
	}
	
	public List<Integer> searchBasedOnPolicyType(String policyType){
		List<Integer> mps = new ArrayList();
		for(Map.Entry<Integer, String> e: policyMap.entrySet()) {
			if(e.getValue().contains(policyType)) {
				mps.add(e.getKey());
			}
		}
		return mps;
	}

    public void displayAllPolicies() {
    	System.out.println("All policies: ");
    	for(Map.Entry<Integer, String> e: policyMap.entrySet()) {
    		System.out.println(e.getKey()+" : "+e.getValue());
    	}
    }
}

public class PolicyDetailsMain {
	public static void main(String[] args) {
		PolicyDetail pd  = new PolicyDetail();
		pd.addPolicyDetails(10654, "Max Bupa Health Insurance");
		pd.addPolicyDetails(10321, "SBI Health Insurance");
		pd.addPolicyDetails(20145, "IFFCO Tokio Two Wheeler Insurance");
		pd.addPolicyDetails(20165, "New India Assurance Two Wheeler Insurance");
		pd.addPolicyDetails(10110, "Reliance Health Insurance");
		
		pd.displayAllPolicies();
		List<Integer> li = pd.searchBasedOnPolicyType("Health");
		System.out.println("All policies related to Health :");
		for(Integer i: li) {
			System.out.println(i);
		}
	}
}
