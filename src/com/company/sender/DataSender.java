package com.company.sender;

import com.company.calculator.CalcCounts;

public interface DataSender {
    /**
     * Отправка данных
     * @param calcResult посчитанные статистики
     * @return результат отправки
     */
    SenderResult sendResult(CalcCounts calcResult);
}
