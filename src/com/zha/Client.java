package com.zha;

import com.zha.logic.ConcreteCommLogic;
import com.zha.ui.RideActivity;
import com.zha.ui.SimpleOperatorActivity;

public class Client {

	public static void main(String[] args) {
		
		ConcreteCommLogic concreteCommLogic = new ConcreteCommLogic();
		RideActivity rideFragment = new RideActivity();
		SimpleOperatorActivity simpleOperatorActivity = new SimpleOperatorActivity();
		concreteCommLogic.attach(rideFragment);
		concreteCommLogic.attach(simpleOperatorActivity);
		concreteCommLogic.noticyRefreshTemperature();
		concreteCommLogic.clickLock();
		concreteCommLogic.clickChangeAssistantMode();
		concreteCommLogic.startTimer();
	}

}
