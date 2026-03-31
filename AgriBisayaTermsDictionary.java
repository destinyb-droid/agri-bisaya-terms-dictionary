
import java.util.Scanner;

public class AgriBisayaTermsDictionary {

    static String[] data = {

            "Balsa: Gina guyod sa karabaw hakotanan sa mga na harvest",
            "Sako: Butangan sa na harvest",
            "Irigasyon: (noun)Sistema sa paghatag og tubig sa tanom",
            "Peste: (noun) Mga insekto nga makadaot sa tanom",
            "Hakot: Pagdala sa ani gikan sa uma",
            "Kamalig: Bodega o tig-imbakan sa ani",
            "Binhi: Liso nga itanom",
            "Pugas: Pagtanom sa binhi",
            "Dilig: Paghatag ug tubig sa tanom",
            "Pag-ani: Pagkuha sa bunga o tanom human sa pagtubo",
            "Tambal: Kemikal o natural nga paagi sa pagpanalipod sa tanom",
            "Pala: Gamit sa pagkalot o pagbalhin sa yuta",
            "ugat: parte sa tanom nga naa sa ilawom sa yuta, mosuyop ug sustansya",
            "bunga: resulta sa tanom, mao na ang kasagaran anihon o kan-on",
            "yuta: kung asa itanom ang mga tanom",
            "Pestisidyo: (noun) kemikal nga mopatay sa peste",
            "sanga: mga parte nga nagagikan sa tangkay, nagaalalay sa dahon, bulak, ug bunga",
            "Gamas: pagputol sa hinog nga tanom sama sa humay",
            "Daro: (noun) gamit sa pagbungkal sa yuta",
            "Daro: (verb) proseso sa pag-andam sa yuta para tamnan.",
            "Binhi: (noun) liso nga itanom.",
            "Ani: (noun) bunga o resulta sa tanom.",
            "Sagbot: tanom nga makadaot sa uma",
            "Panglimpyo: (noun)  pagtangtang sa mga damo ug hugaw sa uma.",
            "Panglimpyo: (verb) pagtangtang sa mga dili kinahanglanon nga mga tanom ug hugaw.",
            "Sustansya: (noun) Mga sangkap sa abono o yuta nga naghatag og kusog sa tanom.",
            "adlaw: tinubdan sa kahayag, importante para sa pagtubo sa tanom.",
            "hangin: hangin nga makatabang sa paglupad sa abog o binhi, ug pagginhawa sa tanom.",
            "ting-init: panahon nga init ug gamay ang ulan, kinahanglan sige og dilig ang mga tanom.",
            "lugar: pagpili ug tanoman nga adunay igo nga kahayag sa adlaw, depende sa klase sa tanom nga imong itanom",
            "kalot: hulma ug yuta aron mahimo kini nga humok ug dali makuha ang tubig",
            "Abono: organikong sagol aron mapauswag ang kalidad sa yuta ug mahatagan og sustansya ang tanom",
            "Anihon: (verb) proseso sa pagkuha sa bunga sa tanom.",
            "Sagbot: (noun) mga tanom nga dili gusto ug makadaot sa tanom.",
            "Sagbot: (verb) pagtangtang sa mga sagbot sa uma.",
            "Humay: (noun) tanom nga mahimong bugas.",
            "Mais: (noun) tanom nga ginakaon ug gigamit sa lain-laing produkto",
            "Tugway: Pag-higot sa hayop sa sagbotan para makakaon.",
            "Batog: Ang pag-atog o pag-pahuway sa mga manok sa sanga.",
            "Tangkal: Balay sa baboy o manok nga gama sa kawayan.",
            "Bahog: Ang paghatag og pagkaon sa mga binuhing hayop.",
            "Kural: Koral nga kawayan para dili makagawas ang mga baka.",
            "Bangka: Gamay nga sakayan nga naay katig.",
            "Katig: Kawayan sa kilid sa bangka para dili matuwang.",
            "Bugsay: Kahoy nga gamit para padaganon ang bangka.",
            "Pasol: Kagamitan nga naay taga ug nylon para sa isda.",
            "Pukot: Mata-mata nga baling para makuha ang pundok sa isda.",
            "Gulay: tanom nga ginakaon ang dahon, bunga, o gamot",
            "Prutas: tanom nga nagaproduce og fruit nga pwede kaonon",
            "Irigasyon: sistema sa paghatag og tubig sa tanom",
            "Hakot: pagdala sa ani gikan sa uma",
            "Tangkay: parte sa tanom nga nagasuporta sa dahon ug bunga",
            "Dahon: parte sa tanom nga nagahimo og photosynthesis",
            "Humay-harvest: proseso sa pagkuha sa humay",
            "Ilang-ilang: tanom nga ginagamit sa panghalad o decorative purposes",
            "Tangkahan: lugar sa fishpond para sa pagpananom sa isda"
    };

    // chloey magbutay
    // prompt retry
    public static void retryMessage() {
        System.out.println("Palihug sulayi og usab.");
    }

    //reysel andos
    // method to check if input is all uppercase/lowercase letters
    public static boolean isUpperCaseLowerCaseOnly(String input) {
        // check if input matches uppercase/lowercase letters (A-Z) and spaces
        return input.matches("[A-Z ]+");
    }

    // Michaella Angel Aure
    // method to check if input is too short
    public static boolean isTooShort(String input) {
        // returns true if input has less than 3 characters
        return input.trim().length() < 3;
    }

    // Destiny D. Bicoy
    // method counts how many characters the user entered
    public static int countCharacters(String input) {
        return input.length();
    }

    // Noreen Sincero
// method to check if input is all lowercase letters
    public static boolean isLowerCaseOnly(String input) {
        // check if input matches lowercase letters (a-z) and spaces
        return input.matches("[a-z ]+");
    }

    // Vertudazo, Denchel
// details purposes rani, feedback2 lang
    public static void feedbackMethod(String input) {
        // kung empty ang input, kani ang mo execute
        if (isInputEmpty(input)) {
            System.out.println("Input is empty. Please enter a valid term.");

        }
        // kung mubo ra ang input, kani ang mo execute
        else if (isTooShort(input)) {
            System.out.println("Input is too short. Please enter a valid term.");
            // kung valid ang input, kani ang mo execute
        } else {
            System.out.println("Input is valid. Proceeding with search...");
        }
    }

    // Therese Gayle M. Duay
    // mag print og random term after mag search ang user (random facts)
    public static void printRandomTerm() {
        // mag pick og random number gikan sa array para mao ang i print frufru
        int randomIndex = (int) (Math.random() * data.length);

        // get the random word then i split ang term og definition gamit colon ":"
        String[] parts = data[randomIndex].split(":", 2);

        if (parts.length<2) return;

        String term = parts[0];
        String definition = parts[1];

        // print random term + definition
        System.out.println("\nDid you know? " + term + " - " + definition);

    }

    // Danica Codilla
     // to count how may times a letter appears in the input
    public static int countLetter(String input, char letter) {
        int count = 0;
        String lower = input.toLowerCase();
        char target = Character.toLowerCase(letter);

        for (int i = 0; i < lower.length(); i++) {
            if (lower.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    //Hannah Gause
    // this method just takes what the user typed and then flips the letters backward
    public static String reverseInput(String input) {
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return reversed;
    }


    // RAMALYN JAHARA B. CAMAGAL
    // Fuzzy Search logic para sa "Did you mean?" feature
    public static String getSuggestion(String input) {
        if (input.length() < 3) return null;
        String prefix = input.substring(0, 3).toLowerCase();
        for (String entry : data) {
            String word = entry.split(":")[0].trim();
            if (word.toLowerCase().startsWith(prefix)) {
                return word;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice = "yes";

        while (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter Bisaya Agriculture Term: ");
            String term = input.nextLine();
            System.out.println("=======================================\n");
            System.out.println("\n----------- Input Analysis ----------");
            System.out.println(checkFirstLetterType(term));
            System.out.println("Number of characters: " + countCharacters(term));
            System.out.println("Reversed input: " + reverseInput(term));
            System.out.println("Letter 'a' appears: " + countLetter(term, 'a'));
            System.out.println("---------------------------------------\n");


            // Call feedbackMethod to validate the input
            feedbackMethod(term);
            System.out.println();
            if (isTooShort(term)) {
                System.out.println("Mubo ra kaayo ang input!");
                retryMessage();
                continue;
            }

            boolean found = false;
            //loops through the ARRAY. and it checks all entries (if the typed term is on the list terms or not)
            for (int i = 0; i < data.length; i++) {

                /**Quincie Rojas
                 -The purpose of split is to cut the string into two pieces at the colon (:)
                 **/
                String[] parts = data[i].split(":");

                //This is for bisaya term.
                String word = parts[0];
                //While this is for the meaning.
                String definition = parts[1];

                if (word.equalsIgnoreCase(term)) {
                    System.out.println("\nDefinition: " + definition);
                    found = true;
                    System.out.println();
                    printRandomTerm(); // mag print lang siya if tama ang gi search sa user
                    break;
                }
            }
            // RAMALYN JAHARA B. CAMAGAL
            if (!found) {
                String suggestedWord = getSuggestion(term);
                if (suggestedWord != null) {
                    System.out.println();
                    System.out.print("Wala nakit-an. Did you mean '" + suggestedWord + "'? (yes/no): ");
                    String confirm = input.nextLine().trim();

                    if (confirm.equalsIgnoreCase("yes")) {
                        for (int i = 0; i < data.length; i++) {
                            String word = data[i].split(":")[0].trim();
                            if (word.equalsIgnoreCase(suggestedWord)) {
                                System.out.println("Definition: " + data[i].split(":")[1].trim());
                                found = true;
                                printRandomTerm();
                                break;
                            }
                        }
                    }
                }
                if (!found) {
                System.out.println("Wala pa na dria nabutang bay.,. Salamat ha!");
                retryMessage();
              }
        }
            System.out.print("Search again? (yes/no): ");
            choice = input.nextLine();
            System.out.println();
        }
        System.out.println("Salamat sa paggamit!");

    }

    // ivy kate piga
    // method to check if the user input is empty
    public static boolean isInputEmpty(String input) {
        return input.trim().isEmpty();
    }

    // Vince Denisse A. Pandac
// kini nga method kay mo ihap kung pila ka definitions ang naa sa isa ka term sa dictionary
    public static int countDefinitions(String term) {
        int count = 0;

        for (int i = 0; i < data.length; i++) {
            String[] parts = data[i].split(":");
            String word = parts[0];

            if (word.equalsIgnoreCase(term)) {
                count++;
            }
        }

        return count;
    }

    // Gwen Icy M. Arbitrario
// kani na method kay mo check kung ang first letter kay vowel ba or consonant
    public static String checkFirstLetterType(String input) {
        if (input == null|| input.trim().isEmpty()){
            return "No input.";
        }
        // kuhaon dri ang first letter ug himuong lowercase
        char first = Character.toLowerCase(input.charAt(0));

        // echeck kung vowel
        if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') {
            return "Vowel ang first letter.";
        } else {
            return "Consonant ang first letter.";
        }
    }

    //Rizza Jane Q. Buhat
//Kani nga method kay mo display tanan terms sa dictionary
    public static void displayAllTerms() {
        System.out.println("\nMga Terms sa Dictionary:");
        for (int i = 0; i < data.length; i++) {
            String[] parts = data[i].split(":");
            System.out.println("- " + parts[0]);
        }
    }

    //Antonette S. Solianon
//Kini nga method kay GIHIMO ARON MAKUHA ANG KAHULOGAN SA TERMINO
    public static String getTermMeaning(String termino) {
        // I-convert sa lowercase para dali ma-match
        String cleanTerm = termino.toLowerCase().trim();

        //Pangitaon sa tanan entry
        for (String entry : data) {
            String entryTerm = entry.split(":")[0].trim().toLowerCase();
            if (entryTerm.equals(cleanTerm)) {
                // Ibawi ang kahulogan
                return "kahulogan: " + entry.split(":")[1].trim();
            }
        }
        return "Wala'y nakit-an nga termino nga '" + termino + "'!";
    }

    // Kristyl Ann M. Jimenez
// this method is to check if input contains numbers or speacial character
    public static boolean hasNumbersOrSymbols(String input) {
        // return true kung naay numero o simbolo, dili lang letra ug space
        return !input.matches("[A-Za-z]+");
    }
}

