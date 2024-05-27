package decorator;


public class StrengthTraining extends TrainingProgramDecorator {

    private final String type;

    public StrengthTraining(TrainingProgram decoratedTraining, String type) {
        super(decoratedTraining);
        this.type = type;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with strength exercises.";
    }

    @Override
    public void perform() {
        super.perform();
        System.out.println("Performing " + type +  " exercise.");
    }

    @Override
    public void execute() {
        super.execute();
        System.out.println("Performing strength exercises.");
    }
}
