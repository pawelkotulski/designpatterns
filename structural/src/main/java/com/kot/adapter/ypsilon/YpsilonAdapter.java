package com.kot.adapter.ypsilon;

import com.kot.adapter.SearchProvider;
import com.kot.adapter.SearchRequest;
import com.kot.adapter.SearchResult;

public class YpsilonAdapter implements SearchProvider {
    @Override
    public SearchResult search(SearchRequest searchRequest) {
        System.out.println("Make ypsilon search");
        startSession(searchRequest);
        if(useCache(searchRequest)){
            return getSearchFromCache(searchRequest);
        } else {
            return runLiveSearch(searchRequest);
        }
    }

    private SearchResult getSearchFromCache(SearchRequest searchRequest) {
        return new SearchResult();
    }

    private boolean useCache(SearchRequest searchRequest) {
        System.out.println("check cache");
        return false;
    }

    private SearchResult runLiveSearch(SearchRequest searchRequest) {
        System.out.println("make search");
        return new SearchResult();
    }

    private void startSession(SearchRequest searchRequest) {
        System.out.println("start session");

    }
}
