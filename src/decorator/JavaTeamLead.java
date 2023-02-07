package decorator;

public class JavaTeamLead extends DevDecorator {
    public JavaTeamLead(Dev dev) {
        super(dev);
    }

    public String sendReport() {
        return " TeamLead send report to the team manager.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendReport();
    }
}
