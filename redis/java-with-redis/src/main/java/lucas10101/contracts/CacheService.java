package lucas10101.contracts;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public interface CacheService {

    <T extends Serializable> T put(Object key, T data);

    <T extends Serializable> T get(Object key);

    /**
     * Extremely basic serialization feature.
     * 
     * @param <T>    Object type
     * @param object data object
     * @return byte representation
     * @throws Exception Some error, not relevante here
     */
    default <T extends Serializable> byte[] serialize(T object) throws Exception {
        try (var bytesOutput = new ByteArrayOutputStream(); var objectOutput = new ObjectOutputStream(bytesOutput)) {
            objectOutput.writeObject(object);
            return bytesOutput.toByteArray();
        }
    }

    /**
     * Read an object from bytes and desserialize into an Object
     * 
     * @param <T> T object type
     * @param data bytes to read
     * @return The object
     * @throws Exception Some error, not relevante hereF
     */
    @SuppressWarnings("unchecked")
    default <T extends Serializable> T desserialize(byte[] data) throws Exception {
        try (var byteInput = new ByteArrayInputStream(data); var objectInput = new ObjectInputStream(byteInput)) {
            return (T) objectInput.readObject();
        }
    }
}
