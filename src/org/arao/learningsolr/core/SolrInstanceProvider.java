package org.arao.learningsolr.core;

public class SolrInstanceProvider implements ISolrInstanceProvider{
	public static final String urlString = "http://localhost:8983/solr/";

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return urlString;
	}

}
