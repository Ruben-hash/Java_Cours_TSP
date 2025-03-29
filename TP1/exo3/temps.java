class temps {
    public static void main(String[] args) {
        int heure = 23;
        int minutes = 20;
        int seconds = 5;

        System.out.println(heure + ":" + minutes + ":" + seconds);

        if (seconds == 59){
            seconds = 0;
            minutes++;
        }
        else {
            seconds++;
        }
        if (minutes == 59){

            minutes = 0;
            heure++;
        }
        else {
            minutes++;
        }
        if (heure == 23){
            heure = 0;
        }
        else{
            heure++;
        }

        System.out.println(heure + ":" + minutes + ":" + seconds);
    }
}