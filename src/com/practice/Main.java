package com.practice;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ResponseDataBox<String> messages = new ResponseDataBox<>();
        messages.addData("???????????????????????????????????????????????????????????");
        System.out.println(messages.getData(0));
        ResponseDataBox<Integer> numbers = new ResponseDataBox<>();
        numbers.addData(1231231213);
        System.out.println(numbers.getData(0));
        ResponseDataBox<ResponseData> data = new ResponseDataBox<>();
        data.addData(new ResponseData("fatal error :)"));
        System.out.println(data.getData(0));
    }
}

interface DataStructure<T>{
    T getData(int i);
    void addData(T object);
    void setData(int i, T object);
}

class ResponseDataBox<T> implements DataStructure<T>{
    private final ArrayList<T> array = new ArrayList<>();

    @Override
    public void addData(T object) {
        this.array.add(object);
    }

    @Override
    public void setData(int i, T object) {
        this.array.set(i, object);
    }

    @Override
    public T getData(int i){
        return array.get(i);
    }
}

class ResponseData{
    String message;
    ResponseData(String a){
        this.message = a;
    }
}