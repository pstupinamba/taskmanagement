package com.taskmanagement.management.utilclasses;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class QueryResultMapper {

    public static <T> T map(Object[] result, Class<T> dtoClass, String... fields) {
        try {
            Constructor<T> constructor = dtoClass.getDeclaredConstructor(
                Arrays.stream(fields).map(field -> Object.class).toArray(Class[]::new)
            );
            return constructor.newInstance(result);
        } catch (Exception e) {
            throw new IllegalArgumentException("Erro ao mapear os resultados para o DTO", e);
        }
    }
}

