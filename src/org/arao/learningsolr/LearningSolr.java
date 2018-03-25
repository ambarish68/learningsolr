package org.arao.learningsolr;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.request.CoreAdminRequest;
import org.apache.solr.common.SolrInputDocument;
import org.arao.learningsolr.core.SolrInstanceProvider;
import org.arao.learningsolr.core.SolrOperation;

public class LearningSolr {
	public static void main(String args[]) throws Exception {
		// Preparing the Solr client
		SolrInstanceProvider provider = new SolrInstanceProvider();

		String urlString = provider.getUrl();
		String index="arao_core";

		SolrClient Solr = new HttpSolrClient.Builder(urlString.concat(index)).build();

		// Preparing the Solr document
		SolrInputDocument doc = new SolrInputDocument();

		// Adding fields to the document
		doc.addField("id", "003");
		doc.addField("name", "arao");
		doc.addField("age", "34");
		doc.addField("addr", "vishakapatnam");

		// Adding the document to Solr

		SolrOperation operation=new SolrOperation();
		operation.addDocument(urlString, index, doc);
		
		System.out.println("Documents added");
	}
	
	
}