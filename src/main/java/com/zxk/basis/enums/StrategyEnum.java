package com.zxk.basis.enums;

public enum StrategyEnum {
    STRATEGY_ONE(1,"strategy_one"),
    STRATEGY_TWO(2,"strategy_two")
    ;
    private Integer code;
    private String desc;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    StrategyEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
