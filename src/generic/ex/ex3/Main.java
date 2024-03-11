package generic.ex.ex3;

public class Main {
    public static void main(String[] args) {
        DataProcessor<String> stringDataProcessor = new StringDataProcessor();

        System.out.println(stringDataProcessor.processData("hello generics"));

        DataProcessor<Integer> numberProcessor = new NumberDataProcessor();
        System.out.println(numberProcessor.processData(100));
    }
}
