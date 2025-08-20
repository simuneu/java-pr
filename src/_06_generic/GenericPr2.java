package _06_generic;

class Pair<k, v>{
    private k key;
    private v value;

    public Pair(k key, v value){
        this.key = key;
        this.value= value;
    }

    public k getKey() {
        return key;
    }

    public v getValue() {
        return value;
    }

    @Override
    public String toString(){
        return "key : "+key+", value : "+value;
    }
}

public class GenericPr2 {
    public static void main(String[] args) {
        Pair<String, Integer>  p1 = new Pair<>("One", 1);
        Pair<Integer, String>  p2 = new Pair<>(2, "Two");
        System.out.println(p1);
        System.out.println(p2);

    }
}
