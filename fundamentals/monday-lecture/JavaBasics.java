public class JavaBasics {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String firstName = "Bobby";
        String lastName = "Brown";
        System.out.println(firstName + " " + lastName);
        int intAge = -54;
        Integer age = -54;
        boolean isBald = true;
        double weight = 175.23;
        char grade = 'F';
        System.out.println(
                "Name: " + firstName + " " + lastName +
                        "\n" + "age:" + intAge +
                        "\n" + "weight:" + weight +
                        "\n" + "is bald:" + isBald +
                        "\n" + "grade:" + grade);
        System.out.println(Integer.MAX_VALUE);
        if(weight<100){
            System.out.println("You need to gain some weight");
        }
        String day= "monday";
        switch(day){
            case "monday": System.out.println("today is Monday!");
            break;
            case "tuesday": System.out.println("today is Tuesday!");
            break;
            case "wednesday": System.out.println("today is Wednesday!");
            break;
            case "thursday": System.out.println("today is Thursday!");
            break;
            case "friday": System.out.println("today is Friday!");
            break;
            case "saturday": System.out.println("today is Saturday!");
            break;
            case "sunday": System.out.println("today is Sunday!");
            break;
            default: System.out.println("thats not a weekday....");
            break;

        }
        
        String fullName=firstName.concat(lastName);
        System.out.println("full name length: "+(fullName.length()));
        System.out.println("full name: "+fullName);

        String greeting=String.format("Hi %s, you are %d years old.",fullName,age);
        System.out.println(greeting);

        String firstName1="Martha";
        String firstName2=new String("Martha");
        System.out.println(firstName1==firstName2); //comes back as false
        System.out.println(firstName1.equals(firstName2));

        String stringNum="23";
        int intNum=23;
        // if(intNum.equals(stringNum)){ //cannot compare strings and ints

        // }

    }
}

