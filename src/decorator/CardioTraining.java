package decorator;

public class CardioTraining extends TrainingProgramDecorator {

    private final int duration;

    public CardioTraining(TrainingProgram decoratedTraining, int cardioDuration) {
        super(decoratedTraining);
        this.duration = cardioDuration;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with cardio exercises.";
    }

    @Override
    public void perform() {
        super.perform();
        System.out.println("Performing cardio training for " + duration + " minutes.");

    }

    @Override
    public void execute() {
        super.execute();
        System.out.println("Performing cardio exercises.");
    }


}
