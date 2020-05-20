package Ls20;

public class Ls19_03_String01 {

    //23. The web is built with HTML strings like "Yay"
    // which draws Yay as italic text. In this example, the "i" tag makes
    // and which surround the word "Yay".
    // Given tag and word strings, create the HTML string
    // with tags around the word, e.g. "Yay".
    //
    // makeTags("i", "Yay") → "<i>Yay</i>"
    // makeTags("i", "Hello") → "<i>Hello</i>"
    // makeTags("cite", "Yay") → "<cite>Yay</cite>"

    public static String makeTags(String htmlTag, String content) {
        char startTag = '<';
        char endTag = '>';
        char slash = '/';

        String startHtmlTag = startTag + htmlTag + endTag;
        String endHtmlTag = startTag + htmlTag + slash + htmlTag + endTag;

        String result = startHtmlTag + content + endHtmlTag;
        //String result = "" + startTag + htmlTag + endTag + content + startTag + htmlTag + slash + htmlTag + endTag;
        return result;
    }
}
