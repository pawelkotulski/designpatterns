package com.kot.adapter;

import com.kot.adapter.galileo.GalileoAdapter;
import com.kot.adapter.ypsilon.YpsilonAdapter;

import java.util.ArrayList;
import java.util.List;

public class FlightSearchEngine {

    private final List<SearchProvider> searchProvider = new ArrayList<>();

    {
        searchProvider.add(new YpsilonAdapter());
        searchProvider.add(new GalileoAdapter());
    }

    public SearchResult makeSearch(SearchRequest searchRequest) {
        return searchProvider.stream()
                .map(provider -> provider.search(searchRequest))
                .reduce(new SearchResult(), (s1, s2) -> s1);
    }
}
