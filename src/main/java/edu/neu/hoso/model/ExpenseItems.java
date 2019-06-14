package edu.neu.hoso.model;

public class ExpenseItems {
    private Integer expenseItemsId;

    private Integer medicalRecordId;

    private Double totalCost;

    private String payStatus;

    private Integer invoiceId;

    private Integer expenseTypeId;

    public ExpenseItems(Integer expenseItemsId, Integer medicalRecordId, Double totalCost, String payStatus, Integer invoiceId, Integer expenseTypeId) {
        this.expenseItemsId = expenseItemsId;
        this.medicalRecordId = medicalRecordId;
        this.totalCost = totalCost;
        this.payStatus = payStatus;
        this.invoiceId = invoiceId;
        this.expenseTypeId = expenseTypeId;
    }

    public ExpenseItems() {
        super();
    }

    public Integer getExpenseItemsId() {
        return expenseItemsId;
    }

    public void setExpenseItemsId(Integer expenseItemsId) {
        this.expenseItemsId = expenseItemsId;
    }

    public Integer getMedicalRecordId() {
        return medicalRecordId;
    }

    public void setMedicalRecordId(Integer medicalRecordId) {
        this.medicalRecordId = medicalRecordId;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getExpenseTypeId() {
        return expenseTypeId;
    }

    public void setExpenseTypeId(Integer expenseTypeId) {
        this.expenseTypeId = expenseTypeId;
    }
}