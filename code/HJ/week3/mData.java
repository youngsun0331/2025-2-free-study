package week3;

class mData implements Comparable<mData> {
    int value;
    int index;


    public mData(int value, int index) {

        super();
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(mData o) {
        return this.value - o.value; // 오름차순
    }
}