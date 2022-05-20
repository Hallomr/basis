package com.zxk.basis.reflectvo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReflectVo {
    public Integer id;
    public String code;
    private String value;

    private void test(String test){
        System.out.println(test+ "-----------");
    }
}