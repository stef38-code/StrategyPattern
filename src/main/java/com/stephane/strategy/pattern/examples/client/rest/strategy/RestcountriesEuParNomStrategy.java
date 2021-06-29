package com.stephane.strategy.pattern.examples.client.rest.strategy;


import com.stephane.strategy.pattern.examples.client.rest.data.RestcountriesEuParNomData;
import org.springframework.http.ResponseEntity;

/*************************************************************
 *
 * (c) Ag2r - La Mondiale, 2021. Tous droits reserves.
 *
 * ----------------------------------------------------------
 * Project: strategypattern
 * Package: com.stephane.strategy.pattern.examples.client.rest
 * ----------------------------------------------------------
 * Date: 25 juin 2021,
 * Time: 13:38
 * ----------------------------------------------------------
 * Author: betton
 * ----------------------------------------------------------
 * Description:
 *************************************************************/
public class RestcountriesEuParNomStrategy extends CommunStrategy<RestcountriesEuParNomData> {
    private String url = "https://restcountries.eu/rest/v2/name/france";

    @Override
    public <T> ResponseEntity<T> getExchange(Class<T> clazz) {
// HttpHeaders
        /*HttpHeaders headers = new HttpHeaders();

        headers.setAccept(Arrays.asList(new MediaType[]{MediaType.APPLICATION_JSON}));
        // Request to return JSON format
        headers.setContentType(MediaType.APPLICATION_JSON);
        // HttpEntity<String>: To get result as String.
        HttpEntity<String> entity = new HttpEntity<>(headers);
        return getRestTemplate().exchange(url, HttpMethod.GET, entity, clazz);*/
        return null;
    }

    @Override
    public String getUrlValue() {
        return url;
    }

}
