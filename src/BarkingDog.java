public class BarkingDog {
    public static void main(String[] args) {
        bark(true, 23);
    }
    public static boolean bark(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        else{
            if(barking == true && (hourOfDay < 8 || hourOfDay > 22)) {
                return true;
            }
            else if(barking == true && (hourOfDay > 8 || hourOfDay < 22)){
                return false;
            }
            else{
                return false;
            }
        }
    }
}
