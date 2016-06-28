/**
 * Created by macaque on 26.06.2016.
 */
public class FromJSONConverter {

    public static void addressConverter(String list){

        String city;
        String street;
        int num;

        int firstchar = 0;
        int lastchar = 0;
        int comachar = 0;
        int d_dotchar = 0;

        String opensym = "{";
        String closesym = "}";
        String comasym = ",";
        String d_dotsym = ":";

        String part1_string;
        String part2_string;
        String part3_string;
        /*int opencount;
        int closecount;
        for (int i = 0; i <list.length()-1 ; i++) {
            if (list.substring(i,i+1).equals("{"){
                opencount++;
            }
            if (list.substring(i,i+1).equals("}")){
                closecount++;
            }
        } */
        for (int i = 0; i <list.length()-1 ; i++) {
            if (list.substring(i,i+1).equals(opensym)) {
                firstchar = i;
            }
            if (list.substring(i,i+1).equals(closesym)) {
                lastchar = i;
            }
            if (list.substring(i,i+1).equals(comasym)) {
                comachar = i;
            }
        }
        String address_json = list.substring(firstchar,lastchar);

        String[] split_list = address_json.split(",");
        part1_string = split_list[0];
        part2_string = split_list[1];

        for (int i = 0; i <part1_string.length()-1 ; i++) {
            if (part1_string.substring(i,i+1).equals(d_dotsym)){
                d_dotchar = i;
            }
            city = part1_string.substring(d_dotchar+3,part1_string.length()-1);
        }

        split_list = part2_string.split(",");
        part1_string = split_list[0];
        part1_string = split_list[1];

        for (int i = 0; i <part2_string.length()-1 ; i++) {

        }
    }

}
