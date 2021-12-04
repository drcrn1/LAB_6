import java.io.*;

public class Lab6_var2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        BufferedWriter bw=null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("E:\\in.txt"),"utf-8"));
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("E:\\out.txt"),"utf-8"));

            String[] words;
            String pervoeSlovo = br.readLine();
            String w;
            while ((w = br.readLine()) != null) {
                words = w.split(" ");
                for(int i = 0; i < words.length; i++){
                    if(words[i].length()>pervoeSlovo.length()){
                        System.out.println(words[i]);
                        bw.write(words[i]);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        }
        finally{
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
