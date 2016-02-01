/**
 * 
 */
package sg.edu.nus.iss.club;

import java.util.ArrayList;

/**
 * @author SMRT
 *
 */
public class Club {

	/* Instance Variables */
	
	/*
	 * ArrayList for holding the list of Members in the club.
	 */
	private ArrayList<Member> arrMember;

	
	/* Constructors */
	public Club(){
		//Initialize the array list.
		arrMember = new ArrayList<Member>();
	}
	
	/* Public Methods */
	
	/*
	 * Method to add members to the club.
	 */
	public Member addMember(String surName, String firstName, String secondName) {
		//Membership starts with '1'.
		Member newMember = new Member(surName, firstName, secondName, arrMember.size() + 1);
		arrMember.add(newMember);
		return newMember;
		
		
	}
	
	/*
	 * Method to get the members
	 */
	public ArrayList<Member> getMembers(){
		return arrMember;
	}
	
	/*
	 * Method to print the list of club members in the console.
	 */
	public void showMembers() {
		for(Member member : arrMember){
			System.out.println(member.toString());
		}
	}
	
	/*
	 * Method to get a particular member from a index.
	 * @param: Index for which we need to get the index.
	 * @Exception: If the index is not present in the array.
	 */
	public void getMember(int index) throws ArrayIndexOutOfBoundsException{
		if(index > (arrMember.size() - 1)){
			throw new ArrayIndexOutOfBoundsException();
		}else {
			arrMember.get(index);
		}
	}
	
	//TODO - Complete this.
	public void removeMember(int membershipNumber) {
		
	}
}
