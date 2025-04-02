package com.ecommerce.project.exceptions;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class APIResponse{
    private String message;
    private boolean status;
}
