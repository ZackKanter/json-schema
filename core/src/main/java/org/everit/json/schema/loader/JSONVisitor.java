package org.everit.json.schema.loader;

import org.json.JSONPointer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author erosb
 */
public interface JSONVisitor<R> {

    static String requireString(JSONTraverser traverser) {
        traverser.accept(new TypeMatchingJSONVisitor(String.class));
        return null;
    }

    R visitBoolean(boolean value, LoadingState ls);

    R visitArray(List<JSONTraverser> value, LoadingState ls);

    R visitString(String value, LoadingState ls);

    R visitInteger(Integer value, LoadingState ls);

    R visitObject(Map<String, JSONTraverser> obj, LoadingState ls);

}
