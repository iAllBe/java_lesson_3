public class Main {

    public static void main(String[] args) {
        int[] myIntArray = {1,9,2,8,3,7};
        TaskOne taskone = new TaskOne();
        taskone.mergeSort(myIntArray, 6);
        System.out.println(myIntArray);

        TaskTwo tasktwo = new TaskTwo();
        tasktwo.deleteEven();

        TaskThree taskthree = new TaskThree();
        taskthree.findMinMaxAvgElements();
    }
}