package Tool;

	import java.io.IOException;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.net.URLConnection;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	public class Time_web {
	    public static void main(String[] args) {
	        //获取当前网络时间
	        String webUrl="http://www.baidu.com";//百度时间
	        String webTime=getNetworkTime(webUrl);
	        System.out.println("当前网络时间为："+webTime);
	    }
	    public static String getNetworkTime(String webUrl) {
	        try {
	            URL url=new URL(webUrl);
	            URLConnection conn=url.openConnection();
	            conn.connect();
	            long dateL=conn.getDate();
	            Date date=new Date(dateL);
	            SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-dd HH:mm");
	            return dateFormat.format(date);
	        }catch (MalformedURLException e) {
	            e.printStackTrace();
	        }catch (IOException e) {
	            // TODO: handle exception
	            e.printStackTrace();
	        }
	        return "";
	    }
	}
