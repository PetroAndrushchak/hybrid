package com.softserve.edu.counters.data;

public class UserRepository {
	
	public static IUser getCalibratorUser() {
		return User.get().setFirstname("")
				.setLastname("")
				.setMiddleName("")
				.setPhoneNumber("")
				.setEmail("")
				.setLogin("calibrator-lv")
				.setPassword("pass")
				.setRegion("")
				.setDistrict("")
				.setSity("")
				.setStreet("")
				.setBuilding("")
				.setFlat("")
				.setRole("")
				.setOrganization("")
				.setWorkInProgress("")
				.build();	
	}
	
	public static IUser getInvalidUser() {
		return User.get().setFirstname("")
				.setLastname("")
				.setMiddleName("")
				.setPhoneNumber("")
				.setEmail("")
				.setLogin("calibrator")
				.setPassword("pass")
				.setRegion("")
				.setDistrict("")
				.setSity("")
				.setStreet("")
				.setBuilding("")
				.setFlat("")
				.setRole("")
				.setOrganization("")
				.setWorkInProgress("")
				.build();
	}
	
	public static IUser getEmployee() {
		return User.get()
				.setFirstname("���������")
				.setLastname("���������")
				.setMiddleName("�������")
				.setPhoneNumber("+380981323157")
				.setEmail("Yaremkevych.Roksolana@gmail.com")
				.setLogin("roksik")
				.setPassword("pass")
				.setRegion("��������")
				.setDistrict("����")
				.setSity("����")
				.setStreet("�����")
				.setBuilding("48")
				.setFlat("0")
				.setRole("CALIBRATOR_EMPLOYEE")
				.setOrganization("�� �������� � ������")
				.setWorkInProgress("0")
				.build();
	}
	
	public static IUser getChangedEmployee() {
		return User.get()
				.setFirstname("���������")
				.setLastname("�����")
				.setMiddleName("�������")
				.setPhoneNumber("+380981323157")
				.setEmail("Yaremkevych.Roksolana@gmail.com")
				.setLogin("roksik")
				.setPassword("pass")
				.setRegion("��������")
				.setDistrict("����")
				.setSity("����")
				.setStreet("�����")
				.setBuilding("48")
				.setFlat("0")
				.setRole("CALIBRATOR_EMPLOYEE")
				.setOrganization("�� �������� � ������")
				.setWorkInProgress("0")
				.build();
	}

}
