package com.udpfileshare;

import javafx.stage.Stage;

public class Utility {
	//Reference to the open Stage
	private static Stage stageRef;
	
	public static void setStage(Stage stg) {
		stageRef = stg;
	}
	
	public static Stage getStage() {
		return stageRef;
	}
}
