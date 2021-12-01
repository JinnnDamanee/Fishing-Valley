package logic;

import java.util.ArrayList;
import java.util.List;

import UI.Map;
import fish.*;

public class ObjectManager {
	private List<Entity> gameObjectContainer;
	
	public ObjectManager(){
		this.gameObjectContainer = new ArrayList<Entity>();
		
		Map bgMap = new Map();
		GameLogic.getInstance().add(bgMap);

		Fish fish1 = new BlueFish();
		this.addNewObject(fish1);
		
		
		/*
		Background bg = new Background();
		GameLogic.getInstance().add(background);
		tank = new Tank(320,240);
		mine = new Mine(100,100);
		addNewObject(tank);
		addNewObject(mine);
		*/
	}
	
	protected void addNewObject(Entity entity){
		gameObjectContainer.add(entity);
		GameLogic.getInstance().add(entity);
	}
	
	public void update(){
		//update();
	}
}
