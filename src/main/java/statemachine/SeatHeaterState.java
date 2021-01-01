package statemachine;

public enum SeatHeaterState {
    THREE {
        @Override
        SeatHeaterState next() {
            return SeatHeaterState.TWO;
        }
    },TWO {
        @Override
        SeatHeaterState next() {
            return SeatHeaterState.ONE;
        }
    },ONE {
        @Override
        SeatHeaterState next() {
            return SeatHeaterState.OFF;
        }
    },OFF{
        @Override
        SeatHeaterState next() {
            return SeatHeaterState.THREE;
        }
    };

    abstract SeatHeaterState next();
}
