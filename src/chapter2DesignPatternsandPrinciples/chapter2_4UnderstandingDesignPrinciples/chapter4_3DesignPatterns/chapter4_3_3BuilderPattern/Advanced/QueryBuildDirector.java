package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_3BuilderPattern.Advanced;

public class QueryBuildDirector {

	/**
	 * Creates a query bases on the from and the where
	 * @param from
	 * @param where
	 * @param builder to define end result of the query or the representation of the query
	 * @return
	 */
	public Query buildQuery(String from, String where, QueryBuilder builder){
		builder.from(from);
        builder.where(where);
        return builder.getQuery();
	}
	
	
}
