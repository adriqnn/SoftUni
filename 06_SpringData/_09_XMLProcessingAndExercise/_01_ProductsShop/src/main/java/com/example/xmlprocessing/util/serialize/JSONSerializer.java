package com.example.xmlprocessing.util.serialize;

import com.example.xmlprocessing.util.io.FileIO;
import com.example.xmlprocessing.util.serialize.exceptions.SerializeException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component(value = "JsonSerializer")
public class JSONSerializer implements Serializer {

    private Gson gson;

    @Autowired
    private FileIO fileIO;

    public JSONSerializer() {
        this.gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .setPrettyPrinting()
                .create();
    }

    @Override
    public <T> void serialize(T t, String fileName) {
        String path = System.getProperty("user.dir") + File.separator + fileName;
        String json = gson.toJson(t);
        try {
            File f = new File(path);
            if (!f.exists()){
                f.getParentFile().mkdirs();
                f.createNewFile();
            }

            fileIO.write(json, fileName);
        } catch (IOException e) {
            //log here..
            throw new SerializeException(json + "was not serialised to " + path, e);
        }
    }

    @Override
    public <T> T deserialize(Class<T> clazz, String fileName) {

        try {
            String json = fileIO.read(fileName);
            return gson.fromJson(json, clazz);
        } catch (IOException e) {
            //log here...
            throw new SerializeException(fileName + "cannot be read!", e );
        }
    }
}
