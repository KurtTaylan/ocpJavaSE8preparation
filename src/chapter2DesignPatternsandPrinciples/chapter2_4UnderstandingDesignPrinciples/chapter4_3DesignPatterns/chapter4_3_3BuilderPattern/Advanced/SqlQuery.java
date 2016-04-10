package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_3BuilderPattern.Advanced;

public class SqlQuery implements Query{

	private String from;
	
	private String where;
	
	@Override
	public void execute() {
		System.out.println("Executing sqlQuery from: "+from+" where "+where);
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setWhere(String where) {
		this.where = where;
	}
	
	

}
