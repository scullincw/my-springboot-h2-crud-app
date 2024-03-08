import java.net.*;
import java.io.*;
import java.nio.channels.*;

public class MavenWrapperDownloader {

    private static final String WRAPPER_VERSION = "0.5.6";
    private static final String MAVEN_USER_HOME = System.getProperty("user.home") + "/.m2";
    private static final String WRAPPER_JAR_PATH = MAVEN_USER_HOME + "/wrapper/dists";
    private static final String WRAPPER_JAR = "maven-wrapper.jar";
    private static final String WRAPPER_URL = "https://repo.maven.apache.org/maven2/io/takari/maven-wrapper/"
            + WRAPPER_VERSION + "/maven-wrapper-" + WRAPPER_VERSION + ".jar";

    public static void main(String args[]) {
        File jarFile = new File(WRAPPER_JAR_PATH, WRAPPER_JAR);
        if (!jarFile.exists()) {
            downloadWrapperJar();
        }
    }

    private static void downloadWrapperJar() {
        try {
            URL website = new URL(WRAPPER_URL);
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream(WRAPPER_JAR_PATH + "/" + WRAPPER_JAR);
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            fos.close();
            rbc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}