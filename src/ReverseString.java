
public class ReverseString {
    public static String reverseString(String text) {

        String reversed = "";

        for (int i = 0; i < text.length(); i++) {

            char nextChar = text.charAt(i);
            reversed = nextChar + reversed;
        }
        return reversed;
    }

    public static String replaceChar(String text) {

        String replaceChar = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '<') {
                replaceChar += 'e';
            } else {
                replaceChar += text.charAt(i);
            }
        }
        return replaceChar;
    }

    public static void main(String[] args) {
        String text = "\".<romr<v<N\" sa <man hcus htiW\n ,rood r<bmahc sih <voba tsub d<rutplucs <ht nopu tsa<b ro driB —rood r<bmahc sih <voba drib gni<<s htiw d<ss<lb saw t<y r<v< gni<b namuh gnivil on taht gni<<rga pl<h tonnac <w roF ;<rob ycnav<l<r <lttil—gnina<m <lttil r<wsna sti hguohT ,ylnialp os <sruocsid ra<h ot lwof ylniagnu siht d<ll<vram I hcuM\n\n\".<romr<v<N\" n<vaR <ht htouQ\n \"!<rohs nainotulP s’thgiN <ht no si <man yldrol yht tahw <m ll<T —<rohs ylthgiN <ht morf gnir<dnaw n<vaR tn<icna dna mirg yltsahG ,n<varc on <rus tra\" ,dias I \",uoht ,n<vahs dna nrohs <b ts<rc yht hguohT\",<row ti <cnan<tnuoc <ht fo muroc<d nr<ts dna <varg <ht yB ,gnilims otni ycnaf das ym gniliug<b drib ynob< siht n<hT";

        String replacedText = replaceChar(text);
        System.out.println(reverseString(replacedText));

    }
}