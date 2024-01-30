package Adding;

public class Test {
    public static void main(String[] args){
            Add add = new Add();
            Processing processing1 = new Processing();
            add.books = 5;
            add.pens = 5;
            int total = add.books + add.pens;
            if(true) {
            System.out.println(total);
        }

    }
}
