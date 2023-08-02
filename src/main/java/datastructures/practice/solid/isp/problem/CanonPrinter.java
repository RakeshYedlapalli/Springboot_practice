package datastructures.practice.solid.isp.problem;

public class CanonPrinter implements IPrintsTasks{
    @Override
    public boolean printContent(String content) {
        return false;
    }

    @Override
    public boolean scanContent(String content) {
        return false;
    }

    @Override
    public boolean faxContent(String content) {
        return false;
    }

    @Override
    public boolean photoCopyContent(String content) {
        return false;
    }
}
