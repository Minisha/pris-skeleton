# pris-skeleton


private void processCommand() throws Exception{
        Process p;
        try {
             p = Runtime.getRuntime().exec("/Users/minisha/Desktop/try/pris-skeleton/dbspris/src/main/resources/scptest.sh");

            p.waitFor();
            BufferedReader reader=new BufferedReader(new InputStreamReader(
                    p.getInputStream()));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


#!/usr/bin/expect
        spawn scp /Users/minisha/Desktop/try/pris-skeleton/test.txt root@127.94.0.2:/home
        set pass "screencast"
        expect {
        password: {send "$pass\r"; exp_continue}
                  }




package sg.com.dbs.pris;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.optional.ssh.Scp;

public class SCPT {


    public static void main(String[] args) {

        org.apache.tools.ant.taskdefs.optional.ssh.Scp scp = new Scp();
        int portSSH = 22;
        String srvrSSH = "192.168.0.105";
        String userSSH = "root";
        String pswdSSH = new String ( "screencast") ;
        String localFile = "/Users/minisha/Desktop/try/pris-skeleton/test.txt";
        String remoteDir = "/home/";

        scp.setPort( portSSH );
        scp.setLocalFile( localFile );
        scp.setTodir( userSSH + ":" + pswdSSH + "@" + srvrSSH + ":" + remoteDir );
        scp.setProject( new Project() );
        scp.setTrust( true );
        scp.execute();
    }
}
