public class MyListTest {
    public static void main(String[] args) {
        MyList num=new MyList();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(4);
        System.out.println("Element 2: "+num.get(1));
        System.out.println("Element 3: "+num.get(2));
        System.out.println("Element 4: "+num.get(3));
        System.out.println("Element 5: "+num.get(4));
    }
}
