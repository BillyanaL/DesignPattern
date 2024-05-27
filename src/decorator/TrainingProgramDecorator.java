package decorator;

import strategy.IExercise;

public abstract class TrainingProgramDecorator implements TrainingProgram {

    protected TrainingProgram decoratedTraining;

    public TrainingProgramDecorator(TrainingProgram decoratedTraining) {
        super();
        this.decoratedTraining = decoratedTraining;
    }

    @Override
    public String getDescription() {
        return decoratedTraining.getDescription();
    }

    @Override
    public void perform() {
        this.decoratedTraining.perform();
    }

    @Override
    public void addExercise(IExercise exercise) {
        decoratedTraining.addExercise(exercise);
    }

    @Override
    public void execute() {
        decoratedTraining.execute();
    }


}
