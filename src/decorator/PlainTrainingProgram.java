package decorator;

import strategy.IExercise;

import java.util.ArrayList;
import java.util.List;

public class PlainTrainingProgram implements TrainingProgram {

    List<IExercise> exercises = new ArrayList<>();

    @Override
    public String getDescription() {
        return "Basic Training program";
    }

    @Override
    public void perform() {
        System.out.println("Performing Plain Training Program");
    }

    @Override
    public void addExercise(IExercise exercise) {
        exercises.add(exercise);
    }

    @Override
    public void execute() {

        for (IExercise exercise : exercises) {
            exercise.perform();
        }

    }
}
