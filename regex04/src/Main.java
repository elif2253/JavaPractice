import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String s = "in 1991 Oak released\t in 1996 it is renamed as java, Java JDK 1.0 released in 1996";
        System.out.println(s);
        System.out.println(s.replaceAll("^in", " at"));// buradaki ^ isareti sadece en bastaki
        //in kelimesini degistir demek ustelik in cümlenin en basında olmalı yoksa degistirilmez

        System.out.println(s.replaceAll("1996$", "X"));//buradaki $ cümlenin sondaysa degistir demek
        System.out.println(s.replaceAll("[in]", "X"));//i ve n gördugun yerlere x koy [] -> veya demek
        System.out.println(s.replaceAll("[Jj]ava", "X"));// J ve j harflerini X ile değiştir
        System.out.println(s.replaceAll("[0-9]", "Y"));//aralık belitmek icin 0 ve 9 arasındaki rakamalrı Y ye cevir
        System.out.println(s.replaceAll("\\d", "Y"));//üstteki ile aynı
        System.out.println(s.replaceAll("\\D", "Y"));//digit olmayanları y ye cevir

        String[] parts = s.split("\\s");//parçalara ayırmak için split kullanılır
        for (String part : parts)
            System.out.println(part);

        String text = " A sailor went to sea sea to what he could see see seee";
        System.out.println(text);
        System.out.println(text.replaceAll("se?", "X"));//0 veya 1
        System.out.println(text.replaceAll("se*", "X"));//0 veya daha fazla
        System.out.println(text.replaceAll("se+", "X"));//1 veya daha fazla
        System.out.println(text.replaceAll("se{2}", "X"));//2 tane olanları değiştir
        System.out.println(text.replaceAll("se{2,3}", "X"));//2 ve 3 dahil değiş
        System.out.println(text.replaceAll("se{2,}", "X"));//2 ve daha fazla değiş
        System.out.println(text.replaceAll("se[ea]{1,2}", "X"));//e veya a dan 1den 2ye değiş

        String str = "That spesific card which I've bought is 200USD";
        System.out.println(str.replaceAll("(USD|usd)", "\\$"));

        //PATTERN AND MATCHER LINESERIES
        String html = "<h1>My heading</h1><h2>Sub heading</h2><p>This is a paragraph</p><h2>Summary</h2><p>Here is the summary</p>";

        String regex = "<h2>";
        Pattern pattern = Pattern.compile(regex);//Bu string
        Matcher matcher = pattern.matcher(html);//Bu regular ex uyum sağlıyor mu

        System.out.println(matcher.matches());// Matches control eder true false gönderir
        // Matches metodunda tam olarak eşleşmesi gerekiyor bu haliyle false döne

       /* String regex = ".*<h2>.*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);

        System.out.println(matcher.matches());
        //Bu haliyle true döner tam bi eşleşme olmalı    */

        /*String regx = "(<h2>.*</h2>)";//greedy başka uyum sağlayan var mı diye bakmaya devam eder*/
        String regx = "(<h2>)(.*?)(</h2>)";//lazy ilk bulduğunu çıkartır ? işareti konularak lazy hale gelir
        Pattern pattern1 = Pattern.compile(regx);
        Matcher matcher1 = pattern1.matcher(html);

        matcher1.reset();
        while (matcher1.find()){
            System.out.println(matcher1.group(2));
        }

       /* int counter = 0;
        while (matcher.find()) {
            counter++;
            System.out.println(counter + " " + matcher.start() + " " + matcher.end());//indexlerini vericek baş ve son konumları
            */


    }
}