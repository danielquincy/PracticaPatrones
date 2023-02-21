package com.patterns.creationals.builder.caso1;

public class Manual{
        private int seats;
        private Engine engine;
        private boolean tripComputer;
        private boolean gps;

        public int getSeats() {
                return seats;
        }
        public void setSeats(int seats) {
                this.seats = seats;
        }

        public Engine getEngine() {
                return engine;
        }

        public void setEngine(Engine engine) {
                this.engine = engine;
        }

        public boolean getTripComputer() {
                return tripComputer;
        }

        public void setTripComputer(boolean tripComputer) {
                this.tripComputer = tripComputer;
        }

        public boolean getGps() {
                return gps;
        }

        public void setGps(boolean gps) {
                this.gps = gps;
        }

        @Override
        public String toString() {
                return "Manual{" +
                        "seats=" + seats +
                        ", engine=" + engine +
                        ", tripComputer=" + tripComputer +
                        ", gps=" + gps +
                        '}';
        }
}
