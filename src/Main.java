public class Main {
    public static void main(String[] args) {
        //создаем массив из 5 сотрудников
        Workers [] persArray = new Workers[5];

        persArray[0] = new Workers("Albus Dumbledore", "rector", "albus@gmail.com", "442965278542", 1500, 85);
        persArray[1] = new Workers("Minerva Gonagall", "professor", "minerva@gmail.com", "442965874596", 1352, 78);
        persArray[2] = new Workers("Sybill Trelawney", "professor", "sybill@gmail.com", "442965784452", 875, 35);
        persArray[3] = new Workers("Severus Snape", "professor", "severus@gmail.com", "442965789321", 1285, 68);
        persArray[4] = new Workers("Remus Lupin", "professor", "remus@gmail.com", "442965548625", 1200, 39);

        //проходимся цикломи и выводим сотрудников старше 40
        for (int i = 0; i < persArray.length ; i++){
            if (persArray[i].Age > 40) {
                persArray[i].getInfo();
            }
        }
    }
}
