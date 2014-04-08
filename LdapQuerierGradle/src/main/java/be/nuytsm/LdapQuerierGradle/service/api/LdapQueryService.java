package be.nuytsm.LdapQuerierGradle.service.api;


import java.util.List;


public interface LdapQueryService {
	
	public List<QueryResult> getByAccount(String account);

	public List<QueryResult> getByServiceNumber(String serviceNumber);

}
