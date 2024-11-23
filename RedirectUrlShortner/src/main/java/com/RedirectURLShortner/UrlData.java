package com.RedirectURLShortner;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
public class UrlData {
    private String originalUrl;
    private long expirationTime;


}
