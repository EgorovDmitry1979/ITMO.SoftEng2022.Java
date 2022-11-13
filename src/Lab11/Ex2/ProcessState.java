package Lab11.Ex2;

public class ProcessState {
    public static final String State(Thread.State ts) {
        if (ts == Thread.State.BLOCKED)
            return "BLOCKED";
        else if (ts== Thread.State.NEW)
            return "NEW";
        else if (ts == Thread.State.RUNNABLE)
            return "RUNNABLE";
        else if (ts == Thread.State.TERMINATED)
            return "TERMINATED";
        return "WAITING";
    }
}
