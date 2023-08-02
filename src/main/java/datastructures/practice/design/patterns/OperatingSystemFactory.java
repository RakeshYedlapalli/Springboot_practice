package datastructures.practice.design.patterns;

public abstract class OperatingSystemFactory {
    private String version;
    private String value;

    OperatingSystemFactory(String version, String value) {
        this.version = version;
        this.value = value;
    }


    public abstract void createDirectory() ;

    public  abstract void moveFile() ;
}
