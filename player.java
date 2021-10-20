public class player {
    //The values of the object player
    public int posicion;

    // A method to add a new number to the previous position
    public void setPosicion(int posicion1) {
        this.posicion = this.posicion + posicion1;
    }
    // A method that returns the position of the player
    public int getPosicion() {
        return this.posicion;
    }
}
