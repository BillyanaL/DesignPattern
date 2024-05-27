package observer;

public interface IInstructor {

    void addTrainee(ITrainee newTrainee);
    void removeTrainee(ITrainee trainee);
    void notifyTrainees();
}
