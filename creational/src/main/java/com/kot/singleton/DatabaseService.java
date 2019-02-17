package com.kot.singleton;

import java.util.Objects;

public class DatabaseService {

    private static DatabaseService instance;

    private DatabaseService() {

    }

    public static DatabaseService getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (DatabaseService.class) {
                if(Objects.isNull(instance)) {
                    instance = new DatabaseService();
                }
            }
        }
        return instance;
    }

}
