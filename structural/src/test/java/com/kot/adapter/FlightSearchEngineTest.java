package com.kot.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightSearchEngineTest {

    @Test
    void makeSearch() {
        //given
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();
        SearchRequest searchRequest = new SearchRequest();

        //when
        flightSearchEngine.makeSearch(searchRequest);
    }
}