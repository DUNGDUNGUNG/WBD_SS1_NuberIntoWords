import java.util.Scanner;

public class NumberIntoWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so ban can doc la");
        String number = sc.nextLine();
        //doc so tu 11 den 19 ;
        int num = Integer.valueOf(number);
        switch (num) {
            case 11:
                System.out.print("eleven");
                break;
            case 12:
                System.out.print("twelve");
                break;
            case 13:
                System.out.print("thirteen");
                break;
            case 14:
                System.out.print("fourteen");
                break;
            case 15:
                System.out.print("fifteen");
                break;
            case 16:
                System.out.print("sixteen");
                break;
            case 17:
                System.out.print("seventeen");
                break;
            case 18:
                System.out.print("eighteen");
                break;
            case 19:
                System.out.print("nineteen");
                break;
        }
        if (num > 10 && num < 20) {
            return;
        }
        //chuyen so thanh mang ky tu;
        char[] read = number.toCharArray();
        //quet mang doc tung chu mot
        for (int i = 0; i < read.length; i++) {
            if (read[i] == '0') {
                continue;
            }
            if (read.length >= 2 && i == read.length - 2) {

                switch (read[i]) {
                    case '1':
                        System.out.print("ten");
                        break;
                    case '2':
                        System.out.print("twenty" + "-");
                        break;
                    case '3':
                        System.out.print("thirty" + "-");
                        break;
                    case '4':
                        System.out.print("forty" + "-");
                        break;
                    case '5':
                        System.out.print("fifty" + "-");
                        break;
                    case '6':
                        System.out.print("sixty" + "-");
                        break;
                    case '7':
                        System.out.print("seventy" + "-");
                        break;
                    case '8':
                        System.out.print("eighty" + "-");
                        break;
                    case '9':
                        System.out.print("ninety" + "-");
                        break;
                }
            } else {
                switch (read[i]) {
                    case '0':
                        System.out.print("zero");
                        break;
                    case '1':
                        System.out.print("one");
                        break;
                    case '2':
                        System.out.print("two");
                        break;
                    case '3':
                        System.out.print("three");
                        break;
                    case '4':
                        System.out.print("for");
                        break;
                    case '5':
                        System.out.print("five");
                        break;
                    case '6':
                        System.out.print("six");
                        break;
                    case '7':
                        System.out.print("seven");
                        break;
                    case '8':
                        System.out.print("eight");
                        break;
                    case '9':
                        System.out.print("nine");
                        break;
                }
            }
            // cho so co 3 chu so
            if (read.length == 3) {
                if (i == 0) {
                    System.out.print("-" + "hundred " + "-");
                }
            }

        }
    }
}
