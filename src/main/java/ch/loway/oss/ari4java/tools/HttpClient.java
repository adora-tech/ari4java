package ch.loway.oss.ari4java.tools;

import java.util.List;

/**
 * Interface to pluggable HTTP client implementation
 *
 * @author mwalton
 */
public interface HttpClient {

    String httpActionSync(String uri, String method, List<HttpParam> parametersQuery, String body, List<HttpResponse> errors) throws RestException;

    byte[] httpActionSyncAsBytes(String uri, String method, List<HttpParam> parametersQuery, String body, List<HttpResponse> errors) throws RestException;

    void httpActionAsync(String uri, String method, List<HttpParam> parametersQuery, String body, List<HttpResponse> errors, HttpResponseHandler responseHandler, boolean binary) throws RestException;

    void destroy();

}
