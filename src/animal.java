public class animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    public animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    @Override
    public String toString() {
        return "Animal : " + name + ", famille : " + family + ", age : " + age + ", mammifere : " + isMammal;
    }


}
