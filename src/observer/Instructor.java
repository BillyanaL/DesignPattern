package observer;

import decorator.TrainingProgram;
import observer.ITrainee;

import java.util.ArrayList;
import java.util.List;

public class Instructor {

    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phone;

    private TrainingProgram currentTrainingProgram;
    private List<ITrainee> trainees;


    public Instructor(String firstName,String lastName,String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

        this.trainees = new ArrayList<>();
    }

    public void addTrainee(ITrainee newTrainee){
        this.trainees.add(newTrainee);

    }

    public void removeTrainee(ITrainee trainee){
        this.trainees.remove(trainee);

    }
    public void notifyTrainees(){

        for (ITrainee trainee : this.trainees) {
            trainee.update(currentTrainingProgram);
        }
    }

    public TrainingProgram getCurrentTrainingProgram() {
        return currentTrainingProgram;
    }

    public void setCurrentTrainingProgram(TrainingProgram newTrainingProgram) {
        this.currentTrainingProgram = newTrainingProgram;
        System.out.println("New training program is available!");
        System.out.println("Notification for: ");
        this.notifyTrainees();
    }
}
