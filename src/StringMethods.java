public class StringMethods {

    public static void main(String[] args) {

        String birthDate = "02/17/1999";
        int startingIndex = birthDate.indexOf("1999");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(0,2));

        String newDate = String.join("/","02", "17", "1999");
        System.out.println("newDate = " + newDate);

        newDate = "02" + "/" + "17" + "/" + "1999";
        System.out.println("newDate = " + newDate);

        // this is called method chaining, String methods can be written this way
        // BECAUSE they return strings
        newDate = "02".concat("/").concat("17").concat("/")
                .concat("1999");
        System.out.println("newDate = " + newDate);

        System.out.println(newDate.replace('/','-'));
        System.out.println(newDate.replace("9","00"));

        System.out.println(newDate.replaceFirst("/","-"));
        System.out.println(newDate.replaceAll("/","---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
}
