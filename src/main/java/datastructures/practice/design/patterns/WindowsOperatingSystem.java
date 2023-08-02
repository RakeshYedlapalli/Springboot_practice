package datastructures.practice.design.patterns;

public class WindowsOperatingSystem extends OperatingSystemFactory{

    WindowsOperatingSystem(String version, String value) {
        super(version, value);
    }

    @Override
    public void createDirectory() {
        System.out.println("Windos Directory is created");
    }

    @Override
    public void moveFile() {
        System.out.println("Windos MOved the directory");
    }
}
