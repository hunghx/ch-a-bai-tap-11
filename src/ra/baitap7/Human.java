package ra.baitap7;

public class Human {
    private String name;
    private int born ;
    private  boolean sex;

    public Human(String name, int born, boolean sex) {
        this.name = name;
        this.born = born;
        this.sex = sex;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBorn() {
        return born;
    }

    public void setBorn(int born) {
        this.born = born;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        String gen = sex?"nam":"nu";
        return ""+name+","+gen+","+born;
    }
}
