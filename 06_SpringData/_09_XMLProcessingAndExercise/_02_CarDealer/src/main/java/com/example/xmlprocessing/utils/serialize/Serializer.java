package com.example.xmlprocessing.utils.serialize;

public interface Serializer {

    <T> void serialize(T t, String fileName);

    <T> T deserialize(Class<T> clazz, String fileName);
}
