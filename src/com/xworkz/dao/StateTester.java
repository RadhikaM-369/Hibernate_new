package com.xworkz.dao;

import com.xworkz.entity.StateEntity;

public class StateTester {

	public static void main(String[] args) {
		StateEntity se1=new StateEntity(11, "Karnataka", "sandalwood", "Bangalore", 67562686);
		StateEntity se2=new StateEntity(12, "tamilnadu", "Temples", "chennai", 75626865);
		StateEntity se3=new StateEntity(13, "Maharashtra", "Warli painting Art", "Mumbai", 117562686);
		StateEntity se4=new StateEntity(14, "Andhrapradesh", "Venkateshwara", "Amaravati", 35003674);
		
		StateInterface stateInterface=new StateDaoImpl();
		stateInterface.save(se1);
		stateInterface.save(se2);
		stateInterface.save(se3);
		stateInterface.save(se4);

		StateEntity s_entity=stateInterface.getById(13);
		System.out.println("get state id:"+s_entity);
		//stateInterface.updateCapitalCity("AP", 14);
		stateInterface.delete(14);

	}

}
