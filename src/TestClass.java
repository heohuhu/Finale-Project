public class TestClass implements LogPrintable{
    @Override
    public void printLog() {
        System.out.println("HI");
    }

    @Override
    public void printErrorLog() {
        System.out.println("Error");
    }
}
