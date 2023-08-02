package datastructures.practice.solid.isp.problem;

public class SumsungPrinter implements IPrintsTasks {
    @Override
    public boolean printContent(String content) {
        System.out.println("Print Content completed");
        return true;
    }

    @Override
    public boolean scanContent(String content) {
        System.out.println("Scan Content completed");
        return true;
    }

    @Override
    public boolean faxContent(String content) {
        System.out.println("Fax Content completed");
        return true;
    }

    @Override
    public boolean photoCopyContent(String content) {
        System.out.println("Photo Copy Content completed");
        return true;
    }

    public static void main(String[] args) {
        //IPrintsTasks iPrintsTasks =
    }
}
