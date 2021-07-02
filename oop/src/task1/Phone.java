package task1;

public class Phone {
    private String number;
    private String model;
    private int weight;

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

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }



    public static void receiveCall (String nameCalling) {
        System.out.println("Звонит " + nameCalling);
    }

    public static void receiveCall (String nameCalling, String numberCalling) {
        System.out.println("Звонит " + nameCalling + ". Номер: " + numberCalling);
        System.out.println();
    }

    public static void sendMessage(String...numbers) {
        System.out.println("Отправить сообщение на номера:");
        for(String number : numbers){
            System.out.println(number);
        }
        System.out.println();
    }

    public static void main (String[] args) {
        Phone phone1 = new Phone ("11111", "Samsung");
        Phone phone2 = new Phone ("22222", "Sony", 300);
        Phone phone3 = new Phone ("33333", "Nokia", 200);
        Phone phone4 = new Phone();
        phone4.setNumber("44444");
        phone4.setModel("Sony");
        phone4.setWeight(200);

        System.out.println("Number: " + phone1.getNumber() + ", model: " + phone1.getModel() +", weight: " + phone1.getWeight());
        System.out.println("Number: " + phone2.getNumber() + ", model: " + phone2.getModel() +", weight: " + phone2.getWeight());
        System.out.println("Number: " + phone3.getNumber() + ", model: " + phone3.getModel() +", weight: " + phone3.getWeight());
        System.out.println("Number: " + phone4.getNumber() + ", model: " + phone4.getModel() +", weight: " + phone4.getWeight());

        phone1.receiveCall("Анна");

        phone2.receiveCall("Маша");

        phone3.receiveCall("Иван", "85777");

        phone1.sendMessage("11112","33333","44444","55555");

        phone2.sendMessage("22222");

    }

}
