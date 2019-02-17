package com.kot.adapter.galileo;

import com.kot.adapter.SearchProvider;
import com.kot.adapter.SearchRequest;
import com.kot.adapter.SearchResult;

public class GalileoAdapter implements SearchProvider {
    @Override
    public SearchResult search(SearchRequest searchRequest) {
        System.out.println("Make galileo search");
        if(isInSchedule(searchRequest)) {
            return makeSearch(searchRequest);
        }
        return emptySearchResponse(searchRequest);
    }

    private SearchResult emptySearchResponse(SearchRequest searchRequest) {
        return new SearchResult();
    }

    private SearchResult makeSearch(SearchRequest searchRequest) {
        System.out.println("make search");
        return new SearchResult();
    }

    private boolean isInSchedule(SearchRequest searchRequest) {
        System.out.println("check schedule");
        return true;
    }
}
