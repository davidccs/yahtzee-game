public class random {
    public static void main(String[] args){
        int randomNumber = (int) (Math.random()* 50);


        if (randomNumber < 25){
            System.out.println(randomNumber);
        } else if (randomNumber > 26 && randomNumber < 45) {
            System.out.println(randomNumber);
        } else {
            System.out.println(randomNumber);
            System.out.println();
        }
    }
}
