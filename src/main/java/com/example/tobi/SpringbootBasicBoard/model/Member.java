package com.example.tobi.SpringbootBasicBoard.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Member {
    private String userId;
    private String password;
    private String userName;

}
