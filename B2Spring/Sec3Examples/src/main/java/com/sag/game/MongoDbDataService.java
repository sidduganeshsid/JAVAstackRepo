package com.sag.game;

import org.springframework.stereotype.Component;

@Component
public class MongoDbDataService implements IDataService {

	@Override
	public int[] retriveData() {
		// TODO Auto-generated method stub
		return new int[] {11,22,33,44,55};
	}

}
