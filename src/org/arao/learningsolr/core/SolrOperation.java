package org.arao.learningsolr.core;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrInputDocument;

public class SolrOperation implements ISolrOperation {

	@Override
	public SolrClient getSolrClient(String url) {
		// TODO Auto-generated method stub
		return new HttpSolrClient.Builder(url).build();
	}

	@Override
	public SolrClient getSolrClient(String url, String index) {
		// TODO Auto-generated method stub
		return new HttpSolrClient.Builder(url.concat(index)).build();
	}

	@Override
	public SolrClient createAdminRequest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdateResponse addDocument(String url, String index, SolrInputDocument doc) {
		// TODO Auto-generated method stub
		SolrClient client = getSolrClient(url, index);
		try {
			client.add(doc);
			return client.commit();
		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void createCore(String url, String name) {
		// TODO Auto-generated method stub

	}

}
