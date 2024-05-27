import decorator.CardioTraining;
import decorator.PlainTrainingProgram;
import decorator.StrengthTraining;
import decorator.TrainingProgram;
import observer.Instructor;
import observer.Trainee;
import sigelton.FitnessCenter;
import strategy.*;

import java.util.ArrayList;
import java.util.List;

public class FitnessAppMain {
    public static void main(String[] args) {

        FitnessCenter fitnessCenter = FitnessCenter.getInstance();
        Instructor instructor = new Instructor("Ivan","Makedoski","");

        IExercise yoga = new YogaExercise();
        IExercise pilates = new PilatesExercise();
        IExercise planks = new PlankExercise();
        IExercise stretching = new StretchingExercise();

        TrainingProgram basicProgram1 = new PlainTrainingProgram();
        basicProgram1 = new CardioTraining(basicProgram1, 120);
        basicProgram1.addExercise(yoga);
        basicProgram1.addExercise(pilates);

        TrainingProgram basicProgram2 = new PlainTrainingProgram();
        basicProgram2 = new StrengthTraining(basicProgram2,"Agile Strength");
        basicProgram2.addExercise(planks);
        basicProgram2.addExercise(stretching);

        List<TrainingProgram> trainingProgramList = new ArrayList<>();
        trainingProgramList.add(new PlainTrainingProgram());
        trainingProgramList.add(basicProgram1);
        trainingProgramList.add(basicProgram2);

        Trainee trainee1 = new Trainee("Kiro","Krasimirov");
        Trainee trainee2 = new Trainee("Sara","Malinova");
        Trainee trainee3 = new Trainee("Alexsandra","Qneva");

        instructor.addTrainee(trainee1);
        instructor.addTrainee(trainee2);
        instructor.addTrainee(trainee3);

        fitnessCenter.setTrainingProgram(trainingProgramList.get(0));

        //Инструкторът избира и променя тренировъчния режим, като уведомява всички трениращи
        instructor.setCurrentTrainingProgram(trainingProgramList.get(0));

        System.out.println();

        //трениращият избира подходящата за него като променя тренировъчна програма
        trainee1.update(basicProgram2);
        System.out.println("This program include:");
        basicProgram2.execute();


    }
}
