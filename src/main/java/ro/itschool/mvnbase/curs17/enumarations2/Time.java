package ro.itschool.mvnbase.curs17.enumarations2;

public enum Time {
    HOUR {
        public double toHour(int timeUnit) {
            return timeUnit;
        }

        public double toMinute(int timeUnit) {
            return timeUnit * 60;
        }

        public double toSeconds(int timeUnit) {
            return timeUnit * 3600;
        }
    },
    MINUTE {
        public double toHour(int timeUnit) {
            return timeUnit / 60;
        }

        public double toMinute(int timeUnit) {
            return timeUnit;
        }

        public double toSeconds(int timeUnit) {
            return timeUnit * 60;
        }
    },
    SECONDS {
        public double toHour(int timeUnit) {
            return timeUnit / 3600;
        }

        public double toMinute(int timeUnit) {
            return timeUnit / 60;
        }

        public double toSeconds(int timeUnit) {
            return timeUnit;
        }
    };

    public abstract double toHour(int timeUnit);

    public abstract double toMinute(int timeUnit);

    public abstract double toSeconds(int timeUnit);
}
