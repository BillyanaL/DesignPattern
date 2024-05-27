package sigelton;

import decorator.PlainTrainingProgram;
import decorator.TrainingProgram;

public class FitnessCenter {

    private static FitnessCenter instance;
    private TrainingProgram currentProgram;

    private FitnessCenter() {
        currentProgram = new PlainTrainingProgram();
    }

    public static  FitnessCenter getInstance() {
        if (instance == null) {
            instance = new FitnessCenter();
        }
        return instance;
    }

    public void setTrainingProgram(TrainingProgram program) {
        currentProgram = program;
    }

    public TrainingProgram getCurrentProgram() {
        return currentProgram;
    }
}
