package com.company.sender;

/**
 * Результат отправки статистик в хранилище
 */
public class SenderResult {
    private final boolean isSuccess;

    public SenderResult(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public boolean isSuccess() {
        return isSuccess;
    }
}
