public class TimedExercise extends Exercise {
        private int timeRemaining;

        public TimedExercise(String name, int difficultyLevel, int durationMinutes, String description, int timeRemaining) {
            super(name, difficultyLevel, durationMinutes, description);
            this.timeRemaining = timeRemaining;
        }

        public int getTimeRemaining() {
            return timeRemaining;
        }

        public void decreaseTime(int seconds) {
            // Ensure that the timeRemaining does not become negative
            if (timeRemaining - seconds >= 0) {
                timeRemaining -= seconds;
            } else {
                timeRemaining = 0; // Prevent negative time remaining
            }
        }
    }

