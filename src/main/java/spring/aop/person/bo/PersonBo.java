package spring.aop.person.bo;

public interface PersonBo {

	void addPerson();
	String addPersonReturnValue();
	void addPersonThrowException() throws Exception;
	void addPersonAround(String name);
}
