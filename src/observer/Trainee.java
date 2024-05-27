package observer;

import decorator.TrainingProgram;

public class Trainee implements ITrainee {

    private final String firstName;
    private final String lastName;
    private TrainingProgram trainingProgram;

    public Trainee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void update(TrainingProgram trainingProgram) {

        this.trainingProgram = trainingProgram;
        printTheUpdate();
    }

    @Override
    public void setTrainingProgram(TrainingProgram trainingProgram) {
        this.trainingProgram = trainingProgram;
    }

    public void printTheUpdate(){
        System.out.println(firstName + " "+ lastName + ": Updated this program with: " +
                this.getTrainingProgram().getDescription());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public TrainingProgram getTrainingProgram() {
        return trainingProgram;
    }


}
