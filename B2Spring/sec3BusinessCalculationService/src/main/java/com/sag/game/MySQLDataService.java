package com.sag.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySQLDataService implements IDataService {

	@Override
	public int[] retriveData() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3,4,5};
	}

}
