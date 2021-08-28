class ConditionalStatement {
    public static void main(String[] args) {
        int age = 20;
        if (age > 20) {
            System.out.println("Взрослый ");
        }

        boolean isMale = false;
        if (isMale) {
            System.out.println("Мужчина ");
        }
        if (!isMale) {
            System.out.println("Не мужчина ");
        }

        double height = 1.55;
        if (height < 1.80) {
            System.out.println("Не годен в армию ");
        } else {
            System.out.println("Годен в армию ");
        }

        char firstLetterName ='M';
        if (firstLetterName == 'M') {
            System.out.println("Меня зовут Micle ");
        } else if (firstLetterName == 'I') {
            System.out.println("Меня зовут Ivan ");
        }
    }
}