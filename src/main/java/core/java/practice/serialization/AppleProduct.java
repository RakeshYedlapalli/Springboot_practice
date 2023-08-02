package core.java.practice.serialization;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class AppleProduct implements Serializable {

    private static final long serialVersionUID = 12345675654L;

    public String headphonePort;
    public String thunderboltPort;
}
