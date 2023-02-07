package decorator;

public class SeniorJavaDev extends DevDecorator {
    public SeniorJavaDev(Dev dev) {
        super(dev);
    }

    public String makeCodeReview() {
        return " SeniorDev make code review.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
