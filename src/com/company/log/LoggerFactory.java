package com.company.log;

public class LoggerFactory {
    public Logger getLogger(){
        return new ConsoleLogger();
    }
}
