package task4;

public class Reader {
    String fullName;
    int cardNumber;
    String faculty;
   // Date birthDate;
    String birthDate;
    String phoneNumber;

    public Reader(String fullName, int cardNumber, String faculty, String birthDate, String phoneNumber) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public Reader() {

    }

    public String getFullName() {
        return fullName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void info() {
        System.out.println(
                "ФИО: " + fullName +
                ", номер читательского билета: " + cardNumber +
                ", Факультет: '" + faculty +
                ", Дата рождения: " + birthDate +
                ", Номер телефона: '" + phoneNumber
        );
    }


    public void takeBook(int bookCount) {
        System.out.println(fullName + " взял " + bookCount + " книг");
        System.out.println();
    }

    public void takeBook(String...bookItems) {
        System.out.println(fullName + " взял книги:");
        for(String book : bookItems) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook(Book...books) {
        System.out.println(fullName + " взял книги:");
        for(Book book : books) {
            System.out.println(book.getName());
        }
        System.out.println();
    }


    public void returnBook(int bookCount) {
        System.out.println(fullName + " вернул " + bookCount + " книг");
        System.out.println();
    }

    public void returnBook(String...bookItems) {
        System.out.println(fullName + " вернул книги: ");
        for(String book : bookItems) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(Book...books) {
        System.out.println(fullName + " вернул книги:");
        for(Book book : books) {
            System.out.println("\"" + book.getName() + "\" " + book.getAuthor());
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Reader reader1 = new Reader ("Иванов И.И.", 101, "ВМК","04.05.1991", "89010000001");
        Reader reader2 = new Reader ("Грачёва А.В.", 102, "Исторический","13.12.1998", "89020000002");
        Reader reader3 = new Reader ("Гордеев Я.Д.", 103, "Иностранных языков","30.06.2000", "89030000003");

        Reader[] readers = {reader1, reader2, reader2};

        Book book1 = new Book ("Мастер и Маргарита", "М.А.Булгаков");
        Book book2 = new Book ("Последнее желание", "А.Сапковский");
        Book book3 = new Book ("Бойцовский клуб", "Ч.Паланик");
        Book book4 = new Book ("Вино из одуванчиков", "Р.Брэдбери");

        Book[] books = {book1, book2, book3, book4};

        reader1.takeBook(7);
        reader3.takeBook("Effective Java", "Алгоритмы");
        reader2.takeBook(book1, book2);

        reader2.returnBook(5);
        reader1.returnBook("Я познаю мир. Динозавры", "Я познаю мир. Музыка");
        reader3.returnBook(book3, book4);

        printReaders(readers);
        printBooks(books);

    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            reader.info();
        }
        System.out.println();
    }


    private static void printBooks (Book[] books) {
            System.out.println("Список книг:");
            for (Book book : books) {
                book.info();
            }
            System.out.println();
    }

}
