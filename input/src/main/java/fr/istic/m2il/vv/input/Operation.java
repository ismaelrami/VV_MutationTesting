package fr.istic.m2il.vv.input;

public interface Operation {
	
	void setFirstMember(double firstMember);

	void setSecondMember(double secondMember);

	double getFirstMember();

	double getSecondMember();
	
	double operate();

	boolean firstGreatherThanSecond();

	boolean secondGreatherThanFirst();

	boolean firstLessThanSecond();

	boolean secondLessThanFirst();
	
	boolean firstGreatherOrEqualThanSecond();
	
	boolean secondGreatherOrEqualThanFirst();
	
	boolean firstLessOrEqualThanSecond();
	
	boolean secondLessOrEqualThanFirst();
}
