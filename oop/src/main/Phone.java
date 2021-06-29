package main;

public class Phone {
    String number;
    String model;
    int weight;

    public Phone(String number, String model) {
        this.number=number;
        this.model=model;
    }

    public Phone(String number, String model, int weight) {
        this(number,model);
        this.weight=weight;
    }

    public Phone() {
    }


    public static void receiveCall (String nameCalling) {
        System.out.println("Звонит " + nameCalling);
    }

    public static void receiveCall (String nameCalling, String numberCalling) {
        System.out.println("Звонит " + nameCalling + ". Номер: " + numberCalling);
    }


    public String getNumber() {
        String numberCalling = this.number;
        return numberCalling;
    }

    public static void sendMessage(String...numbers) {
        System.out.println("Отправить сообщение на номера:");
        for(String number : numbers){
            System.out.println(number);

        }
    }

    public static void main (String[] args) {
        Phone phone1 = new Phone ("11111", "Samsung");
        Phone phone2 = new Phone ("22222", "Sony", 300);
        Phone phone3 = new Phone ("33333", "Nokia", 200);

        System.out.println("Number: " + phone1.number + ", model: " + phone1.model +", weight: " + phone1.weight);
        System.out.println("Number: " + phone2.number + ", model: " + phone2.model +", weight: " + phone2.weight);
        System.out.println("Number: " + phone3.number + ", model: " + phone3.model +", weight: " + phone3.weight);

        phone1.receiveCall("Анна");
        System.out.println("Звонок с номера: " + phone3.getNumber());

        phone2.receiveCall("Маша");
        System.out.println("Звонок с номера: " + phone1.getNumber());

        phone3.receiveCall("Иван", "85777");

        phone1.sendMessage("11112","33333","44444","55555");

        phone2.sendMessage("22222");

    }

}
