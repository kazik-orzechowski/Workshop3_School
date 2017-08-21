package Group;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class GroupDao {

	static public void addGroup(HttpServletRequest request, String newGroupName) {
		HttpSession sess = request.getSession();
		HashMap<Integer, Group> groupMap = (HashMap<Integer, Group>) sess.getAttribute("groupMap");

		int lastGroupNumber = 0;
		if (groupMap == null) {

		} else {
			Set<Integer> mySet = groupMap.keySet();
			for (Integer key : mySet) { // iteracja po elementach hashMapy by znaleźć ostatni numer grupy
				if (key > lastGroupNumber) {
					lastGroupNumber = key;
			}
		}
			lastGroupNumber++;
			Group newGroup = new Group(lastGroupNumber, newGroupName);
			groupMap.put(lastGroupNumber, newGroup);
			sess.setAttribute("groupMap", groupMap);
			System.out.println("Group added");
		}

	}

	static public HashMap<Integer, Group> delGroup(HashMap<Integer, Group> groupMap, Integer groupId) {
		System.out.println("Show group" + groupId);
		groupMap.remove(groupId);
		System.out.println("Group deleted");
		return groupMap;
	}

	
	static public void editGroup(String groupMap, String groupId) {
		HashMap<Integer, Group> currGroupMap = new HashMap<Integer, Group>();
		currGroupMap.get(groupId); // to jest edytowana grupa
		System.out.println("Edit group" + groupId);

	}

	static public void showGroup(String groupMap, String groupId) {
		System.out.println("Show group" + groupId);
		
		// TODO Auto-generated method stub
	}


	static public void initializeGroupMap(HttpServletRequest request) {
		Group group1 = new Group(1, "Napieracze");
		Group group2 = new Group(2, "Lojanci");
		Group group3 = new Group(3, "Twardziele");

		HashMap<Integer, Group> groupMap = new HashMap<Integer, Group>();
		groupMap.put(group1.getGroupId(), group1);
		groupMap.put(group2.getGroupId(), group2);
		groupMap.put(group3.getGroupId(), group3);

		HttpSession sess = request.getSession();
		sess.setAttribute("groupMap", groupMap);
		System.out.println("GroupMap initialized");
		
	}

	
//	static public void listGroup(HttpServletRequest request) {
//
//		HttpSession sess = request.getSession();
//		sess.setAttribute("groupMap", groupMap);
//
//		
//	}

	
}
