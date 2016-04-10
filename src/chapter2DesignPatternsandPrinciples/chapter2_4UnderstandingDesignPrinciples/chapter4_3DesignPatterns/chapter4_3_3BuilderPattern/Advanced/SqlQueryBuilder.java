package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_3BuilderPattern.Advanced;

public class SqlQueryBuilder implements QueryBuilder{

	private SqlQuery query = new SqlQuery();
	
	@Override
	public void from(String from) {
		query.setFrom(from);
	}

	@Override
	public void where(String where) {
		query.setWhere(where);
	}

	@Override
	public Query getQuery() {
		return query;
	}

}
