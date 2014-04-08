package be.nuytsm.LdapQuerierGradle.service.api;

public class QueryResult {
	private String name;
	private String result;

	public QueryResult(String name, String result) {
		this.name = name;
		this.result = result;
	}

	public String getName() {
		return name;
	}

	public String getResult() {
		return result;
	}
}
