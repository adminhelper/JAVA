package edu.exam09.interface01;

public class PersonalNumberStorageImpl extends PersonalNumberStorage {
	
	PersonalNumInfo[] perArr;
	int numOfPerInfo;
	
	PersonalNumberStorageImpl(int num){
		perArr = new PersonalNumInfo[num];
		numOfPerInfo = 0;
	}
	@Override
	public void addPersonalInfo(String name, String perNum) {
		if(numOfPerInfo < perArr.length)
			perArr[numOfPerInfo++] = new PersonalNumInfo(name, perNum);
	}

	@Override
	public String searchName(String perNum) {
		for(int i=0;i<numOfPerInfo;i++) {
			if(perNum.equals(perArr[i].getNumber()))
				return perArr[i].getName();
		}
		return null;
	}

}
