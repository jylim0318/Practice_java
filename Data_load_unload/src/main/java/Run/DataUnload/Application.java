package Run.DataUnload;

import FileDTO.Power_usageDTO;

import java.io.*;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // 객체 선언부
        //BufferedReader br = null;
        Scanner sc = new Scanner(System.in);

        int cnt = 0; //파일을 읽은 횟수

        // 입력부
        System.out.println("경로명을 입력해주세요(파일명 포함):");
        String targetFilePath = sc.nextLine();



        try(BufferedReader br = new BufferedReader(new BufferedReader(
                new InputStreamReader(new FileInputStream(targetFilePath), Charset.forName("MS949"))))) {

            String readLine = "";

            while ((readLine = br.readLine()) != null) {
                if(cnt != 0 && (readLine.length() != 0) ){

                    String [] temp_arr = new String[readLine.length()];

                    temp_arr = readLine.split(",");

                    Power_usageDTO powerdto = new Power_usageDTO();

                    powerdto.setBase_date(LocalDate.parse(temp_arr[0]));
                    powerdto.setBase_hour(temp_arr[1]);
                    powerdto.setHq_name(temp_arr[2]);
                    powerdto.setPower_mwh(Integer.parseInt(temp_arr[3]));
                    powerdto.setCust_cnt(Integer.parseInt(temp_arr[4]));

                    System.out.println(powerdto.toString());
                    System.out.println(readLine);

                }
                cnt++;
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
