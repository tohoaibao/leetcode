import java.util.HashMap;
import java.util.Map;

public class EncodeAndDecodTinyURL {

    Map<String, String> map = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String tinyUrl = "http://tinyurl.com/" + longUrl.hashCode();
        map.put(tinyUrl, longUrl);
        return tinyUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }

    public static void main(String[] args) {
        EncodeAndDecodTinyURL obj = new EncodeAndDecodTinyURL();
        String url = "https://github.com/tohoaibao";
        String s1 = obj.encode(url);
        String s2 = obj.decode(s1);
        System.out.println(s1);
        System.out.println(s2);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));