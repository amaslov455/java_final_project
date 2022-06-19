package com.company.model;

public abstract class AbstractDocument implements  Document{
    protected final Integer docId;
    protected final String docName;

    protected AbstractDocument(Integer docId, String docName) {
        this.docId = docId;
        this.docName = docName;
    }

    @Override
    public OrderStatus getStatus() {
        return null;
    }

    public Integer getDocId() {
        return docId;
    }

    public String getDocName() {
        return docName;
    }
}
