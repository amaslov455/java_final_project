package com.company.model;

/**
 * Объект письма
 */
public class Letter extends AbstractDocument{
    protected Letter(Integer docId, String docName) {
        super(docId, docName);
    }

    @Override
    public Integer getDocId() {
        return super.getDocId();
    }

    @Override
    public String getDocName() {
        return super.getDocName();
    }
}
