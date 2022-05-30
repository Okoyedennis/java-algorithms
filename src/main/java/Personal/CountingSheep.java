package Personal;

public class CountingSheep {

    public static void main(String[] args) {
//        Boolean[] array1 = {true,  true,  true,  false,
//                true,  true,  true,  true ,
//                true,  false, true,  false,
//                true,  false, false, true ,
//                true,  true,  true,  true ,
//                false, false, true,  true };


        System.out.println();
    }


    public int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you

      int present = 0;
        for (Boolean arrayOfSheep : arrayOfSheeps) {
            if (arrayOfSheep == null) continue;
            if (arrayOfSheep) {
                present++;
            }
        }
        return present;
    }
}
