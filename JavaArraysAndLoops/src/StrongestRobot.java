public class StrongestRobot {
    public static void main(String[] args) {
        int[] weights = {300, 450, 200, 500, 350};
        int максимальнаВага = weights [0];
        int найсильнішийРобот = 0;

        for(int i = 1; i < weights.length; i++) {
            if (weights [i] > максимальнаВага) {
                максимальнаВага = weights [i];
                найсильнішийРобот = i;
            }
        }
        System.out.println("Найсильніший робот" + (найсильнішийРобот+1));
        System.out.println("максимальна вага" + (максимальнаВага));
    }
}
