/**
 * Within this implementation we are going to see 
 * how builder pattern is implementing on mutable 'way'.
 * 
 * Here our case is; we are 3 different database and we need to implement query
 * for each of them, before applied builder pattern, we needed to create same 'members'
 * of 'Database query implementations' and also at the 'client' side we needed to write
 * same codes over and over again.
 * 
 *  
 * Now, with builder pattern, we are using handy reusable architecture to build any of 'product'
 * in our case our product is query.
 * 
 * 
 * 
 */
package chapter2DesignPatternsandPrinciples.chapter2_4UnderstandingDesignPrinciples.chapter4_3DesignPatterns.chapter4_3_3BuilderPattern.Advanced;


/**
 * @author tkurt
 * Date: Apr 10, 2016 13:00:56 AM
 *  
 */
public class App {

	public static void main(String[] args){

		String from="client table";
		String where="client name = ...";
		
		// First we create our 'concrete' class from our generic Builder interface 
		QueryBuilder builder = new SqlQueryBuilder();
		
		// Second,setup the concrete director class to let it 'direct'
		// us to responsible concrete builder class according to 'Generic' builder interface. 
		QueryBuildDirector director = new QueryBuildDirector();
		
		// Third, GET RESULT from our 'director' by its 'build()' method.
		Query query = director.buildQuery(from, where, builder);
		query.execute();
		
		/**
		 * After now, we can reuse our director to build new staff via creating new 'concrete' builder classes
		 */
		builder = new MongoDbQueryBuilder();
		query = director.buildQuery(from, where, builder);
		query.execute();
	}
	
}
