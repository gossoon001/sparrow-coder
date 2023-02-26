package com.sparrow.coding.protocol;

public enum ControlType {
    LABEL("lbl"),
    LINK("lnk"),
    INPUT_TEXT("txt"),
    INPUT_PASSWORD("txt"),
    TEXT_AREA("txt"),
    DROPDOWN_LIST("ddl"),
    RADIO_LIST("rdl"),
    CHECK_BOX_LIST("cbl"),
    CODE("txt"),
    EDITOR("divEditor"),
    DATE("txt"),
    DATE_HHMMSS("txt"),
    CHECK_BOX("ckb"),
    RADIO("rdb"),
    HIDDEN("hdn"),
    SELECT("slt"),
    FILE("flb"),
    IMAGE("img");


    private String prefix;

    ControlType(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }
}
