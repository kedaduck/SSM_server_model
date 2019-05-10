/**
 * @ClassName Test
 * @Auther Leoren
 * @Date 2019/4/5 16:53
 * @Desc :
 * @Version v1.0
 **/

public class Test {

    public static void main(String[] args) {
        String photes = "4b695d8997ff461d8c5e8182d3af16bc.jpg;f74bec24639cf87cc21e178a3f3bf3e3.jpg;f1c6127c271082c0a952c60dcb7c482a.jpg;b3500f14550a2325bb87bcb5b103b613.jpg;77a01d00a16fe0d5a7453a7ac8dac2bb.jpg;";

        String[] photeStrs = photes.split(";");

        for(int i = 0; i < photeStrs.length; i++){
            System.out.println(photeStrs[i]);
        }
        System.out.println(photeStrs.length);



    }

}
