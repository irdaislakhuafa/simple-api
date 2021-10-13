package com.simple.api.helpers;

import com.simple.api.Model.entities.Mahasiswa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseMessage<T> {
    private String status;
    private T values;
}
