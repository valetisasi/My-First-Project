import java.util.ArrayList;
import java.util.Scanner;
public class ExerciseApp {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Exercise> exercises = new ArrayList<>();
        ArrayList<User> users = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu Options:");
            System.out.println("1. Add a new exercise");
            System.out.println("2. Display available exercises");
            System.out.println("3. Select an exercise to complete");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Option to add a new exercise
                    scanner.nextLine(); // Consume the newline character

                    System.out.print("Enter exercise name: ");
                    String exerciseName = scanner.nextLine();

                    System.out.print("Enter difficulty level (1-5): ");
                    int difficultyLevel = scanner.nextInt();

                    System.out.print("Enter exercise duration (in minutes): ");
                    int durationMinutes = scanner.nextInt();

                    scanner.nextLine(); // Consume the newline character

                    System.out.print("Enter exercise description: ");
                    String description = scanner.nextLine();

                    Exercise newExercise = new Exercise(exerciseName, difficultyLevel, durationMinutes, description);
                    exercises.add(newExercise);
                    System.out.println("Exercise added.");
                    break;

                case 2:
                    // Option to display available exercises
                    System.out.println("Available exercises:");
                    for (Exercise exercise : exercises) {
                        System.out.println(exercise.getName() + " (Difficulty: " + exercise.getDifficultyLevel() + ")");
                    }
                    break;

                case 3:
                    // Option to complete an exercise
                    if (exercises.isEmpty()) {
                        System.out.println("No exercises available.");
                        break;
                    }

                    System.out.print("Enter your name: ");
                    scanner.nextLine(); // Consume the newline character
                    String userName = scanner.nextLine();

                    User currentUser = null;
                    for (User user : users) {
                        if (user.getName().equals(userName)) {
                            currentUser = user;
                            break;
                        }
                    }

                    if (currentUser == null) {
                        currentUser = new User(userName, 0);
                        users.add(currentUser);
                    }

                    System.out.println("Select an exercise to complete:");
                    for (int i = 0; i < exercises.size(); i++) {
                        System.out.println((i + 1) + ". " + exercises.get(i).getName());
                    }
                    System.out.print("Enter the number of the exercise you want to complete: ");
                    int exerciseChoice = scanner.nextInt();

                    if (exerciseChoice >= 1 && exerciseChoice <= exercises.size()) {
                        Exercise selectedExercise = exercises.get(exerciseChoice - 1);
                        currentUser.completeExercise(selectedExercise);
                        System.out.println(userName + " completed " + selectedExercise.getName());
                    } else {
                        System.out.println("Invalid exercise selection.");
                    }
                    break;

                case 4:
                    // Option to exit
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-4).");
            }
        }
    }
}


