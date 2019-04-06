package com.ob.java8.react;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author: oubin
 * @date: 2019/1/3 16:53
 * @Description:
 */
public class Original {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Optional<String> optionalS = Optional.ofNullable(list.get(0));

    }

    public static List<String> getKeys() {
        List<String> keys = new ArrayList<>();
        for (int i = 0; i < 2000; i++) {
            keys.add(String.valueOf(i));
        }
        return keys;
    }

    public List<Integer> getData(List<String> keys) {
        List<Integer> result = new ArrayList<>();
        for (String key : keys) {
            result.add(Integer.valueOf(key) % 100);
        }
        return result;
    }
    public List<Integer> getDataLambda(List<String> keys) {
        return keys.stream().map(key -> Integer.valueOf(key) % 100).collect(Collectors.toList());
    }

    public List<Integer> getDataStream(List<String> keys) {
        return StreamUtil.map(keys, key -> Integer.valueOf(key) * 100);
    }

//    public static List<String> getKeysLambda() {
//        return
//    }
}
