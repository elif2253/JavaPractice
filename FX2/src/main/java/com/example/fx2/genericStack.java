package com.example.fx2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EmptyStackException;

public class genericStack<E>{
    ArrayList<E> list = new ArrayList<>();

    public int getSize(){
        return list.size();//listede kac eleman varsa o kadar eleman dödürür
    }

    public E peek(){
        return list.get(getSize()-1);
       // return list.getLast();
    }

    public void push(E e){
        list.add(e);
    }

    public E pop(){
        //list.remove(getSize()-1);
        //E result = new E(); böyle bir şey tanımlamak imkansız
        if (isEmpty()){
            throw new EmptyStackException();
        }
        E result = list.get(getSize()-1);
        list.remove(getSize()-1);
        return result;
    }

    public boolean isEmpty(){
        return list.isEmpty();
        //return getSize() == 0;
    }

    //her zaman için herhangi bir tipteki generic sttaki kabul etsin
    public static void print(genericStack<?> stack){
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    public void pushAll(Collection<E> source){//collection interface herhangi bir veri yapısı
        for (E e: source){
            push(e);
        }
    }
}