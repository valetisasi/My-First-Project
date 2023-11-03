public class User {
         String name;
         int age;
         int exercisesCompleted;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
            this.exercisesCompleted = 0;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getExercisesCompleted() {
            return exercisesCompleted;
        }

        public void completeExercise(Exercise exercise) {
            // Increment the exercisesCompleted count when a user completes an exercise
            exercisesCompleted++;
        }
    }

