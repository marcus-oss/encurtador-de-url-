package com.createURL;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UrlData {

    private String originalUrl;
    private long expirationTime;


    public UrlData(String originalUrl, String expirationTime) {
    }
}

