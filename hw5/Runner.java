public class Runner {


    public void runner() {
        MyList<Long> myList = new MyList<>();
        myList.addArgument(45L);
        myList.addArgument(425L);
        myList.addArgument(412L);
        myList.addArgument(1L);
        myList.addArgument(0L);
        
        System.out.println("Largest value is: " + myList.getMax(myList.getList()));
        System.out.println("Smallest value is: " + myList.getMin(myList.getList()));
    }
}
