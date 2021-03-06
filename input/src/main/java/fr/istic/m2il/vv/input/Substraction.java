package fr.istic.m2il.vv.input;

public class Substraction implements Operation {

	private double firstMember;
	private double secondMember;

	public Substraction(double firstMember, double secondMember) {
		this.firstMember = firstMember;
		this.secondMember = secondMember;
	}

	@Override
	public void setFirstMember(double firstMember) {
		this.firstMember = firstMember;
	}

	@Override
	public void setSecondMember(double secondMember) {
		this.secondMember = secondMember;
	}

	public Substraction() {
	}

	@Override
	public double getFirstMember() {
		return this.firstMember;
	}

	@Override
	public double getSecondMember() {
		return this.secondMember;
	}

	public double operate() {
		return (getFirstMember() - getSecondMember());
	}

	@Override
	public boolean firstGreatherThanSecond() {
		return (this.firstMember > this.secondMember);
	}

	@Override
	public boolean secondGreatherThanFirst() {
		return (this.secondMember > this.firstMember);
	}

	@Override
	public boolean firstLessThanSecond() {
		return (this.firstMember < this.secondMember);
	}

	@Override
	public boolean secondLessThanFirst() {
		return (this.secondMember < this.firstMember);
	}
	
	@Override
	public boolean firstGreatherOrEqualThanSecond() {
		return (this.firstMember >= this.secondMember);
	}

	@Override
	public boolean secondGreatherOrEqualThanFirst() {
		return (this.secondMember >= this.firstMember);
	}

	@Override
	public boolean firstLessOrEqualThanSecond() {
		return (this.firstMember <= this.secondMember);
	}

	@Override
	public boolean secondLessOrEqualThanFirst() {
		return (this.secondMember <= this.firstMember);
	}
}
