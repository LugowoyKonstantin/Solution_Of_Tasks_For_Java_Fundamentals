package com.lugowoy.tasks.arrays.findNumbersInSequenceThatAreTheSquareOfNumber;

/** Created by Konstantin Lugowoy on 12.03.2017. */

public class Sequence<T> {

    private T[] sequence;

    public Sequence() {
    }

    public Sequence(T[] sequence) {
        this.sequence = sequence;
    }

    public T[] getSequence() {
        return sequence;
    }

    public void setSequence(T[] sequence) {
        this.sequence = sequence;
    }
}

