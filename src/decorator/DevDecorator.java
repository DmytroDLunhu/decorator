package decorator;

public class DevDecorator implements Dev {
    Dev dev;

    public DevDecorator(Dev dev) {
        this.dev = dev;
    }

    @Override
    public String makeJob() {
        return dev.makeJob();
    }
}
