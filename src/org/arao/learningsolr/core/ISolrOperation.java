package org.arao.learningsolr.core;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrInputDocument;

public interface ISolrOperation {
	public SolrClient getSolrClient(String url);

	public SolrClient getSolrClient(String url, String index);

	public SolrClient createAdminRequest();

	public void createCore(String url, String name);

	public UpdateResponse addDocument(String url, String index, SolrInputDocument doc);
}
