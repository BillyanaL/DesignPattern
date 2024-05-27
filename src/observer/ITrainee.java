package observer;

import decorator.TrainingProgram;

public interface ITrainee {

    void update(TrainingProgram trainingProgram);

    void setTrainingProgram(TrainingProgram trainingProgram);
}
