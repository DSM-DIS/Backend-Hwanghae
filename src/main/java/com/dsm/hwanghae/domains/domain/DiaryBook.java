package com.dsm.hwanghae.domains.domain;

public class DiaryBook {
    private int id;
    private String name;
    private String code;
    private String owner;

    public DiaryBook() {}
    public DiaryBook(int id, String name, String code, String owner) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getOwner() {
        return owner;
    }
}
