public class player {
    //The values of the object player
    public int posicion;

    // Method to add a new number to the previous position
    public void setPosicion(int posicion1) {
        //If the sum of the dice and the position is more than 100, the player stays still
        if ((this.posicion + posicion1) > 100){
            System.out.println("You over passed the final square!");
        }
        else if (this.posicion < 100) {
            this.posicion = this.posicion + posicion1;
        }
    }
    // Method that returns the position of the player
    public int getPosicion() {
        return this.posicion;
    }

    //Method to roll the dice
    public void rollDice(){
        int random = (int)(Math.random() * 6) + 1;
        System.out.println("The dice rolled: " + random);
        this.setPosicion(random);
    }
}
