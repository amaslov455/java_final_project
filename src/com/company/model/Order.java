package com.company.model;

/**
 * Объект документа приказа
 */
public class Order extends AbstractDocument{
    private final String employeeFio;
    private final String orderText;
    private final OrderStatus status;

    /**
     * Генератор Документа приказа
     * @param docId id Документа
     * @param docName тип приказа
     * @param employeeFio ФИО сотрудника
     * @param orderText текст приказа
     * @param status статус приказа (СОЗДАН, ИСПОЛНЕН)
     */
    public Order(Integer docId, String docName, String employeeFio, String orderText, String status) {
        super(docId, docName);
        this.employeeFio = employeeFio;
        this.orderText = orderText;
        this.status = OrderStatus.fromString(status);
    }

    @Override
    public Integer getDocId() {
        return super.getDocId();
    }

    @Override
    public String getDocName() {
        return super.getDocName();
    }

    public String getEmployeeFio() {
        return employeeFio;
    }

    public String getOrderText() {
        return orderText;
    }

    @Override
    public OrderStatus getStatus() {
        return status;
    }
}
