package com.team2.healthsns.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class guestbookVO {
    private String target_home;
    private String userid;
    private String write_date;
    private String content;
}
