package com.mockmastery.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserSuccessResponse {
    private String successMsg;
    private Long userId;
}
