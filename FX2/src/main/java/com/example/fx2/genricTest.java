package com.example.fx2;

import java.util.ArrayList;
import java.util.Collection;

class genericTest  {
    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<>();
        nums.add(20);
        nums.add(15);
        nums.add(40);

        genericStack<Integer> integers = new genericStack<>();
        integers.pushAll(nums);
        genericStack.print(integers);

        /*genericStack <String> stack = new genericStack<>();
        stack.push("visual");
        stack.push("programming");
        stack.push("class");
        genericStack.print(stack);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.getSize());*/

        /*genericStack <Integer> ints = new genericStack<>();
        ints.push(10);
        ints.push(22);
        genericStack.print(ints);*/

    }
}