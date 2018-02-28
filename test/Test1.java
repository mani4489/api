/*package com.api.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.MessageFormat;
import java.util.Properties;

public class Test1 {
	
	
	private void accept(String req, String resp) {
	    try {
	        String localAddr = req.getLocalAddr();
	        Properties properties = EngineFactory.getPropeties();
	        if (properties.getProperty("hostname") != null) {
	            localAddr = properties.getProperty("hostname");
	        }
	        String path = "http://" + localAddr + ":" + req.getLocalPort()
	                + req.getContextPath();
	        InputStream is = getClass().getResourceAsStream(
	                "/com/ramussoft/jnlp/season-internet-client.jnlp");
	        ByteArrayOutputStream out = new ByteArrayOutputStream();
	        int r;
	        while ((r = is.read()) >= 0)
	            out.write(r);
	        String string = MessageFormat.format(new String(out.toByteArray(),
	                "UTF8"), path);
	        resp.setContentType("application/x-java-jnlp-file");
	        OutputStream o = resp.getOutputStream();
	        o.write(string.getBytes("UTF8"));
	        o.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/