package decorator;

import strategy.IExercise;

public interface TrainingProgram {

    String getDescription();

    void perform();

    void addExercise(IExercise exercise);
    void execute();


}
