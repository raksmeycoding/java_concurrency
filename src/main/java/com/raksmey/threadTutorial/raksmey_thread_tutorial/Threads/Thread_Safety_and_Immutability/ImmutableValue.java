package com.raksmey.threadTutorial.raksmey_thread_tutorial.Threads.Thread_Safety_and_Immutability;

public class ImmutableValue {

    private int value;
    public ImmutableValue(int value) {
        this.value = value;
    }

    /*
    * @Des: No setter method, is also helping in thread safe as well.
    * */
    private int getValue() {
        return this.value;
    }


    /*
    * @Desc: This also helping in thread safe.
    * */
    public ImmutableValue add(int valueToAdd) {
        return new ImmutableValue(this.value + valueToAdd);
    }
}
