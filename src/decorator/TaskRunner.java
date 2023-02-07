package decorator;

public class TaskRunner {
    public static void main(String[] args) {
        Dev dev = new JavaTeamLead(new SeniorJavaDev(new JavaDev()));
        System.out.println(dev.makeJob());
    }
}
