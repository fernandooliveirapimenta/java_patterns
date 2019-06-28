package com.java.patterns.java_patterns.iteratorpattern.impl;

public class NameRepository<T> implements Container<T> {

    private T[] data;
    NameRepository(T[] data) {
        this.data = data;
    }

    @Override
    public Iterator<T> getIterator() {
        return new NameIterator<T>(data);
    }

    private class NameIterator<D> implements  Iterator<D> {

        private D[] names;

        NameIterator(D[] names) {

            this.names = names;
        }

        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public D next() {
            return hasNext() ? names[index++] : null;
        }
    }


}
