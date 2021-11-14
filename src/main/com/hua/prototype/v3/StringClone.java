package com.hua.prototype.v3;

/**
 * String需要进一步深克隆吗？
 */
public class StringClone {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        Person p2 = (Person) p1.clone();
        System.out.printf("克隆对象的age:%s,score:%s\n", p2.age, p2.score);
        System.out.printf("克隆对象的loc：%s\n", p2.loc);

        System.out.printf("克隆对象的loc和原对象的loc是否==？ %s\n", p1.loc == p2.loc);
        p1.loc.street = "sh";
        System.out.printf("修改原对象loc的String类型变量street=sh后，p2的loc为：%s\n",p2.loc);

        p1.loc.street.replace("sh", "sz");
        System.out.printf("p1.loc.street修改后，不影响p2.loc.street。p2的loc为：%s\n",p2.loc.street);
    }
}

class Person implements Cloneable {
    int age = 8;
    int score = 100;

    Location loc = new Location("bj", 22);
    @Override
    public Object clone() throws CloneNotSupportedException {
        Person p = (Person)super.clone();
        p.loc = (Location)loc.clone();
        return p;
    }
}

class Location implements Cloneable {
    String street;
    int roomNo;

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", roomNo=" + roomNo +
                '}';
    }

    public Location(String street, int roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
