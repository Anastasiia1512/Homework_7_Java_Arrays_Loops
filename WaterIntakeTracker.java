public class WaterIntakeTracker {
    public static void main(String[] args) {
        int[] waterIntake = {3, 1, 4, 2, 0, 5, 2};
        int всьогоВоди = 0;
        int i = 0;

        while (i < waterIntake.length) {
            if (waterIntake[i] >=2) {
                всьогоВоди += waterIntake[i];
            }
            i++;
        }
        System.out.println("Загальна кількість випитих склянок води за тиждень"+всьогоВоди);
    }
}
